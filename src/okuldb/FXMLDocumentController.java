/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okuldb;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 *
 * @author mehmet
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private ListView<String> List;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Search(ActionEvent event) {
        OgrenciQueiry Ogrenciler =new OgrenciQueiry();
        ObservableList<Ogrenci> OgrenciListem=Ogrenciler.OgrenciBul();
        
        for(int i=0;i<OgrenciListem.size();i++){
            System.out.println(OgrenciListem.get(i).getOgradi(i));
        }
    }
    
}
