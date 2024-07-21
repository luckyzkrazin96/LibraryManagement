/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.controller;

import cmjd107.librarymanagement.dto.UserDto;
import cmjd107.librarymanagement.service.ServiceFactory;
import cmjd107.librarymanagement.service.custom.UserService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserController {
    
    UserService userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);
    
    public ArrayList<UserDto> getAllUsers() throws Exception {
        return userService.getAll();
    }
    
    public UserDto getUserbyName(String name) throws Exception {
        return userService.getUserbyName(name);
    }
}
