package de.lubowiecki.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    private final static String TABLE = "personen";


    public PersonDAO() throws SQLException {
        createTable();
    }

    // Create Read Update Delete

    public boolean createTable() throws SQLException {

        try(Connection conn = DbUtils.getConnection();
            Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                "vorname TEXT NOT NULL, " +
                                "nachname TEXT NOT NULL)";

            return stmt.execute(sql);
        }
    }

    public boolean save(Person person) throws SQLException {
        if(person.getId() > 0) {
            return update(person);
        }
        return insert(person);
    }

    private boolean insert(Person person) throws SQLException {

        String sql = "INSERT INTO " + TABLE + " (id, vorname, nachname) VALUES(NULL, ?, ?)";

        // PreparedStatements schützen gegen SQL-Injection
        try(Connection conn = DbUtils.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, person.getVorname()); // zahl = nr des Fragezeichens
            stmt.setString(2, person.getNachname());

            if(stmt.executeUpdate() > 0) {
                ResultSet result = stmt.getGeneratedKeys();
                result.next();
                person.setId(result.getInt(1));
                return true;
            }
            return false;
        }
    }

    public Person find(int id) throws SQLException {

        try(Connection conn = DbUtils.getConnection();
            Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM " + TABLE + " WHERE id = " + id;
            ResultSet results = stmt.executeQuery(sql);

            // TODO: Optional verwenden
            if(results.next()) {
                // Datensätze werden in Objekte verpackt
                Person p = new Person();
                p.setId(results.getInt("id"));
                p.setVorname(results.getString("vorname"));
                p.setNachname(results.getString("nachname"));
                return p;
            }
            return null;
        }
    }

    public List<Person> findAll() throws SQLException {

        try(Connection conn = DbUtils.getConnection();
            Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM " + TABLE;
            ResultSet results = stmt.executeQuery(sql);

            List<Person> personen = new ArrayList<>();

            while(results.next()) {
                // Datensätze werden in Objekte verpackt
                Person p = new Person();
                p.setId(results.getInt("id"));
                p.setVorname(results.getString("vorname"));
                p.setNachname(results.getString("nachname"));
                personen.add(p); // Person zur Liste hinzufügen
            }
            return personen;
        }
    }

    private boolean update(Person person) {
        throw new UnsupportedOperationException("Noch nicht implementiert!");
    }

    public boolean delete(Person person) {
        return delete(person.getId());
    }

    public boolean delete(int id) {
        throw new UnsupportedOperationException("Noch nicht implementiert!");
    }
}
