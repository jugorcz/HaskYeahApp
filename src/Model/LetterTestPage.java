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

public class LetterTestPage {
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
    public ImageView imageView1;
    public ImageView imageView2;
    public ImageView imageView3;

    public LetterTestPage(){

        new JFXPanel();
        owner = new Stage(StageStyle.DECORATED);

    }

    public Scene setScene(){

        root = new VBox();
        Scene scene = new Scene(root, widthScene, heightScene);
        hbox = new HBox();
        setHBoxProperty();
        number = new NumbersController("");
        return scene;
    }

    public void setStageProperty(Scene scene){
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

    public void showLetterTestPage(){
        int[] chosen;
        chosen = number.generatorTestsNumbers();

        this.imageView1 = new ImageView(getImage(chosen[0]));
        this.imageView2 = new ImageView(getImage(chosen[1]));
        this.imageView3 = new ImageView(getImage(chosen[2]));

        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();

        button1.setGraphic(imageView1);
        button2.setGraphic(imageView2);
        button3.setGraphic(imageView3);

        button1.setId("go");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                sendAnswer(chosen[0]);
            }
        });

        button2.setId("go");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                sendAnswer(chosen[1]);
            }
        });

        button3.setId("go");
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                sendAnswer(chosen[2]);
            }
        });

        Button backBttn = new Button("BACK");
        backBttn.setId("go");
        backBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                NumberChoosePage menu = new NumberChoosePage();
                menu.showNumberChoosePage();
                owner.close();
            }
        });

        hbox.getChildren().addAll(button1, button2, button3);

        root.getChildren().addAll(hbox, backBttn);
        root.setAlignment(Pos.CENTER);
    }

    public void sendAnswer(int i){
        number.iscorrect(Integer.toString(i));
        scene = setScene();
        showLetterTestPage();
        owner.setScene(scene);
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
