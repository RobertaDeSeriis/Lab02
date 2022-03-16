package it.polito.tdp.alien;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Dizionario;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	 Dizionario diz= new Dizionario(); 
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParole;

    @FXML
    private TextArea txtRisultato;

    @FXML
    void btnClear(ActionEvent event) {
    	txtRisultato.setText("");

    }

    @FXML
    void btnTraduzione(ActionEvent event) {
    	String []parole =txtParole.getText().split(" "); 
    	if (parole.length==1) {
    		txtRisultato.setText(diz.translate(parole[0]).toString()); //torna il toString della lista 
    	}
    	
    	if(parole.length==2) {
    		diz.add(parole[0], parole[1]);
    		}
    }

    @FXML
    void initialize() {
        assert txtParole != null : "fx:id=\"txtParole\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
