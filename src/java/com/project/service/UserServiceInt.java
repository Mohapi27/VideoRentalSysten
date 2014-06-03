/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.service;

import com.project.model.UserModel;
import java.util.List;

/**
 *
 * @author Mohapi
 */
public interface UserServiceInt 
{
    public void addUsers(UserModel user);

    public List<UserModel> listUsers();
	
    public UserModel getUserModel(String userName);
	
    public void deleteEmployee(UserModel user);
}
