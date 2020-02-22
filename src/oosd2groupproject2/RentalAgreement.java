/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd2groupproject2;

//Imported java utilities
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
public class RentalAgreement {
    
    //Constants
    private StringProperty rentalAgreementID;
    private StringProperty studentFirstName;
    private StringProperty studentLastName;
    private StringProperty studentID;
    private StringProperty tenantAddress;
    private IntegerProperty tenancyDuration;
    private IntegerProperty tenantRoomNumber;
    
    
    public RentalAgreement(String rentalAgreementID, String tenantAddress, 
        String studentFirstName, String studentLastName, 
        String studentID, int tenancyDuration, int tenantRoomNumber  ){
        
        this.rentalAgreementID = new SimpleStringProperty(rentalAgreementID);
        this.studentFirstName = new SimpleStringProperty(studentFirstName);
        this.studentLastName = new SimpleStringProperty(studentLastName);
        this.studentID = new SimpleStringProperty(studentID);
        this.tenantAddress = new SimpleStringProperty(tenantAddress);
        this.tenancyDuration = new SimpleIntegerProperty(tenancyDuration);
        this.tenantRoomNumber = new SimpleIntegerProperty(tenantRoomNumber);
        
    }
    
    public RentalAgreement(){
        this(null, null, null, null, null, 0 , 0 );
    } 

 

   /* RentalAgreement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } */
    
    
    //Used to get the renatl agreement ID
    public String getRentalAgreementID(){
        return rentalAgreementID.get();
    }
    
    //Used to set the rental agreement ID 
    public void setRentalAgreementID(String rentalAgreementID){
        this.rentalAgreementID.set(rentalAgreementID);
    }
    
    //Used to get the students first name
    public String getStudentFirstName(){
        return studentFirstName.get();
    }
    
    //Used to set the students first name 
    public void setStudentFirstName(String studentFirstName){
        this.setStudentFirstName(studentFirstName);
    }
    
    //Used to get the students last name
    public String getStudentsLastName(){
        return studentLastName.get();
    }
    
    //Used to set the students last name
    public void setStudentLastName(String studentLastName){
        this.setStudentLastName(studentLastName);
    }
    
    //Used to get the students unique ID
    public String getStudentID(){
        return studentID.get();
    }
    
    //Used to set the students unique ID
    public void setStudentID(String studentID){
        this.setStudentID(studentID);
    }
    
    //Used to get the tenant address
    public String getTenantAddress(){
        return tenantAddress.get();
    }
    
    //Used to set the tenant address
    public void setTenantAddress(String tenantAddress){
        this.tenantAddress.set(tenantAddress);
    }
    
    //Used to get the duration of the tenancy 
    public Integer getTenancyDuration(){
        return tenancyDuration.get();
    }
    
    //Used to set the duration of the tenancy
    public void setTenancyDuration(Integer tenancyDuration){
        this.setTenancyDuration(tenancyDuration);
    }
    
    //Used to get the tenants room number
    public Integer getTenantRoomNumber(){
        return tenantRoomNumber.get();
    }
    
    //Used to set the tenants room number
    public void setTenantRoomNumber(Integer tenantRoomNumber){
        this.setTenantRoomNumber(tenantRoomNumber);
    }
}