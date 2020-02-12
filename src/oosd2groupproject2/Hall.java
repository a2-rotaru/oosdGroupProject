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
public class Hall {
    
    private StringProperty name;
    private IntegerProperty hallNumber;
    private final StringProperty address;
    private final IntegerProperty totalRooms;
    public Warden warden;
   // public ObservableList<Student> studentList;
    
    //Set constructor 
    public Hall(String name, int hallNumber,int totalRooms, String address, Warden warden) {
        this.name = new SimpleStringProperty(name);
	this.hallNumber = new SimpleIntegerProperty(hallNumber);
	this.address = new SimpleStringProperty(address);
	this.warden = warden;
	this.totalRooms = new SimpleIntegerProperty(totalRooms);
	//this.studentList = FXCollections.observableArrayList();
       
        
    }
   
    //Getter for name
    public String getName(){
        return name.get();
    }
    
    public void setName(String name){
        this.name.set(name);
    }
    
    public String getAddress() {
		return address.get();
	}
    
    public void setAddress(String address) {
		this.address.set(address);
	}
    
    public Warden getWarden() {
		return warden;
	}
    
    public void setWarden(Warden warden) {
		this.warden = warden;
	}
    
    public int getTotalRooms() {
		return totalRooms.get();
	}
    
    public void setName(int totalRooms){
        this.totalRooms.set(totalRooms);
    }
    
    public Integer getHallNumber() {
		return hallNumber.get();
	}
    
    public void setHallNumber(int hallNumber) {
		this.hallNumber.set(hallNumber);
	}
    
    
}
