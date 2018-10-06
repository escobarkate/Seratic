/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers.pruebas;

import com.seratic.prueba.modelos.Aspirante;
import com.seratic.prueba.modelos.Prueba;
import com.seratic.prueba.util.ConexBD;
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
@RequestMapping("crearPruebas.htm")
public class crearPruebaController {
    private JdbcTemplate jdbcTemplate;

    public crearPruebaController () {
        ConexBD con = new ConexBD();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    @GetMapping
    public ModelAndView adduser(HttpServletRequest hsr){   
        HttpSession session = hsr.getSession();
        String sesion = (String)session.getAttribute("session");
        if (sesion == "si"){
            ModelAndView mav = new ModelAndView();
            mav.setViewName("pruebas/crearPruebas");
            mav.addObject("usuario", new Prueba());       
            return mav;   
       } else {
            return new ModelAndView("redirect:/login.htm");  
      }                   
    }
    
    @PostMapping
    public ModelAndView adduser (@ModelAttribute("usuario") Prueba u,
                                BindingResult result,
                                SessionStatus status){
    
       
            this.jdbcTemplate.update(
                        "INSERT INTO pruebas (idAspirante,nombreA,carrera,idEvaluador,nombreE,detalle,calificacion,fecha)"
                                + " VALUES (?,?,?,?,?,?,?,?)",
                        u.getIdAspirante(),u.getNombreA(),u.getCarrera(),u.getIdEvaluador(),u.getNombreE(),u.getDetalle(),u.getEvaluacion(),
                        u.getFecha());
            return new ModelAndView("redirect:/pruebas.htm");        
    }
    
}
