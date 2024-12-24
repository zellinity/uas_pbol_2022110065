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

public class FXML_MataKuliahController {

    @FXML
    private TextField txtKodeMK, txtNamaMK, txtSKS, txtSemester;

    @FXML
    private TableView<MataKuliahModel> tableMataKuliah;

    @FXML
    private TableColumn<MataKuliahModel, String> colKodeMK, colNamaMK, colSKS, colSemester;

    private DBMataKuliah dbMataKuliah = new DBMataKuliah();

    @FXML
    public void initialize() {
        colKodeMK.setCellValueFactory(data -> data.getValue().kodeMKProperty());
        colNamaMK.setCellValueFactory(data -> data.getValue().namaMKProperty());
        colSKS.setCellValueFactory(data -> data.getValue().sksProperty().asString());
        colSemester.setCellValueFactory(data -> data.getValue().semesterProperty().asString());

        loadData();
    }

    private void loadData() {
        ObservableList<MataKuliahModel> data = dbMataKuliah.Load();
        tableMataKuliah.setItems(data);
    }

    @FXML
    private void handleSave() {
        MataKuliahModel mk = new MataKuliahModel(
            txtKodeMK.getText(),
            txtNamaMK.getText(),
            Integer.parseInt(txtSKS.getText()),
            Integer.parseInt(txtSemester.getText())
        );
        dbMataKuliah.insert(mk);
        loadData();
    }

    @FXML
    private void handleUpdate() {

    }

    @FXML
    private void handleDelete() {

    }
}