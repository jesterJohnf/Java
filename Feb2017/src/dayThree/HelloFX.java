package dayThree;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by student on 15/02/2017.
 */
public class HelloFX extends Application {
    Label response;

    public static void main(String[] args) {
        launch(); //start the FX application
    }

    //overriding the start from the Application class
    public void start(Stage myStage) {
        myStage.setTitle("How is your day");

        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);

        //create a scene to put components (JContentPanel in Swing)
        Scene myScene = new Scene(rootNode, 300,100);

        myStage.setScene(myScene);

        //set label
        response = new Label("Please select your mood today");
        response.setStyle("-fx-text-fill: red;");

        //set 2 buttons
        Button btnBoom = new Button("BOOM!");
        Button btnManPound = new Button("MAN POUND!");

        btnBoom.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("You are BOOMING today!");
            }
        });

        //Java 8: Lambda Expression (shorter and more precise than code above)
        btnManPound.setOnAction((e) -> response.setText("We should MAN POUND right now!"));

        rootNode.getChildren().addAll(btnBoom,btnManPound,response);

        myStage.show();


    }

}
