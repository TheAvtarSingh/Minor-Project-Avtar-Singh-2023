package org.ncu.hireWheels.services;

import org.ncu.hireWheels.entities.User;
import org.ncu.hireWheels.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
//	Sign up

	@Override
	public String createUser(User user) {
		// TODO Auto-generated method stub
		 User existingUser = userRepository.findByEmailIgnoreCase(user.getEmail());

		    if (existingUser != null) { 
		        return "User with this email already exists.";
		    } else {
		        // User with the email does not exist, save the new user
		        userRepository.save(user);
		        return "User created successfully.";
		    }
		    
	}

//	Login
	
	
	@Override
	public User getUser(String email, String password) {
		 User user = userRepository.findByEmailIgnoreCaseAndPassword(email, password);
//		 If user not exists
		 if (user == null) {
		        System.out.println("User not Registered");
		        return null;
		    }
//		 If Password not matches
		 
		 if (!user.getPassword().equals(password)) {
		        System.out.println("Unauthorized User");
		        return null;
		    }
		 

	        // Authorised User
	        return user;
	}
	
	

}
