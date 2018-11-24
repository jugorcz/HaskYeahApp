package Model;

import Controller.NumbersController;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class NumbersPage {
    private Stage owner;
    private int widthScene=650;
    private int heightScene=600;
    private int widthStage=650;
    private int heightStage=600;
    private String title = "Numbers";
    private Scene scene;
    private VBox root;
    private int topMarg = 15;
    private int rightMarg = 12;
    private int bottomMarg = 15;
    private int leftMarg = 12;
    private int rootSpacing = 10;
    public HBox hbox;
    public NumbersController number;
    public ImageView imageView;

    public NumbersPage(){

        new JFXPanel();
        owner = new Stage(StageStyle.DECORATED);
        root = new VBox();
        scene = new Scene(root, widthScene, heightScene);
        hbox = new HBox();
        setStageProperty();
        setHBoxProperty();
        number = new NumbersController("");
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
        hbox.setPadding(new Insets(topMarg, rightMarg, bottomMarg, leftMarg));
        hbox.setSpacing(rootSpacing);
        hbox.setAlignment(Pos.CENTER);
    }

    public void showNumbersPage(){
        int chosen;
        chosen = number.generatorOneNumber();
        this.imageView = new ImageView(getImage(chosen));

        Button prevBttn = new Button("<-");
        prevBttn.setId("loginBttn");
        prevBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleArrow();
            }
        });

        Button nextBttn = new Button("->");
        nextBttn.setId("loginBttn");
        nextBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                handleArrow();
            }
        });

        Button backBttn = new Button("BACK");
        backBttn.setId("go");
        backBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                DesktopPage menu = new DesktopPage();
                menu.showDesktopPage();
                owner.close();
            }
        });

        hbox.getChildren().addAll(prevBttn, imageView, nextBttn);

        root.getChildren().addAll(hbox, backBttn);
        root.setAlignment(Pos.CENTER);
    }

    public void handleArrow(){
        int chosen;
        chosen = number.generatorOneNumber();
        this.imageView.setImage(getImage(chosen));
    }

    public Image getImage(int chosen){
        Image image = null;
        switch(chosen) {
            case 0: {
                image = new Image("stylesheet/images/0.png");
                break;
            }
            case 1: {
                image = new Image("stylesheet/images/1.png");
                break;
            }
            case 2: {
                image = new Image("stylesheet/images/2.png");
                break;
            }
            case 3: {
                image = new Image("stylesheet/images/3.png");
                break;
            }
            case 4: {
                image = new Image("stylesheet/images/4.png");
                break;
            }
            case 5: {
                image = new Image("stylesheet/images/5.png");
                break;
            }
            case 6: {
                image = new Image("stylesheet/images/6.png");
                break;
            }
            case 7: {
                image = new Image("stylesheet/images/7.png");
                break;
            }
            case 8: {
                image = new Image("stylesheet/images/8.png");
                break;
            }
            case 9: {
                image = new Image("stylesheet/images/9.png");
                break;
            }


        }

        return image;
    }

}
