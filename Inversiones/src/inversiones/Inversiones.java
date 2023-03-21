package inversiones;

import java.text.DecimalFormat;

/***
 * METODO 1
 * Este m�todo se encargar� de calcular la inversi�n y mostrar para 
 * cada uno de los siguientes a�os, el saldo al finalizar el mismo.
 */
public class Inversiones {
public String[] calculadoraDeInversiones(double monto, double interesAnual, int cantidadDeAnios) {
	String[] inversiones = new String[cantidadDeAnios];
	double interesMensual = interesAnual/12;
	DecimalFormat frmt = new DecimalFormat("#.0000");  // Para mostrar 4 decimales en el resultado.
	
	for (int anio = 0; anio < inversiones.length; anio++) {
		for (int mes = 1; mes <= 12; mes++) {
			monto += monto*interesMensual;
		}
		inversiones[anio] = frmt.format(monto); // Almacena el saldo final de un a�o.
		System.out.println(inversiones[anio]);  // Muestra por patalla el saldo final de un a�o.
	}
	
    return inversiones;
}



/***
 * METODO 2
 *Este m�todo se encargar� de calcular y mostrar cuanto tiempo (en meses) se necesita 
 *para superar cierto saldo en la inversi�n.
 */
public int calculadoraDeMeses(double monto, double interesAnual, double minimoSaldoDeseado) {
	int meses = 0;
	double interesMensual = interesAnual/12;
	
	while(monto < minimoSaldoDeseado) {
		monto += monto*interesMensual;
		meses++;
	}
	System.out.println(meses); // Muestra por pantalla la cantidad de meses buscada.
	return meses;
}
}
