
package pkg4.pkg3.pkg2.anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Iván Zambrana Naranjo
 */
public class AnonymousInnerCLass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Creating buttons
        Button btnNew = new Button("New");
        Button btnOpen = new Button("Open");
        Button btnSave = new Button("Save");
        Button btnPrint = new Button("Print");
        
        //New Button Event
        btnNew.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo proceso");
            }
        });
        
        //Open Button Event
        btnOpen.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir proceso");
            }
        });
        
        //Save Button Event
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guradar proceso");
            }
        });
        
        //Print Button Event
        btnPrint.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir proceso");
            }
        });
        
        //Creating HBox
        HBox hbox = new HBox(4);
        hbox.getChildren().add(btnNew);
        hbox.getChildren().add(btnOpen);
        hbox.getChildren().add(btnSave);
        hbox.getChildren().add(btnPrint);
        HBox.setMargin(btnNew, new Insets(10, 0, 10, 10));
        HBox.setMargin(btnOpen, new Insets(10, 0, 10, 0));
        HBox.setMargin(btnSave, new Insets(10, 0, 10, 0));
        HBox.setMargin(btnPrint, new Insets(10, 0, 10, 0));
        
        
        
        //Creating scene
        Scene scene = new Scene(hbox, 200, 50);
        
        primaryStage.setTitle("AnonymousHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
