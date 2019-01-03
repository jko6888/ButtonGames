package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamecode extends Application {
    public Label first;
    public Label second;
    public Label third;
    public Label fourth;

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane root = new GridPane();
        Scene scene = new Scene(root,500,300);

        primaryStage.setTitle("Simon Says");
        primaryStage.setScene(scene);

        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");

        root.add(button1, 1 , 0);
        root.add(button2, 2 , 0);
        root.add(button3, 3 , 0);
        root.add(button4, 4 , 0);

        scene.getStylesheets().add(this.getClass().getResource("Display.css").toExternalForm());




        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void sayHelloWorld(ActionEvent actionEvent) {
        first.setText("Hi");
        second.setText("Hi");
        third.setText("Hi");
        fourth.setText("Hi");
    }

    public void lightUp()
    {
        int round = 0;
        Random random = new Random();
        List<Integer> buttonOrder = new ArrayList();
        for(int i = 1; i< round + i;i++)
        {
            buttonOrder.add(random.nextInt(4));
        }
    }


}