/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers;

import com.seratic.prueba.modelos.Usuario;
import com.seratic.prueba.util.Encriptar;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PLANTA INTERNA
 */

@Controller
@RequestMapping("cerrar.htm")
public class CerrarController {
   
    @GetMapping
    public ModelAndView deluser(HttpServletRequest hsr,SessionStatus status){     
        HttpSession session = hsr.getSession();
        session.setAttribute("session", "no");
        return new ModelAndView("redirect:/login.htm");
    }
}
