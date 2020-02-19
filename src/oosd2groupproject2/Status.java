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
public class Status {
    
    private StringProperty status;
    
    //Set constructor 
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
