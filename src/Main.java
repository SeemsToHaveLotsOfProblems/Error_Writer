/*
 * This is the start of my writing program.
 * Remember to keep things organized and saved into a git repository.
 * There are 3 very important concepts you must learn for this program
 * 1 - How to slap a cat!
 * 2 - Saving and loading formatted text.
 * 3 - How to use separated Java class files.
 * 4 - How to build a JavaFX program.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Main extends Application {
    //Global variables
    static fxFunctions fxf = new fxFunctions();
    FileHandler fh = new FileHandler();


    public static void main(String[] args){
        //Create a Stage and set the scene (This should be in it's own class)
        Application.launch(args);
    }//End main function


    @Override
    public void start(Stage stage) throws Exception {
        //Setting stage variables
        stage.setTitle("Error Writer");

        try {
            FileHandler.fileReader("/Error_Writter/options");
             stage.setHeight(Double.parseDouble(FileHandler.data[2]));
             stage.setWidth(Double.parseDouble(FileHandler.data[1]));
        } catch (FileNotFoundException e) {
            stage.setHeight(fxf.windowHeight);
            stage.setWidth(fxf.windowWidth);
        }
        fxf.stageToCall = "default";

        //Creating a grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(15.0);
        grid.setHgap(10.0);

        //Making a root group
        Group root = new Group();
        root.getChildren().add(grid);

        //Creating a scene object
        Scene scene = new Scene(root, fxf.windowWidth, fxf.windowHeight);

        //Adding scene to the stage
        stage.setScene(scene);

        //Finding stage to call
        fxf.callStage(stage, grid);

        //Showing the stage
        stage.show();
    }
}//End main class
