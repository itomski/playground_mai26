package de.lubowiecki.jdbc;

import java.sql.SQLException;

public class DaoTest {

    public static void main(String[] args) {

        try {
            PersonDAO dao = new PersonDAO(); // createTable wird im Konstruktor automatisch aufgerufen

            if(dao.insert("Tony", "Stark")) {
                System.out.println("Datensatz gespeichert!");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
