/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.service.custom.impl;

import cmjd107.librarymanagement.dao.DaoFactory;
import cmjd107.librarymanagement.dao.custom.UserDao;
import cmjd107.librarymanagement.dto.UserDto;
import cmjd107.librarymanagement.entity.UserEntity;
import cmjd107.librarymanagement.service.custom.UserService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public String save(UserDto t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Update(UserDto t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserDto get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<UserDto> getAll() throws Exception {
        ArrayList<UserDto> userDtos = new ArrayList<>();

        ArrayList<UserEntity> userEntities = userDao.getAll();

        for (UserEntity userEntity : userEntities) {
            UserDto userDto = getUserDto(userEntity);
            userDtos.add(userDto);
        }
        return userDtos;
    }

    private UserDto getUserDto(UserEntity userEntity) {
        UserDto userDto = new UserDto(userEntity.getUserId(), userEntity.getUserName(), userEntity.getPassword());
        return userDto;
    }

    @Override
    public UserDto getUserbyName(String name) throws Exception {
        UserEntity userEntity = userDao.getUserbyName(name);
        if (userEntity != null) {
            return getUserDto(userEntity);
        }
        return null;
    }
}
