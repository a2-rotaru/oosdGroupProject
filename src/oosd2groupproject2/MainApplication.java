/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd2groupproject2;

import java.util.ArrayList;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import oosd2groupproject2.Hall;
//import oosd2groupproject2.Manager;
import oosd2groupproject2.RentalAgreement;
import oosd2groupproject2.Room;
import oosd2groupproject2.Student;
import oosd2groupproject2.UWEAccommodationSystem;
import oosd2groupproject2.Warden;
//import oosd2groupproject2.Status;

/**
 *
 * @author Alexu
 */
public class MainApplication extends Application{
    
//public ArrayList<Hall> hallArray = new ArrayList<Hall>();
    
    
   /* Manager Manager = new Manager("Jon Snow" , "password");
    Hall hall1 = new Hall("Frenchay" , 1, 450, "Filton Road, Bs16 1ZG",new Warden("Alex Spurell","warden1"));
    Hall hall2 = new Hall("Glenside", 2, 400, "Blackberry Hill, Bs16 1DD", new Warden("Kane Bob", "warden2"));
    Hall hall3 = new Hall("Student Village", 3, 550, "307 Coldharbour Ln. Bs16 1ZH", new Warden("Juan Ki", "warden3"));
    */
    
   /* public MainApplication() {
        //Create hall Array, initialise halls and add some data
        hallArray.add(hall1);
        hallArray.add(hall2);
        hallArray.add(hall3);
        
    } */
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        stage.setTitle("UWE Accommodation System");
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
        
    /**
     * @param args the command line arguments */
     
    public static void main(String[] args) {
        launch(args);
    } 
    
}
