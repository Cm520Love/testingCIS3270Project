package sample.demo;
import javafx.fxml.FXML;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.application.*;
import javafx.scene.image.*;
import javafx.scene.shape.*;

public class LoginController {

    @FXML
    private Label newUserLabel;
    @FXML
    private Label usernameLabel;
    @FXML
    private Label passwordLabel;
    @FXML
    private Label forgotPasswordLabel;
    @FXML
    private ImageView icon;
    @FXML
    private TextField usernameEntry;
    @FXML
    private PasswordField passwordEntry;
    @FXML
    private Rectangle loginBox;
    @FXML
    private ImageView background;


    @FXML
    public void onLoginButtonClicked() {
        String username = usernameEntry.getText();
        String password = passwordEntry.getText();

        common.Access.getAccess(username, password);
    }

}
