/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pengolahan_nilai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arjuna Pamungkas
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBMahasiswa {
    public static List<MahasiswaModel> getAllMahasiswa() throws SQLException {
        Connection conn = DBConnection.connect();
        String query = "SELECT * FROM Mahasiswa";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        List<MahasiswaModel> mahasiswaList = new ArrayList<>();
        while (rs.next()) {
            mahasiswaList.add(new MahasiswaModel(
                rs.getString("NPM"),
                rs.getString("Nama_Mahasiswa"),
                rs.getString("Alamat"),
                rs.getString("No_Telp"),
                rs.getString("Tgl_Lahir")
            ));
        }
        conn.close();
        return mahasiswaList;
    }
}