import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista ring, mille suurust saab kasutaja Slideriga muuta
 */
public class JavaFX extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);

        Circle ring = new Circle(50);

        Slider slaider = new Slider();
        slaider.setMin(5);
        slaider.setMax(100);
        slaider.setValue(50);
        slaider.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            ring.setRadius((Double) uusVaartus);
            System.out.println("Uus v22rtus on: " + uusVaartus);
        });
        grid.add(slaider, 1, 1);

        grid.add(ring, 1, 2);
        primaryStage.show();
    }
}
