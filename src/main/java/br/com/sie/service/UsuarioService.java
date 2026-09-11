
package br.com.sie.service;

import br.com.sie.model.Usuario;

public class UsuarioService {
    
    public boolean validarUsuario(Usuario usuario) {

        if (usuario == null) {
            return false;
        }

        if (usuario.getNome() == null
                || usuario.getNome().isBlank()) {
            return false;
        }

        if (usuario.getLogin() == null
                || usuario.getLogin().isBlank()) {
            return false;
        }

        if (usuario.getSenha() == null
                || usuario.getSenha().isBlank()) {
            return false;
        }

        if (usuario.getPerfil() == null) {
            return false;
        }

        return true;
    } 
    
}
