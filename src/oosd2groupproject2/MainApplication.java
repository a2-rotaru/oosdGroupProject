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
import oosd2groupproject2.Warden;
//import oosd2groupproject2.Status;

/**
 *
 * @author Alexu
 */
public class MainApplication extends Application{
    
public ArrayList<Hall> hallArray = new ArrayList<Hall>();
    //Manager Manager = new Manager("Jon Snow" , "password");
    Hall hall1;
    Hall hall2;
    Hall hall3;
    
    
    public MainApplication() {
        this.hall1 = new Hall("Frenchay" , 1, 450, "07578994332" , "Filton Road, Bs16 1ZG",new Warden("Alex-Spurell","wardenAlex"));
        this.hall3 = new Hall("Student Village", 3, 550, "07534227998","307 Coldharbour Ln. Bs16 1ZH", new Warden("Connor-Gee","wardenConnor"));
        this.hall2 = new Hall("Glenside", 2, 400,"07598335298", "Blackberry Hill, Bs16 1DD", new Warden("Ash-Brian", "wardenAsh"));
        //Create hall Array, initialise halls and add some data
        hallArray.add(hall1);
        hallArray.add(hall2);
        hallArray.add(hall3);
        
        hall1.studentList.addAll(new Student("Raul","Ginj", "17024853", new Room(11, 500), new RentalAgreement("S127889" ,"Filton Road, Bs16 1ZG", "Raul",
        "Ginj","17024853", 12,11 )),new Student("Ash","Gregory", "17064327", new Room(20, 550), new RentalAgreement("S779465" ,"Filton Road, Bs16 1ZG", "Ash",
        "Gregory","17064327", 12,20 )),new Student("Alex","Bogoslov", "170248986", new Room(25, 550), new RentalAgreement("S778765" ,"Filton Road, Bs16 1ZG", "Alex",
        "Bogoslov","170248986", 12,25 )));
        
        hall2.studentList.addAll(new Student("Chris","Hobday", "1497654", new Room(35, 600), new RentalAgreement("S127675" ,"Blackberry Hill, Bs16 1DD", "Chris",
        "Hobday","1497654", 12,35 )),new Student("Joe","Coverdale", "13267567", new Room(14, 550), new RentalAgreement("S777711" ,"Blackberry Hill, Bs16 1DD", "Joe",
        "Coverdale","13267567", 12,14 )),new Student("Kane","Newton", "16983456", new Room(13, 600), new RentalAgreement("S60987" ,"Blackberry Hill, Bs16 1DD", "Kane",
        "Newton", "16983456", 12,13 )));
        
        hall3.studentList.addAll(new Student("Laura","Sakalyte", "164893", new Room(45, 560), new RentalAgreement("S189304" ,"307 Coldharbour Ln. Bs16 1ZH", "Laura",
        "Sakalyte", "164893", 12,45 )),new Student("Alexandra ","Rotaru", "17024831", new Room(17, 550), new RentalAgreement("S894745" ,"307 Coldharbour Ln. Bs16 1ZH", 
        "Alexandra ","Rotaru", "17024831", 12,17 )),new Student("Irina","Burcus", "1564446", new Room(18, 500), new RentalAgreement("S606969" ,"307 Coldharbour Ln. Bs16 1ZH", 
        "Irina","Burcus", "1564446", 12,18 )));
        
        
        
        
        
        
                                
                
    } 
    
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
