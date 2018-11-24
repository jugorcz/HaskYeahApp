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

public class GamePage {
    private Stage owner;
    private int widthScene=650;
    private int heightScene=600;
    private int widthStage=650;
    private int heightStage=600;
    private String title = "Login";
    private Scene scene;
    private VBox root;
    private int topMarg = 15;
    private int rightMarg = 12;
    private int bottomMarg = 15;
    private int leftMarg = 12;
    private int rootSpacing = 10;
    public int years;

    public GamePage(int years){

        new JFXPanel();
        owner = new Stage(StageStyle.DECORATED);
        root = new VBox();
        scene = new Scene(root, widthScene, heightScene);
        setStageProperty();
        setHBoxProperty();
        this.years=years;
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

    public void showDesktopPage() {

        Button game1 = new Button("Game1");
        game1.setId("loginBttn");
        game1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button game2 = new Button("Game2");
        game2.setId("loginBttn");
        game2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {


            }
        });

        Button game3 = new Button("Game3");
        game3.setId("loginBttn");
        game3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button game4 = new Button("Game4");
        game4.setId("loginBttn");
        game4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button game5 = new Button("Game5");
        game5.setId("loginBttn");
        game5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button game6 = new Button("Game6");
        game6.setId("loginBttn");
        game6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button game7 = new Button("Game7");
        game7.setId("loginBttn");
        game7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button game8 = new Button("Game8");
        game8.setId("loginBttn");
        game8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });


        Button endGame = new Button("QUIT");
        endGame.setId("end");
        endGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                StarterPage starter = new StarterPage();
                starter.showStarterPage();
                owner.close();
            }
        });

        if (years < 5) {
            root.getChildren().addAll(game1, game2, game3, game4, endGame);
            root.setAlignment(Pos.CENTER);
        } else {
            root.getChildren().addAll(game5, game6, game7, game8, endGame);
            root.setAlignment(Pos.CENTER);
        }
    }

//        TextField loginText = new TextField();
//        loginText.setMaxSize(140, TextField.USE_COMPUTED_SIZE);
//        loginText.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent ke) {
//                if (ke.getCode().equals(KeyCode.ENTER)) {
//
//                    // LibrariesPage login = new LibrariesPage();
//                    // login.showLibrariesPage(libraries);
//                }
//            }
//        });
//        TextField passwordText = new TextField();
//        passwordText.setMaxSize(140, TextField.USE_COMPUTED_SIZE);
//        passwordText.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent ke) {
//                if (ke.getCode().equals(KeyCode.ENTER)) {
//                    handleBttn(loginText.getText(), passwordText.getText());
//                }
//            }
//        });
//        Button loginBttn = new Button("Log In");
//        loginBttn.setId("loginBttn");
//        loginBttn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent e) {
//                handleBttn(loginText.getText(), passwordText.getText());
//            }
//        });
//
//        Button endGame = new Button("QUIT");
//        endGame.setId("end");
//        endGame.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent e) {
//                owner.close();
//            }
//        });
//
//        root.getChildren().addAll(loginText, passwordText, loginBttn, endGame);
//        root.setAlignment(Pos.CENTER);
//    }
//
//    public void handleBttn(String login, String password){
////        if(login.equals(profil.getName()) && password.equals(profil.getPassword())){
////            MenuPage menu = new MenuPage();
////            menu.showMenuPage(profil);
//        owner.close();
//        //       }


//

}
