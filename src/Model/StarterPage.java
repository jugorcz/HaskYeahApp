package Model;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StarterPage {
    private Stage owner;
    private int widthScene=850;
    private int heightScene=700;
    private int widthStage=850;
    private int heightStage=700;
    private String title = "Oldness";
    private Scene scene;
    private VBox root;
    private int topMarg = 15;
    private int rightMarg = 12;
    private int bottomMarg = 15;
    private int leftMarg = 12;
    private int rootSpacing = 10;

    public StarterPage(){

        new JFXPanel();
        owner = new Stage(StageStyle.DECORATED);
        root = new VBox();
        scene = new Scene(root, widthScene, heightScene);
        scene.getStylesheets().add(StarterPage.class.getResource("../stylesheet/desktop.css").toExternalForm());
        setStageProperty();
        setHBoxProperty();
    }

    public void setStageProperty(){
        owner.setScene(scene);
        owner.setTitle(title);
        owner.setWidth(widthStage);
        owner.setHeight(heightStage);
        owner.toBack();
        owner.show();
    }

    public void setHBoxProperty() {
        root.setPadding(new Insets(topMarg, rightMarg, bottomMarg, leftMarg));
        root.setSpacing(rootSpacing);
    }

    public void showStarterPage(){

        Button firstBttn = new Button("Log In");
        firstBttn.setId("loginBttn");
        firstBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button secondBttn = new Button("Log In");
        secondBttn.setId("loginBttn");
        secondBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button thirdBttn = new Button("Log In");
        thirdBttn.setId("loginBttn");
        thirdBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button fourthBttn = new Button("Log In");
        fourthBttn.setId("loginBttn");
        fourthBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button fifthBttn = new Button("Log In");
        fifthBttn.setId("loginBttn");
        fifthBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button sixthBttn = new Button("Log In");
        sixthBttn.setId("loginBttn");
        sixthBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button seventhBttn = new Button("Log In");
        seventhBttn.setId("loginBttn");
        seventhBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button eightBttn = new Button("Log In");
        eightBttn.setId("loginBttn");
        eightBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button ninthBttn = new Button("Log In");
        ninthBttn.setId("loginBttn");
        ninthBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button tenthBttn = new Button("Log In");
        tenthBttn.setId("loginBttn");
        tenthBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });


        Button goBttn = new Button("Go");
        goBttn.setId("go");
        goBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                DesktopPage menu = new DesktopPage();
                menu.showDesktopPage();
                owner.close();
            }
        });

        root.getChildren().addAll(firstBttn, secondBttn, thirdBttn, fourthBttn, fifthBttn, sixthBttn, seventhBttn,
                eightBttn, ninthBttn, tenthBttn, goBttn);
        root.setAlignment(Pos.BASELINE_CENTER);
    }
    
}

