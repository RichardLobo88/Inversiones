

package inversiones;

import java.text.DecimalFormat;

public class Inversion1 {
	double CapitalInicial;
	double InteresAnual ;
	int CantidadDeA�os ;
	double CapitalFinal;
	
	
	public Inversion1(double capitalInicial, double interesAnual, int cantidadDeA�os,double CapitalFinal) {
		
		CapitalInicial = capitalInicial;
		InteresAnual = interesAnual;
		CantidadDeA�os = cantidadDeA�os;
	for (int a�oActual=0; a�oActual< cantidadDeA�os ; a�oActual ++)
	for (int i= 0 ; i< 12; i++ ) {
			
		CapitalFinal = (CapitalInicial)*(Math.pow(1+InteresAnual/12, CantidadDeA�os));
		
					
								
				
	}
		DecimalFormat inv=  new DecimalFormat("#.0000");
		inv.format(CapitalFinal);
		System.out.println(inv.format(CapitalFinal)); 
		

	}
	}
