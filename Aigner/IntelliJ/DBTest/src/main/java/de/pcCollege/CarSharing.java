package de.pcCollege;

import java.sql.*;
import java.util.ArrayList;

public class CarSharing {
    public static void main(String[] args) {
        String dbHost = "jdbc:mysql://localhost";
        String dbUser = "carsharing";
        String dbPasswort = "carsharing";
        String dbName = "carsharing";
        Connection con = null;
        //System.out.println("München");
        try {
            con = DriverManager.getConnection(dbHost + "?useUnicode=true&characterEncoding=utf-8", dbUser, dbPasswort);
            Statement stat = con.createStatement();

            // DB verwenden und Tabelle erstellen
            String[] sql = {"USE " + dbName,
                    "CREATE TABLE IF NOT EXISTS standort(s_id INT NOT NULL AUTO_INCREMENT, " +
                            "name varchar(50), " +
                            "strasse varchar(50), " +
                            "hausnummer varchar(10), " +
                            "plz varchar(5), " +
                            "ort varchar(50), " +
                            "PRIMARY KEY(s_id))"};
            for (int i = 0; i < sql.length; i++) {
                stat.executeUpdate(sql[i]);
            }

            // Werte in die Tabelle eintragen
            String sql2 = "INSERT INTO standort(name, strasse, hausnummer, plz, ort) " +
                    "VALUES" +
                    "('Berliner', 'Müsterstraße', '356', '10115', 'Berlin')";
            int r = stat.executeUpdate(sql2);


            // Werte auslesen
            sql2 = "SELECT * FROM standort";
            ResultSet rs = stat.executeQuery(sql2);
            ArrayList<Standort> standortListe = new ArrayList<>();
            while (rs.next())
            {
                System.out.println(String.format("id = %d " +
                        "Name = %s," +
                        "Strasse = %s," +
                        "Hausnummer = %s," +
                        "PLZ = %s," +
                        "Ort = %s",
                        rs.getInt("s_id"),
                        rs.getString("name"),
                        rs.getString("strasse"),
                        rs.getString("hausnummer"),
                        rs.getString("plz"),
                        rs.getString("ort")));

                standortListe.add(new Standort(
                        rs.getInt("s_id"),
                        rs.getString("name"),
                        rs.getString("strasse"),
                        rs.getString("hausnummer"),
                        rs.getString("plz"),
                        rs.getString("ort")));
            }
            System.out.println("###########################");
            System.out.println("###########################");
            System.out.println("Aus ArrayList"+standortListe);

            // Werte updaten
            sql2 = "UPDATE standort SET strasse='Sackgassen' WHERE s_id=1";
            stat.executeUpdate(sql2);

            //Verbindung wird geschlossen
            rs.close();
            con.close();

        } catch (SQLException e) {
            //throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
