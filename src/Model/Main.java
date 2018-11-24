package Model;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        StarterPage starter = new StarterPage();
        starter.showStarterPage();

    }

    public static void main(String[] args) {
        launch(args);
    }
}