package de.lubowiecki.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PersonDAO {

    private final static String URL = "jdbc:sqlite:data.db";

    public PersonDAO() throws SQLException {
        createTable();
    }

    // Create Read Update Delete

    public boolean createTable() throws SQLException {

        try(Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS personen (" +
                                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                "vorname TEXT NOT NULL, " +
                                "nachname TEXT NOT NULL)";

            return stmt.execute(sql);
        }
    }

    public boolean insert(String vorname, String nachname) throws SQLException {

        try(Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement()) {

            // TODO: Gegen SQL-Injection absichern

            String sql = "INSERT INTO personen (id, vorname, nachname) VALUES(NULL, '" + vorname + "', '" + nachname + "')";
            return stmt.executeUpdate(sql) > 0;
        }
    }

    public String[] find(int id) {
        throw new UnsupportedOperationException("Noch nicht implementiert!");
    }

    public List<String[]> findAll() {
        throw new UnsupportedOperationException("Noch nicht implementiert!");
    }

    public boolean update(String vorname, String nachname, int id) {
        throw new UnsupportedOperationException("Noch nicht implementiert!");
    }

    public boolean delete(int id) {
        throw new UnsupportedOperationException("Noch nicht implementiert!");
    }
}
