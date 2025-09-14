package com.zzo.ecomm.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zzo.ecomm.DTOs.UsersDTO;
import com.zzo.ecomm.entities.User;
import com.zzo.ecomm.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  
public class UserService {

    private final UserRepository userRepository;
    private final ObjectMapper objectMapper;
    User user = new User();

    public UserService(UserRepository userRepository, ObjectMapper objectMapper) {
        this.userRepository = userRepository;

        // configure ObjectMapper once
        this.objectMapper = objectMapper.copy()
                .setSerializationInclusion(JsonInclude.Include.NON_NULL) // skip null fields
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); // ignore extra fields
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public User createUser(User user) {
    	return userRepository.save(user);
    }
    public void editUser(UsersDTO userDTO, long id) throws JsonMappingException {
    	var user = userRepository.findById(id)
    			.orElseThrow(()-> new RuntimeException("there is no user with the provided ID"));
    	objectMapper.updateValue(user, userDTO);
    	
    	userRepository.save(user);
    }
    
}
