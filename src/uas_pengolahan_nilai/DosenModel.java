/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pengolahan_nilai;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


/**
 *
 * @author Amalia Fauhanisa
 */

public class DosenModel {

    private final SimpleIntegerProperty kdDosen;
    private final SimpleStringProperty jurusan;
    private final SimpleStringProperty namaDosen;
    private final SimpleStringProperty alamat;
    private final SimpleStringProperty noTelp;

    public DosenModel(int kdDosen, String jurusan, String namaDosen, String alamat, String noTelp) {
        this.kdDosen = new SimpleIntegerProperty(kdDosen);
        this.jurusan = new SimpleStringProperty(jurusan);
        this.namaDosen = new SimpleStringProperty(namaDosen);
        this.alamat = new SimpleStringProperty(alamat);
        this.noTelp = new SimpleStringProperty(noTelp);
    }

    public int getKdDosen() { return kdDosen.get(); }
    public String getJurusan() { return jurusan.get(); }
    public String getNamaDosen() { return namaDosen.get(); }
    public String getAlamat() { return alamat.get(); }
    public String getNoTelp() { return noTelp.get(); }
}
