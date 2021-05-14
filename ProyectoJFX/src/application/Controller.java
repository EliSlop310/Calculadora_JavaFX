package application;

/**
 * @author Elizabeth Sanchez
 */
//Librerias
import java.awt.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

//Clase Controller - Logica
public class Controller {
    
//Variables para la clase	
	@FXML
    private Text output;
    
    private long num1 = 0;
    private String operator = "";
    private boolean start = true;
    
    private Model model = new Model();
    
//Metodo para insercion de numeros dentro del contenedor    
    @FXML
    private void processNumpad(ActionEvent event){
    if(start) {
     output.setText("");
     start = false;
    }
    String value = ((Button)event.getSource()).getText();
    output.setText(output.getText() + value);
 //Evalua el contenido enviado por medio de eventos de boton   
   //tomando el texto 
    }

//Metodo para los operadores al ser enviados en el contenedor    
    @FXML
    private void processOperator(ActionEvent event){
    String value = ((Button)event.getSource()).getText();
    //Obtiene los operadores y evalua su valor hasta detectar el =
    if(!"=".equals(value)) {
    	if (!operator.isEmpty())
    		return;
    	//Observa si tiene o no un numero previo para decidir si 
    	//deve pasar al switch de la clase Model
    	operator = value;
    	num1 = Long.parseLong(output.getText());
    	output.setText("");
    }else {
    	if(operator.isEmpty())
    		return;
    	//De terminar el procedimiento manda los valores al metodo calculate para hacer la operacion
    	output.setText(String.valueOf(model.calculate(num1, Long.parseLong(output.getText()), operator)));
    	operator = "";
    }
    }
}
