/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uas_pengolahan_nilai;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
/**
 * FXML Controller class
 *
 * @author Arjuna Pamungkas
 */
public class FXML_AjarController {

    @FXML
    private ComboBox<String> cbKodeMK, cbKodeDosen;

    @FXML
    private TableView<AjarModel> tableAjar;

    @FXML
    private TableColumn<AjarModel, String> colKodeMK, colKodeDosen;

    private DBAjar dbAjar = new DBAjar();

    @FXML
    public void initialize() {
        colKodeMK.setCellValueFactory(data -> data.getValue().kodeMKProperty());
        colKodeDosen.setCellValueFactory(data -> data.getValue().kodeDosenProperty());

        loadData();
    }

    private void loadData() {
        ObservableList<AjarModel> data = dbAjar.Load();
        tableAjar.setItems(data);
    }

    @FXML
    private void handleSave() {
        AjarModel ajar = new AjarModel(cbKodeMK.getValue(), cbKodeDosen.getValue());
        dbAjar.insert(ajar);
        loadData();
    }

    @FXML
    private void handleDelete() {
        
    }
}