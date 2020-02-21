/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd2groupproject2;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alexu
 */
public class LoginViewController implements Initializable {

    /**
     * initialises the controller class.
     */
    
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;
    
    @FXML
    private Label labelField;
    
  
    @FXML
    void Login(ActionEvent event) throws IOException {
        if ((usernameField.getText().equals("Jon-Snow")) && (passwordField.getText().equals("password")))
        {
            labelField.setText("Welcome!");
            changeStage(event);
        }
        else if ((usernameField.getText().equals("Alex-Spurell")) && (passwordField.getText().equals("wardenAlex")))
        {
           labelField.setText("Welcome!");
           changeStage(event);
        }
        else if ((usernameField.getText().equals("Connor-Gee")) && (passwordField.getText().equals("wardenConnor")))
        {
           labelField.setText("Welcome!");
           changeStage(event);
        }
        else if ((usernameField.getText().equals("Ash-Brian")) && (passwordField.getText().equals("wardenAsh")))
        {
           labelField.setText("Welcome!");
           changeStage(event);
        }
        else
        {
            labelField.setText("Wrong username or password!");
        }
        
        }
     public void changeStage(ActionEvent event) throws IOException{
        Parent mainView = FXMLLoader.load(getClass().getResource("MainView.fxml"));
        Scene mainViewScene = new Scene(mainView);
            
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainViewScene);
        window.show();
        window.centerOnScreen();
    }
     
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
