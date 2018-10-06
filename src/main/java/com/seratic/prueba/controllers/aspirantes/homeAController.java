
package com.seratic.prueba.controllers.aspirantes;

import com.seratic.prueba.modelos.Aspirante;
import com.seratic.prueba.modelos.Prueba;
import com.seratic.prueba.util.ConexBD;
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
@RequestMapping("homeA.htm")
public class homeAController {
    private JdbcTemplate jdbcTemplate;

    public homeAController() {
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
            Prueba d = this.selectUsuario(id);
            mav.setViewName("aspirantes/homeA");
            mav.addObject("usuario",d);
            return mav;  
       } else {
          return new ModelAndView("redirect:/login.htm");  
      }    
        
        
    }
    
   
    
    public Prueba selectUsuario(int id){
        final Prueba user = new Prueba();
        String sql = "SELECT * FROM pruebas WHERE idAspirante="+id;
        return (Prueba) jdbcTemplate.query(sql, new ResultSetExtractor<Prueba>(){
            public Prueba extractData(ResultSet rs) throws SQLException, DataAccessException{
                if(rs.next()){
                    user.setId(rs.getInt("id"));
                    user.setIdAspirante(rs.getInt("idAspirante"));
                    user.setNombreA(rs.getString("nombreA"));
                    user.setCarrera(rs.getString("carrera")); 
                    user.setIdEvaluador(rs.getInt("idEvaluador"));
                    user.setNombreE(rs.getString("nombreE"));
                    user.setDetalle(rs.getString("detalle")); 
                    user.setEvaluacion(rs.getString("calificacion"));
                    user.setFecha(rs.getString("fecha")); 
                    
                }
                return user;
            }
        }  );
    }
    
}
