/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers;

import com.seratic.prueba.modelos.Usuario;
import com.seratic.prueba.util.ConexBD;
import com.seratic.prueba.util.Encriptar;
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
      
        HttpSession session = hsr.getSession();
       String sesion = (String)session.getAttribute("session");
       
       if (sesion == "si"){
            return new ModelAndView("redirect:/home.htm"); 
       } else {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("login");
            mav.addObject("usuario", new Usuario());
            return mav;
            
        }
        
    }
    
     @PostMapping
    public ModelAndView login (@ModelAttribute("usuario") Usuario u,
                                BindingResult result,
                                SessionStatus status,HttpServletRequest hsr){         
        HttpSession session = hsr.getSession();
        String pass = Encriptar.Encriptar(u.getContrasena());
        String sql="SELECT * FROM usuarios WHERE usuario='"+u.getUsuario()+"' AND contrasena='"+pass+"' AND tipo='administrador'";
        List datos = this.jdbcTemplate.queryForList(sql);
        if (datos.size() > 0){            
            session.setAttribute("session", "si");
            return new ModelAndView("redirect:/home.htm");            
        }else{
            return new ModelAndView("redirect:/login.htm");
        }                              
        }
}
