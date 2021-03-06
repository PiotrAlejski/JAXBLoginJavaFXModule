package pl.losK.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pl.losK.controller.MainController;


/**
 * Created by m.losK on 2017-03-15.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/MainView.fxml"));

        MainController mainController = new MainController(primaryStage);
        fxmlLoader.setController(mainController);

        StackPane stackPane = fxmlLoader.load();
        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Company app");
        primaryStage.setMinHeight(550);
        primaryStage.show();
    }
}
