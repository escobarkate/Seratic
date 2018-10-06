/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers.aspirantes;

import com.seratic.prueba.util.ConexBD;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PLANTA INTERNA
 */
@Controller
public class AspirantesController {

   private JdbcTemplate jdbcTemplate;

    public AspirantesController() {
        ConexBD con = new ConexBD();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping("aspirantes.htm")
    public ModelAndView users(HttpServletRequest hsr){
        HttpSession session = hsr.getSession();
        String sesion = (String)session.getAttribute("session");
        
        if (sesion == "si"){
            ModelAndView mav = new ModelAndView();
            String sql="select * from aspirantes";
            List usuarios = this.jdbcTemplate.queryForList(sql);
            mav.addObject("usuarios", usuarios);
            mav.setViewName("aspirantes/aspirantes");
            return mav;    
      } else {
            return new ModelAndView("redirect:/login.htm");  
       }   
        
             
    }
}
