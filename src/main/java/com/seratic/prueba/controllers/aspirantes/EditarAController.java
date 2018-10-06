/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers.aspirantes;

import com.seratic.prueba.modelos.Aspirante;
import com.seratic.prueba.modelos.Usuario;
import com.seratic.prueba.util.ConexBD;
import com.seratic.prueba.util.Encriptar;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
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
@RequestMapping("editarAspirante.htm")

public class EditarAController {
    private JdbcTemplate jdbcTemplate;

    public EditarAController() {
        ConexBD con = new  ConexBD();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    @GetMapping
    public ModelAndView edituser(HttpServletRequest request) throws Exception{
        HttpSession session = request.getSession();
        String sesion = (String)session.getAttribute("session");
        
        if (sesion == "si"){
            ModelAndView mav = new ModelAndView();
            int id = Integer.parseInt(request.getParameter("id"));
            Aspirante d = this.selectUsuario(id);
            mav.setViewName("aspirantes/editarAspirante");
            mav.addObject("usuario",new Aspirante(id,d.getNombre(),d.getCarrera(),d.getTelefono(),d.getCorreo()));
            return mav;  
       } else {
          return new ModelAndView("redirect:/login.htm");  
      }    
        
        
    }
    
    @PostMapping
    public ModelAndView edituser(@ModelAttribute("usuario") Aspirante u,
                                BindingResult result,
                                SessionStatus status,
                                HttpServletRequest request){
 
            String id=request.getParameter("id");
            String sql= "UPDATE aspirantes SET  nombre = ?, carrera = ?, telefono = ?, correo= ? WHERE id = ?";

            this.jdbcTemplate.update(
                    sql,  u.getNombre(),u.getCarrera(),u.getTelefono(),u.getCorreo(),id);
            return new ModelAndView("redirect:/aspirantes.htm");
        
    }
    
    public Aspirante selectUsuario(int id){
        final Aspirante user = new Aspirante();
        String sql = "SELECT * FROM aspirantes WHERE id="+id;
        return (Aspirante) jdbcTemplate.query(sql, new ResultSetExtractor<Aspirante>(){
            public Aspirante extractData(ResultSet rs) throws SQLException, DataAccessException{
                if(rs.next()){
                    user.setId(rs.getInt("id"));
                    user.setNombre(rs.getString("nombre"));
                    user.setCarrera(rs.getString("carrera"));
                    user.setTelefono(rs.getInt("telefono"));
                    user.setCorreo(rs.getString("correo")); 
                    
                }
                return user;
            }
        }  );
    }
    
    
}
