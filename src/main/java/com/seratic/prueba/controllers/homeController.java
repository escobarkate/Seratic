/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers;

import com.seratic.prueba.modelos.Usuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PLANTA INTERNA
 */
@Controller
public class homeController {
    @RequestMapping("home.htm")
    public ModelAndView home(HttpServletRequest hsr){
        
        
        HttpSession session = hsr.getSession();
       String sesion = (String)session.getAttribute("session");
       
       if (sesion == "si"){
            ModelAndView mav = new ModelAndView();
            mav.setViewName("home");
            mav.addObject("usuario", new Usuario());
            return mav; 
       } else {
            return new ModelAndView("redirect:/login.htm");  
       }
    
    }
    
}
