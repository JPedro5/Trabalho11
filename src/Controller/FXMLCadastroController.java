/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.EquipametsDAO;
import Modelo.Equipaments;
import View.Palco;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class FXMLCadastroController implements Initializable {
    @FXML private TextField txtNomeP;
    @FXML private TextField txtNuP;
    @FXML private Button salva;
    @FXML private Button sair;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML void salvar(ActionEvent event){
          Equipaments equip = new Equipaments();
          EquipametsDAO dao = new EquipametsDAO();
          equip.setNome(txtNomeP.getText());
          equip.setNumero(Integer.parseInt(txtNuP.getText()));
          dao.salvar(equip);
          limpar();
    }
    @FXML void saindo(ActionEvent event) {
        Palco.setPalco(2);
    }

    private void limpar() {
        txtNomeP.clear();
        txtNuP.clear();
    }
}
