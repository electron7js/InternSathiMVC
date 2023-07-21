package com.webapp.conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    private static Connection con = null;

public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/gl3?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            System.out.println("connected");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Exeption" + ex);
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {
        connect();
    }
}
