package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
    Основной класс



     подключить к проекту
    библиотеку JavaFx и коннектор MySQL
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Список дел");
        primaryStage.setScene(new Scene(root, 250, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
