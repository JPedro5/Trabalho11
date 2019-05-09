package Controller;

import View.Palco;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXMLMenuController implements Initializable {

    @FXML private Button cadastrar;
    @FXML private Button btpesquisa;
    @FXML private Button sair;
    @FXML private Button btatua;   
    @FXML private Button btdelatar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }   
    @FXML
    void sairdaconta(ActionEvent event) {
        
        JOptionPane.showMessageDialog(null, "Saindo...");
        Palco.setLogin();
    }
    @FXML
    void cadastro(ActionEvent event) {
        Palco.setPalco(1);
    }

    @FXML
    void deleta(ActionEvent event) {
        Palco.setPalco(5);
    }

    @FXML
    void atualizar(ActionEvent event) {
           Palco.setPalco(4);
    }

    @FXML
    void pesquisa(ActionEvent event) {
            Palco.setPalco(3);
    }
    
}
