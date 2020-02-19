/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd2groupproject2;
import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 *
 * @author sakla
 */
public class Room {
    
    private final IntegerProperty roomNumber;
    private final IntegerProperty rent;
    public Status status;
    public RentalAgreement rentalAgreement;
    
    //Set constructor 
    public Room(int roomNumber, int rent, Status status, RentalAgreement rentalAgreement) {
	this.roomNumber = new SimpleIntegerProperty(roomNumber);
	this.rent = new SimpleIntegerProperty(rent);
	this.status = status;
        this.rentalAgreement = rentalAgreement;
       
        
    }
    public int getRoomNumber() {
		return roomNumber.get();
	}
    
    public void setRoomNumber(int roomNumber) {
		this.roomNumber.set(roomNumber);
	}
    
    public Status getStatus() {
		return status;
	}
    
    public void setStatus(Status status) {
		this.status = status;
	}
    
    public float getRent() {
		return rent.get();
	}
    
    public void setRentalRate(int rent){
                this.rent.set(rent);
	}
    
    public RentalAgreement getRentalAgreement() {
		return rentalAgreement;
	}
    
    public void setRentalAgreement(RentalAgreement rentalAgreement) {
		this.rentalAgreement = rentalAgreement;
        }
    
    public void deleteRentalAgreement() {
    }
}
