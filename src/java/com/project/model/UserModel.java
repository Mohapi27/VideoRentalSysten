/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Mohapi
 */
@Entity
@Table(name="tblUsers")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="userRole", discriminatorType = DiscriminatorType.STRING)
public abstract class UserModel implements Serializable
{

    /**
     *
     */
    @Id
    @Column(name="userName")
    public String userName;
    @Column(name="useLName")
    public String useLName;
    @Column(name="userFName")
    public String userFName;
    @Column (name="userAddress")
    public String userAddress;
    @Column (name="userAreaCode")
    public long userAreaCode;
    @Column (name="userPassword")
    public String userPassword;

    public UserModel() {
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the useLName
     */
    public String getUseLName() {
        return useLName;
    }

    /**
     * @param useLName the useLName to set
     */
    public void setUseLName(String useLName) {
        this.useLName = useLName;
    }

    /**
     * @return the userAddress
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * @param userAddress the userAddress to set
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * @return the userAreaCode
     */
    public long getUserAreaCode() {
        return userAreaCode;
    }

    /**
     * @param userAreaCode the userAreaCode to set
     */
    public void setUserAreaCode(long userAreaCode) {
        this.userAreaCode = userAreaCode;
    }

    /**
     * @return the userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
   public UserModel(String userName, String userFName, String useLName, String userAddress,
			long userAreaCode,String userPassword) {
		this.userPassword = userPassword;
		this.userName = userName;
		this.userFName = userFName;
		this.useLName = useLName;
		this.userAddress = userAddress;
		this.userAreaCode = userAreaCode;
	}
}
