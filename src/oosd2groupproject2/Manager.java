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
public class Manager {
    private StringProperty name;
    private String password;
    
    public Manager(String name, String password){
        this.name = new SimpleStringProperty(name);
        this.password = password;
        
    }
    
    //returning the name
    public String getName(){
        return name.get();
        
    }
    
    public StringProperty nameProperty(){
        return name;
    }
    
    public void setName (String name){
        this.name.set(name);
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword (String password){
        this.password = password;
        
    }
}
