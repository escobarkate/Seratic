/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers.pruebas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PLANTA INTERNA
 */
@Controller
public class PruebasController {
    @RequestMapping("pruebas.htm")
    public ModelAndView usuario() {
            ModelAndView mav= new ModelAndView();
            mav.setViewName("pruebas/pruebas");
   
        return mav;
    }
}
