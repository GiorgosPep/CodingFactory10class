package gr.aueb.cf.ch18.bankapp_mysql.bankapp.core;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBHelper {
    private static final HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();

        //Config DB
        config.setJdbcUrl("jdbc:mysql://localhost:3306/bankdbdev?" +
                "sslMode=preferred&serverTimeZone=UTC&allowPublicKeyRetrieval=true");
        config.setUsername("bankuser10");
        config.setPassword("C0dingF@");

        dataSource = new HikariDataSource(config);
    }

    private DBHelper() {}

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
