package JavaFXMavenTrial.Scene;

import java.util.Random;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RandomRectangles {
    private static Scene scene = null;
    private static Pane displayRectPane = new Pane();

    public static Scene initiateScene() {
        return initiateScene(300, 300);
    }

    public static Scene initiateScene(int width, int height) {
        Button randomRectangleButton = new Button("Generate random rectangle");
        randomRectangleButton.setOnMouseClicked(e -> {
            generateRandomRectangle();
        });
        randomRectangleButton.setStyle("-fx-padding: 8px; -fx-font-size: 16px;");

        HBox hbox = new HBox(randomRectangleButton);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setStyle("-fx-background-color: beige");

        VBox vbox = new VBox(RandomRectangles.displayRectPane, hbox);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.setStyle("-fx-background-color: beige");

        RandomRectangles.scene = new Scene(vbox, width, height, Color.BEIGE);
        return RandomRectangles.scene;
    }

    private static void generateRandomRectangle() {
        Random rand = new Random();

        Rectangle newRect = new Rectangle(
                rand.nextInt((int) RandomRectangles.scene.getWidth() / 20),
                rand.nextInt((int) RandomRectangles.scene.getHeight() / 20),
                Color.rgb(
                        rand.nextInt(256),
                        rand.nextInt(256),
                        rand.nextInt(256),
                        rand.nextDouble()));

        newRect.setTranslateX(rand.nextInt((int) RandomRectangles.scene.getWidth()));
        newRect.setTranslateY(-rand.nextInt((int) RandomRectangles.scene.getHeight()));

        RandomRectangles.displayRectPane.getChildren().add(newRect);
    }
}
