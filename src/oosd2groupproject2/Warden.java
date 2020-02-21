/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd2groupproject2;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
/**
 *
 * @author Alexu
 */
public class Warden {
    private final StringProperty name;
    
    private String password;
    
    
    public Warden(String name,String password){
        this.name = new SimpleStringProperty(name);
        this.password = password;
    }

    Warden(String alex_Spurell) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //return the name
    public String getName() {
        return name.get();
    }
    
    public StringProperty nameProperty() {
        return name;
    }
    
    public void setName(String name) {
        this.name.set(name);
    }
        
        //return the password
        
        public String getPassword(){
            return password;
        }
        
        //the password to set
        
        public void setPassword (String password) {
            this.password = password;
            
        }
    
}
