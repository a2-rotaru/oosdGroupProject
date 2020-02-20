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

import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author sakla
 */
public class Status {
    
    private StringProperty status;
    
    public Status(String status) {
	this.status = new SimpleStringProperty(status);
    }
    
    public String getStatus() {
		return status.get();
	}
    
    public void setStatus(String status) {
		this.status.set(status);
	}
}
