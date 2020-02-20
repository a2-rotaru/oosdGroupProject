/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd2groupproject2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Alexu
 */
public class MainViewController implements Initializable {

   
    @FXML
    private ComboBox<?> hallBox;

    @FXML
    private TextField addressBox;

    @FXML
    private TextField telephoneBox;

    @FXML
    private TextField hallNoBox;

    @FXML
    private TextField no_roomsBox;

    @FXML
    private TextField wardenBox;

    @FXML
    private TextField firstnameBox;

    @FXML
    private TextField lastnameBox;

    @FXML
    private TextField studentIDBox;

    @FXML
    private TextField roomNoBox;

    @FXML
    private TextField rateBox;

    @FXML
    private ComboBox<?> cleaningBox;

    @FXML
    private ComboBox<?> statusBox;

    @FXML
    private TextField leaseIDBox;

    @FXML
    private TextField durationBox;

    @FXML
    private Tab tabManager;

    @FXML
    private TableColumn<?, ?> columnFirstName;

    @FXML
    private TableColumn<?, ?> columnLastName;

    @FXML
    private TableColumn<?, ?> columnStudentID;

    @FXML
    private TableColumn<?, ?> columnHall;

    @FXML
    private TableColumn<?, ?> columnRoomNo;

    @FXML
    private Tab tabWarden;

    @FXML
    private TableColumn<?, ?> columnStatus;

    @FXML
    void applyChanges(ActionEvent event) {

    }

    @FXML
    void createLease(ActionEvent event) {

    }

    @FXML
    void deleteLease(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
