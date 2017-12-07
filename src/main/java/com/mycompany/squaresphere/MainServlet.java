/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.squaresphere;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sasha
 */
public class MainServlet extends HttpServlet { 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String reqAttribute = request.getParameter("radius");
       try{
        int radius = Integer.parseInt(reqAttribute);
        double square=4*Math.PI*radius*radius;
        double volume=4/3*Math.PI*radius*radius*radius;
               
        request.setAttribute("answer", "Плошадь сферы равна = " + square +"<br> Объём сферы равен = "+ volume);
      } catch (NumberFormatException exception) {
       request.setAttribute("answer", " Нужно написать цифрами. Попробуйте снова.");
       }
        request.getRequestDispatcher("result.jsp").forward(request, response);
        
        
    }

   
}
