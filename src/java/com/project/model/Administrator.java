/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Mohapi
 */
@Entity
@Table(name="tblUsers")
@DiscriminatorValue("AdAdministratormin")
public class Administrator extends UserModel
{
    @Column (name="userIDNo")
    public long userIDNo;
    
    public Administrator(long userIDNo,String userName, String userFName, String useLName, String userAddress,
			long userAreaCode,String userPassword)
	{
		super( userName,userFName, useLName, userAddress, userAreaCode,userPassword);
		this.userIDNo = userIDNo;
		
	}

    /**
     * @return the userIDNo
     */
    public long getUserIDNo() {
        return userIDNo;
    }

    /**
     * @param userIDNo the userIDNo to set
     */
    public void setUserIDNo(long userIDNo) {
        this.userIDNo = userIDNo;
    }
    
}
