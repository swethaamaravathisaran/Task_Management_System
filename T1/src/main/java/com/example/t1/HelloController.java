package com.example.t1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField; // Add this import
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;




import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloController {
    @FXML
    private  Button logintbn;

    @FXML
    private  Button signup;

    @FXML
    private TextField user_name;

    @FXML
    private TextField email_id;

    @FXML
    private PasswordField password;

    @FXML
    public void Login(ActionEvent event) throws IOException,SQLException  {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("task management.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());

        Stage stage = new Stage();
        stage.setTitle("Task");
        stage.setScene(firstscene);
        stage.show();
        System.out.println("Inserted successfully");

    }
    @FXML
    public void signup(ActionEvent event) throws IOException,SQLException{
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SIGN.fxml"));



        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Task");
        stage.setScene(firstscene);
        stage.show();
    }
    @FXML
    public void createaccount(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("P1.fxml"));


        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("alert");
        stage.setScene(firstscene);
        stage.show();
    }
    @FXML
    public void PRESS(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("task management.fxml"));


        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("alert");
        stage.setScene(firstscene);
        stage.show();
    }
    @FXML
    public void TOUCH(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CREATE.fxml"));


        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("alert");
        stage.setScene(firstscene);
        stage.show();
    }
    public void DELETE(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DELETE.fxml"));


        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("alert");
        stage.setScene(firstscene);
        stage.show();
    }
    public void CE(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("P2.fxml"));


        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("alert");
        stage.setScene(firstscene);
        stage.show();
    }
    public void SUCCESS(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("task management.fxml"));


        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("alert");
        stage.setScene(firstscene);
        stage.show();
    }
    public void DELETE1(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("P3.fxml"));


        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("alert");
        stage.setScene(firstscene);
        stage.show();
    }
    public void SUCCESS_2(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("task management.fxml"));


        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("alert");
        stage.setScene(firstscene);
        stage.show();
    }





}