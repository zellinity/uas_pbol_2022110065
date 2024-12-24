/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pengolahan_nilai;

/**
 *
 * @author Arjuna Pamungkas
 */
import javafx.beans.property.*;

public class JurusanModel {
    private final IntegerProperty kdJurusan;
    private final StringProperty jurusan;

    public JurusanModel(int kdJurusan, String jurusan) {
        this.kdJurusan = new SimpleIntegerProperty(kdJurusan);
        this.jurusan = new SimpleStringProperty(jurusan);
    }

    public IntegerProperty kdJurusanProperty() { return kdJurusan; }
    public StringProperty jurusanProperty() { return jurusan; }
}
