/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pengolahan_nilai;

/**
 *
 * @author Arjuna Pamungkas
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBJurusan {
    public static List<JurusanModel> getAllJurusan() throws SQLException {
        Connection conn = DBConnection.connect();
        String query = "SELECT * FROM Jurusan";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        List<JurusanModel> jurusanList = new ArrayList<>();
        while (rs.next()) {
            jurusanList.add(new JurusanModel(
                rs.getInt("Kd_Jurusan"),
                rs.getString("Jurusan")
            ));
        }
        conn.close();
        return jurusanList;
    }
}