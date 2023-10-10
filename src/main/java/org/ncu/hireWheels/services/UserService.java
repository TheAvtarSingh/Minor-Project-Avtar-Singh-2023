package org.ncu.hireWheels.services;

import org.ncu.hireWheels.entities.User;

public interface UserService {
//	Sign up
public String createUser(User user);
// Login
public User getUser(String email,String password); 
}
