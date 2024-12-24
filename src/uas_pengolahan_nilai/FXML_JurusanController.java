/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uas_pengolahan_nilai;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * FXML Controller class
 *
 * @author Arjuna Pamungkas
 */


public class FXML_JurusanController {
    @FXML
    private TableView<JurusanModel> tableJurusan;
    @FXML
    private TableColumn<JurusanModel, Integer> colKdJurusan;
    @FXML
    private TableColumn<JurusanModel, String> colJurusan;
    @FXML
    private Button btnTambah, btnEdit, btnHapus;

    private ObservableList<JurusanModel> data;

    @FXML
    public void initialize() {
        data = FXCollections.observableArrayList();

        colKdJurusan.setCellValueFactory(cell -> cell.getValue().kdJurusanProperty().asObject());
        colJurusan.setCellValueFactory(cell -> cell.getValue().jurusanProperty());

        tableJurusan.setItems(data);
    }
}