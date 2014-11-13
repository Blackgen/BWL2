package webshop.controller;

import entities.RAM;
import org.springframework.stereotype.Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by patrick_steinhauer on 12.11.2014.
 */
@Controller
public class DBController {
    private Connection connection;
    private PreparedStatement pstmtRam;

    public DBController() {
        createConnection();
    }

    private void createConnection() {
        //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        try {
            connection = DriverManager
                    .getConnection(
                            "jdbc:oracle:thin:@oracle.informatik.haw-hamburg.de:1521/inf09",
                            "abq295", "D0itallnightl0ngxd.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List<RAM> getRAMLikeEnteredRequest() {
        List<RAM> rams = new ArrayList<RAM>();

        try {
            String selectRAMLikeEnteredRequest = "SELECT * FROM PRODUCTS prod WHERE prod.";
            pstmtRam = connection.prepareStatement(selectRAMLikeEnteredRequest);
            ResultSet resultSet = pstmtRam.executeQuery();

            //  Zeileninhalt ermitteln
            while (resultSet.next()) {
                RAM ram = new RAM();
                ram.setRamID(resultSet.getInt("RAM_ID"));
                ram.setName(resultSet.getString("RAM_NAME"));
                ram.setDescription(resultSet.getString("RAM_DESCRIPTION"));
                rams.add(ram);
            }

            resultSet.close();
        } catch (SQLException ex) {
            System.out.println("Fehler");
        }

        return rams;
    }
}
