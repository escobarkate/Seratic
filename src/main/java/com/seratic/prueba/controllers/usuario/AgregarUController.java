/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers.usuario;

import com.seratic.prueba.modelos.Usuario;
import com.seratic.prueba.util.ConexBD;
import com.seratic.prueba.util.Encriptar;
import java.util.Date;
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
@RequestMapping("agregarUsuario.htm")
public class AgregarUController {
     private JdbcTemplate jdbcTemplate;

    public AgregarUController() {
        ConexBD con = new ConexBD();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    @GetMapping
    public ModelAndView adduser(HttpServletRequest hsr){   
        HttpSession session = hsr.getSession();
        String sesion = (String)session.getAttribute("session");
       // if (sesion == "si"){
            ModelAndView mav = new ModelAndView();
            mav.setViewName("usuarios/agregarUsuario");
            mav.addObject("usuario", new Usuario());       
            return mav;   
     //  } else {
         //   return new ModelAndView("redirect:/login.htm");  
     //  }                   
    }
    
    @PostMapping
    public ModelAndView adduser (@ModelAttribute("usuario") Usuario u,
                                BindingResult result,
                                SessionStatus status){
        Date fecha = new Date();
        String pass = Encriptar.Encriptar(u.getContrasena());//Encrypto la contraseña
            this.jdbcTemplate.update(
                        "INSERT INTO usuarios (id,nombre,usuario,contrasena,tipo) VALUES (?,?,?,?,?)",
                        u.getId(),u.getNombre(),u.getUsuario(),pass,u.getTipo());
            return new ModelAndView("redirect:/usuarios.htm");        
    }
    
}
