/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dao.custom.impl;

import cmjd107.librarymanagement.dao.CrudUtil;
import cmjd107.librarymanagement.dao.custom.UserDao;
import cmjd107.librarymanagement.entity.UserEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class UserDaoImpl implements UserDao {

    @Override
    public String save(UserEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Update(UserEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
        ArrayList<UserEntity> userEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM user");
        while (rst.next()) {
            UserEntity entity = new UserEntity(rst.getString("UserId"), rst.getString("UserName"), rst.getString("Password"));
            userEntities.add(entity);
        }
        return userEntities;
    }

    @Override
    public UserEntity getUserbyName(String name) throws Exception{
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM user WHERE UserName = ?", name);
        if (rst.next()) {
            return new UserEntity(rst.getString("UserId"), rst.getString("UserName"), rst.getString("Password"));
        }
        return null;
    }

    


}
