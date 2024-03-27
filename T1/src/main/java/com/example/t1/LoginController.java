package com.example.t1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField; // Add this import
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginController {
    @FXML
    private TextField user_name;

    @FXML
    private TextField email;

    @FXML
    private PasswordField pass; // Use PasswordField instead of TextField for password

    @FXML
    void signup(ActionEvent event) throws IOException, SQLException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("task management.fxml"));
        Scene firstscene = new Scene(fxmlLoader.load());
        String user= user_name.getText();
        String email_id = email.getText();
        String password = pass.getText(); // Use getText() for PasswordField

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "swetha@9524#");
        String sql = "insert into user (?,?,?)";
        PreparedStatement statement1 = connection.prepareStatement(sql);
        statement1.setString(1, user);
        statement1.setString(2, email_id);
        statement1.setString(2, password);
        statement1.execute();

        Stage stage = new Stage();
        stage.setTitle("SIGN");
        stage.setScene(firstscene);
        stage.show();
    }
    @FXML
    void Login(ActionEvent event) throws IOException, SQLException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("task management.fxml"));
        Scene firstscene = new Scene(fxmlLoader.load());
        String user= user_name.getText();
        String email_id = email.getText();
        String password = pass.getText(); // Use getText() for PasswordField

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "swetha@9524#");
        String sql = "insert into user (?,?,?)";
        PreparedStatement statement1 = connection.prepareStatement(sql);
        statement1.setString(1, user);
        statement1.setString(2, email_id);
        statement1.setString(2, password);
        statement1.execute();

        Stage stage = new Stage();
        stage.setTitle("LOG");
        stage.setScene(firstscene);
        stage.show();
    }
}