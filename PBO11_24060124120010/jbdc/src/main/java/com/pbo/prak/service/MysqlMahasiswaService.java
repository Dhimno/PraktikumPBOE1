package com.pbo.prak.service;

import com.pbo.prak.model.Mahasiswa;
import com.pbo.prak.utilities.MysqlUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {

    public void add(Mahasiswa mahasiswa) throws SQLException {
        String sql = "INSERT INTO mahasiswa(nama) VALUES (?)";
        try (Connection connection = MysqlUtility.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, mahasiswa.getNama());
            statement.executeUpdate();
        }
    }

    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> result = new ArrayList<>();
        String sql = "SELECT id, nama FROM mahasiswa ORDER BY id";
        try (Connection connection = MysqlUtility.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                result.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        }
        return result;
    }

    public void update(Mahasiswa mahasiswa) throws SQLException {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (Connection connection = MysqlUtility.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, mahasiswa.getNama());
            statement.setInt(2, mahasiswa.getId());
            statement.executeUpdate();
        }
    }

    public void deleteById(int id) throws SQLException {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (Connection connection = MysqlUtility.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}
