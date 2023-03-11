package JavaFXMavenTrial;

import JavaFXMavenTrial.Scene.RandomRectangles;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Scene randomRectangleScene = RandomRectangles.initiateScene(500, 300);

        stage.setScene(randomRectangleScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
