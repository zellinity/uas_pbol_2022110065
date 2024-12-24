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

public class FXML_DosenController {

    @FXML
    private TextField txtKdDosen, txtNamaDosen, txtAlamat, txtNoTelp;

    @FXML
    private ComboBox<String> cbJurusan;

    @FXML
    private TableView<DosenModel> tableDosen;

    @FXML
    private TableColumn<DosenModel, String> colKdDosen, colNamaDosen, colJurusan, colAlamat, colNoTelp;

    private DBDosen dbDosen = new DBDosen();

    @FXML
    public void initialize() {
        colKdDosen.setCellValueFactory(data -> data.getValue().kdDosenProperty());
        colNamaDosen.setCellValueFactory(data -> data.getValue().namaDosenProperty());
        colJurusan.setCellValueFactory(data -> data.getValue().jurusanProperty());
        colAlamat.setCellValueFactory(data -> data.getValue().alamatProperty());
        colNoTelp.setCellValueFactory(data -> data.getValue().noTelpProperty());

        loadData();
    }

    private void loadData() {
        ObservableList<DosenModel> data = dbDosen.Load();
        tableDosen.setItems(data);
    }

    @FXML
    private void Btnsimpan() {
        DosenModel dosen = new DosenModel(
            0,
            cbJurusan.getValue(),
            txtNamaDosen.getText(),
            txtAlamat.getText(),
            txtNoTelp.getText()
        );
        dbDosen.insert(dosen);
        loadData();
    }

    @FXML
    private void Btnupdate() {

    }

    @FXML
    private void Btnhapus() {
        
    }
}
