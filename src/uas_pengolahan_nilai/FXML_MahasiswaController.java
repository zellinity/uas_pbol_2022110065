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
public class FXML_MahasiswaController {
 @FXML
    private TableView<MahasiswaModel> tableMahasiswa;
    @FXML
    private TableColumn<MahasiswaModel, String> colNPM;
    @FXML
    private TableColumn<MahasiswaModel, String> colNama;
    @FXML
    private TableColumn<MahasiswaModel, String> colAlamat;
    @FXML
    private TableColumn<MahasiswaModel, String> colNoTelp;
    @FXML
    private TableColumn<MahasiswaModel, String> colTglLahir;
    @FXML
    private Button btnTambah, btnEdit, btnHapus;

    private ObservableList<MahasiswaModel> data;

    @FXML
    public void initialize() {
        data = FXCollections.observableArrayList();
        colNPM.setCellValueFactory(cell -> cell.getValue().npmProperty());
        colNama.setCellValueFactory(cell -> cell.getValue().namaProperty());
        colAlamat.setCellValueFactory(cell -> cell.getValue().alamatProperty());
        colNoTelp.setCellValueFactory(cell -> cell.getValue().noTelpProperty());
        colTglLahir.setCellValueFactory(cell -> cell.getValue().tglLahirProperty());


        tableMahasiswa.setItems(data);
    }
}
