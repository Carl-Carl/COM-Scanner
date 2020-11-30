package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jni.*;

public class Main {

    public static void main(String[] args) {
//        launch(args);
        System.loadLibrary("/src/cpp/ComReader");
        ComReader reader = new ComReader();
        System.out.println(reader.sum(2, 5));
    }
}
