package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entities.Studententities;
import com.util.DBConnection;

public class Studentdao {

    public void insertStudent(Studententities s) throws Exception {

        Connection con = DBConnection.getConnection();

        String sql = "INSERT INTO students(id, name, city) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, s.getId());
        ps.setString(2, s.getName());
        ps.setString(3, s.getCity());

        ps.executeUpdate();

        System.out.println("Data Inserted Successfully");

        ps.close();
        con.close();
    }
}
