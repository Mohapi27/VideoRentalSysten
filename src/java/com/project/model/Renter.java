/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mohapi
 */
@Entity
@Table(name ="tblUsers")
@DiscriminatorValue("Renter")
public class Renter extends UserModel
{
    private static final long serialVersionUID = 1L;
	
    @OneToMany(mappedBy="userName",cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<DVDModel> dvdModel;

    public Renter() {
    }
	public Renter(String userName, String userFName, String useLName, String userAddress,long userAreaCode,String userPassword)
	{
		super( userName,userFName, useLName, userAddress, userAreaCode,userPassword);
	}
}
