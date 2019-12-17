package org.cboard.dataprovider.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSpringBlob {
    static String url = "jdbc:postgresql://192.168.59.1:5432/cboard";

    static String usr = "postgres";

    static String psd = "1";


    public static void main(String args[]) {

        Connection conn = null;

        try {

            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, usr, psd);

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM dashboard_user");

            while (rs.next()) {

                System.out.print(rs.getString(1));

                System.out.print("  ");

                System.out.println(rs.getString(2));

            }

            rs.close();

            st.close();

            conn.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}