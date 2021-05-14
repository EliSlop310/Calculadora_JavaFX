package application;
/**
@author Elizabeth Sanchez
*/
//Clase Model - Metodo para el calculo
public class Model {
   
	public long calculate(long num1, long num2, String operator) {
		//Switch para las opciones de las operaciones basicas
		switch(operator) { 
			case "+": return num1 + num2;
			case "-": return num1 - num2;
			case "*": return num1 * num2;
			case "/": //Si el numero 2 es 0 por defecto = 0
				if (num2 == 0) return 0;
				return num1 / num2; //operacion normal
		}//Dado caso que haya error
		System.out.println("Operador desconocido "+ operator);
		return 0;
	}
}
