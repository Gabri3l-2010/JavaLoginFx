
package org.gabrielchiu.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.gabrielchiu.model.Usuario;

public class CajeroDashboardController implements Initializable {

    @FXML private Label lblBienvenida;
    @FXML private Label lblUsuario;
    private Usuario usuarioActual;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void iniciarUsuario(Usuario usuario){
        this.usuarioActual = usuario;
        if (lblBienvenida != null && usuario != null) {
            lblBienvenida.setText("Bienvenido, " + usuario.getUsername());
        }
        if (lblUsuario != null && usuario != null) {
            lblUsuario.setText(usuario.getUsername() + " (Cajero)");
        }
    }
}
