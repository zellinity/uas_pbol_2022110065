/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pengolahan_nilai;
import javafx.beans.property.*;
/**
 *
 * @author Arjuna Pamungkas
 */
public class MahasiswaModel {
    private final StringProperty npm;
    private final StringProperty nama;
    private final StringProperty alamat;
    private final StringProperty noTelp;
    private final StringProperty tglLahir;

    public MahasiswaModel(String npm, String nama, String alamat, String noTelp, String tglLahir) {
        this.npm = new SimpleStringProperty(npm);
        this.nama = new SimpleStringProperty(nama);
        this.alamat = new SimpleStringProperty(alamat);
        this.noTelp = new SimpleStringProperty(noTelp);
        this.tglLahir = new SimpleStringProperty(tglLahir);
    }

    public StringProperty npmProperty() { return npm; }
    public StringProperty namaProperty() { return nama; }
    public StringProperty alamatProperty() { return alamat; }
    public StringProperty noTelpProperty() { return noTelp; }
    public StringProperty tglLahirProperty() { return tglLahir; }
}
