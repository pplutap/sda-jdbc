package pl.sda.dao;

import pl.sda.DbConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionManager {

    private final DbConfiguration dbConfiguration;

    public JdbcConnectionManager(DbConfiguration dbConfiguration) throws ClassNotFoundException {
        this.dbConfiguration = dbConfiguration;
        Class.forName("org.postgresql.Driver");

    }

    public Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(dbConfiguration.getJdbcUrl(), dbConfiguration.getUsername(), dbConfiguration.getPassword());
        conn.setSchema(dbConfiguration.getSchema());
        return conn;
    }

}
