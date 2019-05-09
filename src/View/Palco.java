package View;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Aluno
 */
public class Palco extends Application {
    
    private static Stage palco;
    private static Scene cadastro;
    private static Scene menu;
    private static Scene pesquisa;
    private static Scene login;
    private static Scene exclui;
    private static Scene atualizar; 
    
    @Override
    public void start(Stage stage) throws IOException {
        palco = stage;
        
        palco.setResizable(false);
        
        Parent rootCadastro = FXMLLoader.load(getClass().getResource("FXMLCadastro.fxml"));
        cadastro = new Scene(rootCadastro, 362, 224);
        
        /*Parent rootPesquisa = FXMLLoader.load(getClass().getResource("FXMLPesquisa.fxml"));
        pesquisa = new Scene(rootPesquisa, 600, 400);*/
        
        Parent rootMenu = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
        menu = new Scene(rootMenu, 600,400);
        
        Parent rootLogin = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        login = new Scene(rootLogin, 313,141);
        
        /*Parent rootExclui = FXMLLoader.load(getClass().getResource("FXMLExcluir.fxml"));
        exclui = new Scene(rootExclui, 600,400);*/
        
        /*Parent rootAtualizar = FXMLLoader.load(getClass().getResource("FXMLAtualizar.fxml"));
        atualizar = new Scene(rootAtualizar, 600,400);*/
        
        
        setLogin();
    }

    public static Stage getPalco() {
        return palco;
    }

    public static void setPalco(int numero) {
        switch(numero){
            case 1: palco.setScene(cadastro);break;
            case 2: palco.setScene(menu);break;
            case 3: palco.setScene(pesquisa);break;
            case 4 : palco.setScene(atualizar);break;
            case 5 : palco.setScene(exclui);break;
            
        }
    }
    
    
    
    
    
    
   
  
     public static void setLogin(){
        palco.setScene(login);
        palco.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    public void fechar() throws IOException{
       
    }
    
}
