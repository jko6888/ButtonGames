package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

import javafx.scene.text.TextBuilder;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Gamecode extends Application{
    public Label username;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    private Button startButton;

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox root = new VBox();
        Scene scene = new Scene(root,500,500);

        primaryStage.setTitle("Simon Says");
        primaryStage.setScene(scene);

        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        HBox buttonContainer = new HBox();
        buttonContainer.setAlignment(Pos.CENTER);
        buttonContainer.setSpacing(10);

        button1 = new Button("Yellow");
        button2 = new Button("Blue");
        button3 = new Button("Red");
        button4 = new Button("Green");

        buttonContainer.getChildren().addAll(button1, button2, button3, button4);

        HBox controlContainer = new HBox();
        controlContainer.setAlignment(Pos.CENTER);
        controlContainer.setSpacing(10);
        final TextField name = new TextField();
        name.setPromptText("Enter your name");
        name.setPrefColumnCount(10);
        name.getText();

        startButton = new Button("Start");
        controlContainer.getChildren().addAll(startButton, name);


        root.getChildren().addAll(buttonContainer, controlContainer);
        scene.getStylesheets().add(this.getClass().getResource("Display.css").toExternalForm());

        startButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                controlContainer.getChildren().removeAll(startButton, name);
                int round = 0;
                for(int i = 0; i< round + 1;i++)
                {
                    int r = (int)((Math.random() *4) + 1);
                    System.out.println(i);
                    System.out.println(r);
                    if(r == 1)
                    {
                        button1.setStyle("-fx-background-color: yellow;");
                    }
                    if(r == 2)
                    {
                        button2.setStyle("-fx-background-color: blue;");
                    }
                    if(r == 3)
                    {
                        button3.setStyle("-fx-background-color: red;");
                    }
                    if(r == 4)
                    {
                        button4.setStyle("-fx-background-color: green;");
                    }

                    round++;
                    try
                    {
                        wait(100);
                    }
                    catch ( InterruptedException error)
                    {
                        System.out.println("OW");
                    }
                }
            }
        });

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


    public void lightUp()
    {
        int round = 0;
        for(int i = 1; i< round + 1;i++)
        {
            int r = (int)((Math.random() *4) + 1);
            System.out.println(i);
            if(r == 1)
            {
                button1.setStyle("-fx-background-color: yellow;");
            }
            if(r == 2)
            {
                button2.setStyle("-fx-background-color: blue;");
            }
            if(r == 3)
            {
                button3.setStyle("-fx-background-color: red;");
            }
            if(r == 4)
            {
                button4.setStyle("-fx-background-color: green;");
            }

        }
    }



}