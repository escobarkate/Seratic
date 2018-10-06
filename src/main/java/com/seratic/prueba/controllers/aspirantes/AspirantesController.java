/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers.aspirantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PLANTA INTERNA
 */
@Controller
public class AspirantesController {

    @RequestMapping("aspirantes.htm")
    public ModelAndView usuario() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("aspirantes/aspirantes");

        return mav;
    }
}
