/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pengolahan_nilai;
import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author Arjuna Pamungkas
 */


public class AjarModel {

    private final SimpleStringProperty kodeMK;
    private final SimpleStringProperty kodeDosen;

    public AjarModel(String kodeMK, String kodeDosen) {
        this.kodeMK = new SimpleStringProperty(kodeMK);
        this.kodeDosen = new SimpleStringProperty(kodeDosen);
    }

    public String getKodeMK() { return kodeMK.get(); }
    public String getKodeDosen() { return kodeDosen.get(); }
}
