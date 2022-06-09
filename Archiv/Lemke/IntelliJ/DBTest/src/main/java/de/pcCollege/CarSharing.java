package de.pcCollege;

import java.sql.*;
import java.util.ArrayList;

public class CarSharing {
    public static void main(String[] args) {
        //System.out.printf("München");
        String dbHost = "jdbc:mysql://localhost";
        String dbUser = "carsharing";
        String dbPass = "carsharing";
        String dbName = "carsharing";
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbHost,dbUser,dbPass);
            Statement stmt = con.createStatement();
            // Tabelle erstellen
            String [] sql = {"USE " + dbName,
                            "CREATE TABLE IF NOT EXISTS standort(s_id INT NOT NULL AUTO_INCREMENT, " +
                            "name varchar(50) NOT NULL, " +
                            "strasse varchar(50) NOT NULL, " +
                            "Hausnummer varchar(50) NOT NULL, " +
                            "PLZ varchar(50) NOT NULL, " +
                            "ort varchar(50) NOT NULL, " +
                            "PRIMARY KEY(s_id))"};
            for (String s : sql) {
                stmt.executeUpdate(s);
            }
            //Eintrag in Tabelle
//            String sql2 = "INSERT INTO standort(name, strasse, hausnummer, PLZ, ort) " +
//                    "VALUES ('Berlin', 'Müsterstraße', '234', '1000','Berlin')";
//            // Rückgabe int
//            int r = stmt.executeUpdate(sql2);

            //Select von Tabelle.
            String sql2 = "SELECT * FROM standort";
            ResultSet rs = stmt.executeQuery(sql2);
            ArrayList<Standort> standortListe = new ArrayList<>();
            while (rs.next()){
                System.out.println(String.format("ID: %d," +
                                        " Name: %s, " +
                                        "Straße: %s, " +
                                        "Hausnummer: %s, " +
                                        "PLZ: %s, " +
                                        "Ort: %s",
                                        rs.getInt("s_id"),
                                        rs.getString("name"),
                                        rs.getString("strasse"),
                                        rs.getString("Hausnummer"),
                                        rs.getString("PLZ"),
                                        rs.getString("ort")));
                standortListe.add(new Standort( rs.getInt("s_id"),
                                                rs.getString("name"),
                                                rs.getString("strasse"),
                                                rs.getString("Hausnummer"),
                                                rs.getString("PLZ"),
                                                rs.getString("ort")));
            }
            System.out.println("########### Aus Arraylist ###########");
            System.out.println(standortListe);

            // Update eintrag
            sql2 = "UPDATE standort SET strasse='Sackgasse' WHERE s_id=4";
            stmt.executeUpdate(sql2);


            rs.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (con != null);
            {
                try {
                    con.close();
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
