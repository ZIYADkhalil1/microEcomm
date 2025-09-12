package com.zzo.ecomm.services;

import com.zzo.ecomm.DTOs.UsersDTO;
import com.zzo.ecomm.entities.User;
import com.zzo.ecomm.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  
public class UserService {

    private final UserRepository userRepository;
    User user = new User();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public void addUser(UsersDTO usersDTO) {
    	
//    	Set first Name
    	user.setFirstName(usersDTO.getFirstName());
    	
//    	set last name
    	
    	user.setLastName(usersDTO.getLastName());
    	
//    	set Phone
    	
    	user.setPhone(usersDTO.getPhone());
    	
//    	set Email
    	
    	user.setEmail(usersDTO.getEmail());
    	
//    	set pass
    	
    	user.setPasswordHash(usersDTO.getPasswordHash());
    	
//    	set adress
    	
    	user.setAddressLine1(usersDTO.getAddressLine1());
    	
//    	add city
    	
    	user.setCity(usersDTO.getCity());
    	
//    	country
    	
    	user.setCountry(usersDTO.getCountry());
    	
    	user.setIsActive(true);
    	userRepository.save(user);
    }
}
