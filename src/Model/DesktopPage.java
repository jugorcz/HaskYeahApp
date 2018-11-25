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

public class DesktopPage {
    private Stage owner;
    private int widthScene=850;
    private int heightScene=700;
    private int widthStage=850;
    private int heightStage=700;
    private String title = "Start";
    private Scene scene;
    private VBox root;
    private int topMarg = 50;
    private int rightMarg = 40;
    private int bottomMarg = 50;
    private int leftMarg = 40;
    private int rootSpacing = 100;

    public DesktopPage(){

        new JFXPanel();
        owner = new Stage(StageStyle.DECORATED);
        root = new VBox();
        scene = new Scene(root, widthScene, heightScene);
        scene.getStylesheets().add(DesktopPage.class.getResource("../stylesheet/desktop.css").toExternalForm());
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

    public void showDesktopPage(){

        Button loginBttn = new Button("Paint");
        loginBttn.setId("Paint");
        loginBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                NumberChoosePage starter = new NumberChoosePage();
                starter.showNumberChoosePage();
                owner.close();
            }
        });

        Button endGame = new Button("QUIT");
        endGame.setId("bck");
        endGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                owner.close();
            }
        });

        root.getChildren().addAll(loginBttn, endGame);
        root.setAlignment(Pos.BASELINE_CENTER);
    }

    public void handleBttn(String login, String password){
//        if(login.equals(profil.getName()) && password.equals(profil.getPassword())){
//            MenuPage menu = new MenuPage();
//            menu.showMenuPage(profil);
            owner.close();
 //       }

    }
}
