
package logica;

import com.poyectodamas.persistencia.ControladorPersistencia;

public class Controlador {
    ControladorPersistencia control = new ControladorPersistencia();
    
    public void crearUsuario (Usuario usuario){
        control.crearUsuario(usuario);
    }
    
    public boolean comprobarUsuario(String nickname, String password){
        return control.comprobar(nickname, password);
    }
    public boolean validarNickname(String nickname){
        return control.validarNickname(nickname); 
    }
    public boolean validarEmail(String email){
        return control.validarEmail(email); 
    }
}
