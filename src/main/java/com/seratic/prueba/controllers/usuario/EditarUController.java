/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.controllers.usuario;

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
@RequestMapping("editarUsuario.htm")
public class EditarUController {
     private JdbcTemplate jdbcTemplate;

    public EditarUController() {
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
            Usuario datos = this.selectUsuario(id);
            mav.setViewName("usuarios/editarUsuario");
            mav.addObject("usuario",new Usuario(id,datos.getNombre(),datos.getUsuario(),datos.getContrasena(),datos.getTipo()));
            return mav;  
       } else {
          return new ModelAndView("redirect:/login.htm");  
      }    
        
        
    }
    
    @PostMapping
    public ModelAndView edituser(@ModelAttribute("usuario") Usuario u,
                                BindingResult result,
                                SessionStatus status,
                                HttpServletRequest request){
            String pass = Encriptar.Encriptar(u.getContrasena());   
            String id=request.getParameter("id");
            String sql= "UPDATE usuarios SET  nombre = ?, usuario = ?, contrasena = ?, tipo = ? WHERE id = ?";

            this.jdbcTemplate.update(
                    sql,  u.getNombre(),u.getUsuario(),u.getContrasena(),u.getTipo(),id);
            return new ModelAndView("redirect:/usuarios.htm");
        
    }
    
    public Usuario selectUsuario(int id){
        final Usuario user = new Usuario();
        String sql = "SELECT * FROM usuarios WHERE id="+id;
        return (Usuario) jdbcTemplate.query(sql, new ResultSetExtractor<Usuario>(){
            public Usuario extractData(ResultSet rs) throws SQLException, DataAccessException{
                if(rs.next()){
                    user.setId(rs.getInt("id"));
                    user.setNombre(rs.getString("nombre"));
                    user.setUsuario(rs.getString("usuario"));
                    user.setContrasena(rs.getString("contrasena"));
                    user.setTipo(rs.getString("tipo")); 
                    user.setFecha(rs.getString("fecha"));
                }
                return user;
            }
        }  );
    }
    
}
