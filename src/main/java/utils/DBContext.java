package utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CE190990 - Nguyen Hoai An
 */
public class DBContext {
    protected Connection db = null;

    public DBContext() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectString = "jdbc:sqlserver://localhost:1433;databaseName=CE190990_WS1_02;user=sa;password=123456;encrypt=true;trustServerCertificate=true;";
            db = DriverManager.getConnection(connectString);
            
            if (db != null)
                System.out.println("Database connected");
        } catch (Exception ex) {
            System.out.println("Database connect exception");
        }
    }
}