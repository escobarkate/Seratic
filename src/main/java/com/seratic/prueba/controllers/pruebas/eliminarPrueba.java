package com.seratic.prueba.controllers.pruebas;

import com.seratic.prueba.util.ConexBD;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PLANTA INTERNA
 */
@Controller
@RequestMapping("eliminarPrueba.htm")
public class eliminarPrueba {
    private JdbcTemplate jdbcTemplate;

    public eliminarPrueba() {
        ConexBD con = new ConexBD();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    @GetMapping
    public ModelAndView deluser(HttpServletRequest request){        
        String id = request.getParameter("id");
        this.jdbcTemplate.update(
                        "DELETE FROM pruebas "
                    + "WHERE "
                    + "id=?",                    
                    id);
                
        return new ModelAndView("redirect:/pruebas.htm");
    }
}
