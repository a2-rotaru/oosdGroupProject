
package oosd2groupproject2;

import java.util.Scanner;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author joecoverdale
 */
public class Student {
 
    //Constants 
    private StringProperty studentID;
    private StringProperty studentFirstName;
    private StringProperty studentLastName;
    public Room room = new Room();
    public RentalAgreement rentalAgreement = new RentalAgreement();
    
    //
    public Student(String studentFirstName, String studentLastName, String studentID, Room room, RentalAgreement rentalAgreement){
        this.studentFirstName = new SimpleStringProperty(studentFirstName);
        this.studentLastName = new SimpleStringProperty(studentLastName);
        this.studentID = new SimpleStringProperty(studentID);
        this.room = room;
        this.rentalAgreement = rentalAgreement;
    }
    
    //Used to get/return the students first name 
    public String getStudentFirstName(){
        return studentFirstName.get();
    }
    
    //Used to set the students first name 
    public void setStudentFirstName(String studentFirstName){
        this.studentFirstName.set(studentFirstName);
    }
    
    //Used to get/return the students last name 
    public String getStudentLastName(){
        return studentLastName.get();
}
    //Used to set the students last name 
    public void setStudentLastName(String studentLastName){
        this.studentLastName.set(studentLastName);
    }
    
    //Used to get/return the students unique ID
    public String getStudentID(){
        return studentID.get();
    }
    
    //Used to set the students unique ID
    public void setStudentID(String studentID){
        this.studentID.set(studentID);
    }
    
}
