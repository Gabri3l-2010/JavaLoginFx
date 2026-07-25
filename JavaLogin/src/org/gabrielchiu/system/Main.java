
package org.gabrielchiu.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author gabriel chiu
 */
public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        //convertir .fxml en nodo raiz
        Parent raiz = FXMLLoader.load(
                getClass().getResource("/org/gabrielchiu/view/style/InicioSesionView.fxml"));        
        Scene escena = new Scene(raiz);
        
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }    
}
