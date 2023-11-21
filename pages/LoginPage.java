package sample.demo;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.application.*;
import javafx.fxml.FXMLLoader;

public class LoginPage extends Application {

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginPage.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 664, 386);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Sanrio Airlines Login");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
