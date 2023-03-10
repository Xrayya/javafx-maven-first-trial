package JavaFXMavenTrial.Components;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TransformRect {
    public static Parent createRect() {
        Rectangle box = new Rectangle(100, 50, Color.AQUA);
        transform(box);
        return new Pane(box);
    }

    static void transform(Rectangle box) {
        box.setTranslateX(100);
        box.setTranslateY(100);

        box.setScaleX(2);

        box.setRotate(45);
    }
}
