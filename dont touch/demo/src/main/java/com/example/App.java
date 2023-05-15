package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.InputStream;
import java.io.FileInputStream;
import javafx.scene.layout.*;

/**
 * JavaFX App
 */
public class App extends Application {
    private static Scene scene;
    public String file = "";
    public int yeet = 0;
    int count = 0;
    Text t;
    BorderPane bp = new BorderPane();

    @Override
    public void start(Stage stage) throws IOException {
        //Pane
        
        HBox hbox = new HBox();
        HBox rightHBox = new HBox();
        bp.setStyle("-fx-background-color: #246427;");
        
        //Buttons
        Button hit = new Button("Hit");
        Button stand = new Button("Stand");
        hbox.setPadding(new Insets(0, 0, 150, 295));
        bp.setBottom(hbox);
        hbox.getChildren().addAll(hit, stand);
        hbox.setSpacing(25);


        file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/cardBack.png";

        hit.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0) {
                int random = (1 + (int)(Math.random() * ((11 - 1) + 1)));
                System.out.println(random);        
                if (random == 1 || random == 11) {
                    file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/ace.png";
                }
                else if (random == 2) {
                    file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/two.png";
                }
                else if (random == 3) {
                    file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/three.png";
                }
                else if (random == 4) {
                    file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/four.png";
                }
                else if (random == 5) {
                    file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/five.png";
                }
                else if (random == 6) {
                    file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/six.png";
                }
                else if (random == 7) {
                    file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/seven.png";
                }
                else if (random == 8) {
                    file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/eight.png";
                }
                else if (random == 9) {
                    file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/nine.png";
                }
                else {
                    file = "C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/ten.png";
                }
                yeet++;
                yeet();
            }
        });       
        //Image
        InputStream card = new FileInputStream("C:/Users/games/Downloads/dont touch/demo/src/main/java/com/example/cards/cardBack.png");
        Image image = new Image(card);
        ImageView imageView = new ImageView();
        imageView.setImage(image);

        InputStream card2 = new FileInputStream(file);
        Image image2 = new Image(card2);
        ImageView imageView2 = new ImageView();
        imageView2.setImage(image2);

        HBox centerHBox = new HBox();
        centerHBox.getChildren().addAll(imageView, imageView2);
        centerHBox.setPadding(new Insets(230, 0, 0, 275));
        centerHBox.setSpacing(25);
        bp.setCenter(centerHBox);

        //Scene
        scene = new Scene(bp, 700, 525);
        stage.setScene(scene);
        stage.show();
    }  
    
    public void yeet() {
        try (InputStream card2 = new FileInputStream(file)) {
            Image image2 = new Image(card2);
            ImageView imageView2 = new ImageView();
            imageView2.setImage(image2);

            HBox centerHBox = new HBox();
            centerHBox.getChildren().add(imageView2);
            centerHBox.setPadding(new Insets(230, 0, 0, 275));
            centerHBox.setSpacing(25);
            bp.setCenter(centerHBox);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }

    
}