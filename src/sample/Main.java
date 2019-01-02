package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Experiment 1");

        Button button1 = new Button("Blue");
        Button button2 = new Button("Green");
        Button button3 = new Button("Red");
        Button button4 = new Button("Yellow");

        button1.setStyle("-fx-background-color: blue; -fx-font-size: 2em;");
        button2.setStyle("-fx-background-color: green; -fx-font-size: 2em;");
        button3.setStyle("-fx-background-color: red; -fx-font-size: 2em; ");
        button4.setStyle("-fx-background-color: yellow; -fx-font-size: 2em; ");

        button1.setWrapText(true);
        button2.setWrapText(true);
        button3.setWrapText(true);
        button4.setWrapText(true);

        HBox hbox = new HBox(button1, button2, button3, button4);


        Scene scene = new Scene(hbox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

