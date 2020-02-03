package encapsulation.account;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AccountApp extends Application {

	@Override
	public void start(final Stage primaryStage) throws Exception {
        primaryStage.setTitle("Account");
        primaryStage.setX(50);
        primaryStage.setY(50);
		Parent parent = FXMLLoader.load(AccountApp.class.getResource("Account.fxml"));
		primaryStage.setScene(new Scene(parent));
		primaryStage.show();
	}

	public static void main(final String[] args) {
		AccountApp.launch(args);
	}
}
