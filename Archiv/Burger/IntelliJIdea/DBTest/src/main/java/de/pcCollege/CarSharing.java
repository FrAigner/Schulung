package de.pcCollege;

import java.sql.*;
import java.util.ArrayList;

public class CarSharing {
    public static void main(String[] args) {
//        System.out.println("München ist schön");
        String dbHost = "jdbc:mysql://localhost";
        String dbUser = "carsharing";
        String dbPasswort = "carsharing";
        String dbName = "carsharing";
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbHost, dbUser, dbPasswort);
            Statement stmt = con.createStatement();
            String [] sql = {"USE " + dbName,
                    "CREATE TABLE IF NOT EXISTS standort (s_id INT NOT NULL AUTO_INCREMENT, " +
                            "name varchar(50), " +
                            "strasse varchar(50), " +
                            "hausnummer varchar(10), " +
                            "plz varchar(5), " +
                            "ort varchar(50), " +
                            "PRIMARY KEY(s_id))"};
            for (int i = 0; i < sql.length; i++) {
                stmt.executeUpdate(sql[i]);
            }
            String sql2 = "INSERT INTO standort (name, strasse, hausnummer, plz, ort) VALUES ('München', 'Musterstraße', '234', '10000', 'München')";
            // Rückgabe int
            int r = stmt.executeUpdate(sql2);
            sql2 = "SELECT * FROM standort";
            ResultSet rs = stmt.executeQuery(sql2);
            ArrayList<Standort> standortListe = new ArrayList<>();
            while (rs.next())
            {
                System.out.println(String.format("Id = %d, " +
                        "Name = %s, " +
                        "Straße = %s, " +
                        "Hausnummer = %s, " +
                        "PLZ = %s, Ort = %s",
                        rs.getInt("s_id"),
                        rs.getString("name"),
                        rs.getString("strasse"),
                        rs.getString("hausnummer"),
                        rs.getString("plz"),
                        rs.getString("ort")));
                standortListe.add(new Standort(rs.getInt("s_id"), rs.getString("name"),
                        rs.getString("strasse"),
                        rs.getString("hausnummer"),
                        rs.getString("plz"),
                        rs.getString("ort")));
            }
            System.out.println("******* Aus ArrayList *******");
            System.out.println(standortListe.toString());
            sql2 = "UPDATE standort SET strasse='Sackgasse' WHERE s_id=5";
            stmt.executeUpdate(sql2);
            rs.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (con != null)
            {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
