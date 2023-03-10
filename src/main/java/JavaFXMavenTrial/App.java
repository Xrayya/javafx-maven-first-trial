package JavaFXMavenTrial;

import JavaFXMavenTrial.Components.TransformRect;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var jfxLabelScene = new Scene(new StackPane(label), 640, 480);

        var helloScene = new Scene(sayHello(), 100, 100);

        var rectScene = new Scene(TransformRect.createRect(), 300, 300);

        stage.setScene(rectScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private Parent sayHello() {
        return new StackPane(new Text("Hello"));
    }
}
