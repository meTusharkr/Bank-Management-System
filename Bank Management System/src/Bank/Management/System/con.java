package Bank.Management.System;

import java.sql.*;

public class con {

    Connection connection;
    Statement statement;

    public con() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankSystem?useSSL=false&serverTimezone=UTC",
                    "root",
                    "#Flstudio21"
            );
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
