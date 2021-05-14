package application;

//Librerias
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 @author Elizabeth Sanchez
 */
//clase App - Ejecutable
public class App extends Application{
//Metodo para ejecutar, llamando a la interfaz UI    
     @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("ui.fxml"));
       
       primaryStage.setScene(new Scene(root));
       primaryStage.show();
    }
//Ejecucion con launch    
    public static void main(String[] args){
    launch(args);
    }

   

}

