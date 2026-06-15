package de.lubowiecki.jdbc;

import java.sql.SQLException;

public class DaoTest {

    public static void main(String[] args) {

        try {
            PersonDAO dao = new PersonDAO(); // createTable wird im Konstruktor automatisch aufgerufen

            Person p = new Person("Scott2", "Lang2");
            System.out.println(p.getId());
            if(dao.save(p)) {
                System.out.println("Datensatz gespeichert!");
                System.out.println(p.getId());
            }

//            for(Person p : dao.findAll()) {
//                System.out.println(p.getId() + ", " + p.getVorname() + " " + p.getNachname());
//            }

//            Person p = dao.find(4);
//            if(p != null)
//                System.out.println(p.getId() + ", " + p.getVorname() + " " + p.getNachname());

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
