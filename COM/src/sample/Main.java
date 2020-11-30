package sample;

import JNI.ComReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import JNI.*;

public class Main {

    public static void main(String[] args) {
//        launch(args);
        System.loadLibrary("ComReader");
        ComReader reader = new ComReader();
        System.out.println(reader.sum(2, 5));
    }
}
