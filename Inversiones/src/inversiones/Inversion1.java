

package inversiones;

import java.text.DecimalFormat;

public class Inversion1 {
	double CapitalInicial;
	double InteresAnual ;
	int CantidadDeAños ;
	double CapitalFinal;
	
	
	public Inversion1(double capitalInicial, double interesAnual, int cantidadDeAños,double CapitalFinal) {
		
		CapitalInicial = capitalInicial;
		InteresAnual = interesAnual;
		CantidadDeAños = cantidadDeAños;
	for (int añoActual=0; añoActual< cantidadDeAños ; añoActual ++)
	for (int i= 0 ; i< 12; i++ ) {
			
		CapitalFinal = (CapitalInicial)*(Math.pow(1+InteresAnual/12, CantidadDeAños));
		
					
								
				
	}
		DecimalFormat inv=  new DecimalFormat("#.0000");
		inv.format(CapitalFinal);
		System.out.println(inv.format(CapitalFinal)); 
		

	}
	}
