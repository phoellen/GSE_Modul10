/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextgenpos;

import Business.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author phoel
 */
public class FXMLDocumentController implements Initializable {
    private ArrayList<SalesLineItem> basket;
    private Register currentRegister;
    private IBusiness buis;
    
    @FXML
    private TextField findProductTextField;
    @FXML
    private Label findItemNameLabel;
    @FXML
    private Button findItembutton;
    @FXML
    private Label saleStatusLabel;
    @FXML
    private Button addSelectedButton;
    @FXML
    private TableView<SalesLineItem> productTableview;
    @FXML
    private TableColumn<?, ?> productName;
    @FXML
    private TableColumn<?, ?> productDescription;
    @FXML
    private TableColumn<?, ?> productPrice;
    @FXML
    private Button buyButton;
    @FXML
    private TableView<SalesLineItem> basketTableView;
    @FXML
    private TableColumn<?, ?> basketName;
    @FXML
    private TableColumn<?, ?> basketDescription;
    @FXML
    private TableColumn<?, ?> basketquantity;
    @FXML
    private TableColumn<?, ?> basketPrice;
    @FXML
    private TableView<Sale> salesTableview;
    @FXML
    private TableColumn<?, ?> salesItems;
    @FXML
    private TableColumn<?, ?> salesDate;
    @FXML
    private TableColumn<?, ?> salesPrice;
    @FXML
    private RadioButton register1RadioButton;
    @FXML
    private ToggleGroup registertogglegroup;
    @FXML
    private RadioButton register2RadioButton;
    @FXML
    private RadioButton register3RadioButton;
    @FXML
    private RadioButton register4RadioButton;
    @FXML
    private Spinner<Integer> orderSpinner;

    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        orderSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 70, 1));
        basket = new ArrayList<>();
        buis = new Store("Store","Campus Vej 55");
        buis.createTestData();
    }    

    @FXML
    private void FindItem(ActionEvent event) {
    }

    @FXML
    private void addToBasket(ActionEvent event) {
    }

    @FXML
    private void buyItemsInBasket(ActionEvent event) {
    }

    @FXML
    private void changeRegister(ActionEvent event) {
        if(register1RadioButton.isSelected()){
            currentRegister = buis.getRegisters().get("Register1");
        } else if(register2RadioButton.isSelected()){
            currentRegister = buis.getRegisters().get("Register2");
        } else if(register3RadioButton.isSelected()){
            currentRegister = buis.getRegisters().get("Register3");
        } else{
            currentRegister = buis.getRegisters().get("Register4");
        }
    }

    
}
