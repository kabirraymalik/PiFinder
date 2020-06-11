import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PiMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Scene showPi = new Scene(new ShowPi(), ShowPi.WIDTH, ShowPi.HEIGHT);
        primaryStage.setTitle("Pi Finder");
        primaryStage.setScene(showPi);

        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false);


    }
}
