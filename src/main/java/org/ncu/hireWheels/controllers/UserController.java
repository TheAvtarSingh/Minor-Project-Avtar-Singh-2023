package org.ncu.hireWheels.controllers;
 
import org.ncu.hireWheels.entities.User;
import org.ncu.hireWheels.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hirewheels/v1")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping(path = "/adduser", consumes = { "application/json" })
	public ResponseEntity<?> addUser(@RequestBody User user) {
		String addedUser = userService.createUser(user);
		
		if(addedUser.equals("User created successfully.")) {
			return new ResponseEntity<>(addedUser,HttpStatus.CREATED);
				
		}else {
			return new ResponseEntity<>(addedUser,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
