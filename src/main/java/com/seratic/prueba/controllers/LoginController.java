/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers;

import com.seratic.prueba.modelos.Usuario;
import com.seratic.prueba.util.ConexBD;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PLANTA INTERNA
 */
@Controller
@RequestMapping("login.htm")
public class LoginController {
    
     
    private JdbcTemplate jdbcTemplate;
     public LoginController(){        
        ConexBD con = new ConexBD();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
   
    
    @GetMapping
    public ModelAndView login(HttpServletRequest hsr){        
      
            ModelAndView mav = new ModelAndView();
            mav.setViewName("login");
            mav.addObject("usuario", new Usuario());
            return mav;
            
       
        
    }
    
    @PostMapping
    public ModelAndView login (@ModelAttribute("usuario") Usuario u,
                                BindingResult result,
                               HttpServletRequest hsr){         
        
        String sql="SELECT * FROM usuarios WHERE usuario='"+u.getUsuario()+"' AND contrasena='"+u.getContrasena()+"' AND tipo='administrador'";
        List datos = this.jdbcTemplate.queryForList(sql);
        if (datos.size() > 0){            
           
            return new ModelAndView("redirect:/home.htm");            
        }else{
            return new ModelAndView("redirect:/login.htm");
        }                              
        }  
}
