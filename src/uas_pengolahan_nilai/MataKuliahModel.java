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
public class MataKuliahModel {

    private final SimpleStringProperty kodeMK;
    private final SimpleStringProperty namaMK;
    private final SimpleIntegerProperty sks;
    private final SimpleIntegerProperty semester;

    public MataKuliahModel(String kodeMK, String namaMK, int sks, int semester) {
        this.kodeMK = new SimpleStringProperty(kodeMK);
        this.namaMK = new SimpleStringProperty(namaMK);
        this.sks = new SimpleIntegerProperty(sks);
        this.semester = new SimpleIntegerProperty(semester);
    }

    public String getKodeMK() { return kodeMK.get(); }
    public String getNamaMK() { return namaMK.get(); }
    public int getSKS() { return sks.get(); }
    public int getSemester() { return semester.get(); }
}