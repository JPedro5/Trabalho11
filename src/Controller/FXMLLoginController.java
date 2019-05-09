package Controller;

import View.Palco;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class FXMLLoginController {

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUser;

    @FXML
    private Button Entra;

    @FXML
    void entrando(ActionEvent event) {
        String senha = txtSenha.getText();
        String user = txtUser.getText();
        
        if(senha.equals("123") && user.equals("admin")){
                Palco.setPalco(2);
        }else{
            JOptionPane.showMessageDialog(null,"Senha ou Usuario Errado");
        }
        }
}
