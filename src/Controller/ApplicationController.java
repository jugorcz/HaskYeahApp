package Controller;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ApplicationController implements IApplicationController {


    @Override
    public void show() {

    }

    @Override
    public void createGame(String nameGame) {


        switch (nameGame) {
            case "Numbers":
                System.out.println("Cyferki");


            default: {
                System.out.println("Nie ma takiej gry");

            }
        }


    }

    @Override
    public void message() {

    }


}
