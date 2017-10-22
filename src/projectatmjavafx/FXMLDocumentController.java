/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatmjavafx;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
/**
 * FXML Controller class
 *
 * @author aldimakarim
 */
public class FXMLDocumentController {
    
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;

    @FXML
    private JFXButton dua;

    @FXML
    private JFXButton empat;

    @FXML
    private JFXButton tujuh;

    @FXML
    private JFXButton lima;

    @FXML
    private JFXButton satu;

    @FXML
    private JFXButton buttonhapus;

    @FXML
    private JFXButton tiga;

    @FXML
    private JFXButton enam;

    @FXML
    private JFXButton sembilan;

    @FXML
    private JFXButton lapan;

    @FXML
    private JFXButton nol;

    @FXML
    private JFXButton buttonproses;

    @FXML
    private JFXPasswordField editpin;

    @FXML
    void Hapus(ActionEvent event) {
        pin = "";
        editpin.setText(pin);
    }

    @FXML
    void Proses(ActionEvent event) throws IOException {
        if (pin.equals(PIN)){
            try{
            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            Stage stage = new stage();
            stage.setScene(scene);
            stage.setTitle("MenuaAwal");
            stage.show();
         }  catch (IOException e){
             System.out.println("Failed to create new window."+ e);
         } 
    }else {
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa " + kesempatan + "kesempatan selanjutanya!");
            editpin.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }

    @FXML
    void tekan0(ActionEvent event) {
           pin += "0";
           editpin.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
           pin += "1";
           editpin.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
           pin += "2";
           editpin.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
           pin += "3";
           editpin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
           pin += "4";
           editpin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
           pin += "5";
           editpin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
           pin += "6";
           editpin.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
           pin += "7";
           editpin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
           pin += "8";
           editpin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
           pin += "9";
           editpin.setText(pin);
    }

    private static class stage extends Stage {

        public stage() {
        }
    }
}