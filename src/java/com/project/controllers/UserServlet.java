/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.controllers;

import com.project.dao.UserImpldao;
import com.project.model.Renter;
import com.project.model.UserModel;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Mohapi
 */
@WebServlet("/ServletClass.ser")
public class UserServlet extends HttpServlet 
{

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Autowired
    UserImpldao users;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String userName = request.getParameter("userName");
        String useLName = request.getParameter("useLName");
        String userFName = request.getParameter("userFName");
        String userAddress = request.getParameter("userAddress");
        String code = request.getParameter("userAreaCode");
        long userAreaCode = Long.parseLong(code);
        String userPassword = request.getParameter("userPassword");
        
        UserModel user = new Renter(userName, userFName, useLName, userAddress, userAreaCode, userPassword);
        if(request.getParameter("saveUsers").equals("Save"))
        {
            users.addUsers(user);
        }
        request.setAttribute("students", user);
	RequestDispatcher dispatcher = request.getRequestDispatcher("UserFeedback.jsp");
	dispatcher.forward(request, response);
    }
}
