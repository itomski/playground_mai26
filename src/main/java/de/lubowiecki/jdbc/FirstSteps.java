package de.lubowiecki.jdbc;

import java.sql.*;

public class FirstSteps {

    public static void main(String[] args) {

        // CRUD - Create, Read, Update, Delete

        final String URL = "jdbc:sqlite:data.db";

//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(URL);
//            //...
//        }
//        catch (SQLException e) {
//            e.printStackTrace(); // Probleme
//        }
//        finally {
//            if(conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace(); // Probleme beim Schließen der Connection
//                }
//            }
//        }

        // Heute :-)
        try(Connection conn = DriverManager.getConnection(URL);
                Statement stmt = conn.createStatement()) {

            // Aufbau einer Tabelle
//            String sql = "CREATE TABLE IF NOT EXISTS personen (" +
//                                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                                "vorname TEXT NOT NULL, " +
//                                "nachname TEXT NOT NULL)";
//
//            stmt.execute(sql);

            // Neuen Datensatz hinzufügen
//            String sql = "INSERT INTO personen (id, vorname, nachname) VALUES(NULL, 'Carol', 'Danvers')";
//            if(stmt.executeUpdate(sql) > 0)
//                System.out.println("Datensatz wurde gespeichert.");

            // Datensätze abfragen
//            String sql = "SELECT * FROM personen"; // Alle Datensätze lesen
//            String sql = "SELECT * FROM personen WHERE id = 3"; // Einen Datensatz abfragen
//            ResultSet results = stmt.executeQuery(sql);
//
//            // Zugriff auf die Zeilen
//            while(results.next()) {
//                // Zugriff auf die Spalten
//                System.out.println(results.getInt("id"));
//                System.out.println(results.getString("vorname"));
//                System.out.println(results.getString("nachname"));
//                System.out.println();
//            }

            // Datensatz verändern
//            String sql = "UPDATE personen SET vorname = 'Scott', nachname = 'Lang' WHERE id = 3";
//            if(stmt.executeUpdate(sql) > 0)
//                System.out.println("Datensatz wurde geändert.");

            // Datensatz löschen
            String sql = "DELETE FROM personen WHERE id = 3 LIMIT 1";
            if(stmt.executeUpdate(sql) == 1)
                System.out.println("Datensatz wurde gelöscht.");


            // close wird automatsich aufgerufen
        }
        catch (SQLException e) {
            e.printStackTrace(); // Probleme
        }
    }
}
