import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileNotFoundException;

public class fxFunctions {
    //Global variables
    String stageToCall = "default";
    int windowHeight = 600;
    int windowWidth = 800;


    public void callStage(Stage stage, GridPane grid){
        if(stageToCall.toLowerCase().equals("default")){
            defaultStage(stage, grid);
        }//End if statement
    }//End callStage


    private static void options(Stage stage, GridPane grid){

    }//End Options


    private static void defaultStage(Stage stage, GridPane grid){
        //Create Labels

        //Create fields
        TextArea paper = new TextArea();
        paper.setStyle("-fx-font-family: monospace");
        GridPane.setConstraints(paper, 1, 1);

        //Create Buttons

        //Placing stuff on the grid
        grid.getChildren().add(paper);


    }//End default stage

}//End Class
