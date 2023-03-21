package inversiones;

import java.text.DecimalFormat;

public class CalculoDeInversiones {
	double CapitalInicial ;
	double InteresAnual ;
	int CantidadDeAños ;
	double CapitalFinal;
	int  MesesDelAño= 12;
	

	
public CalculoDeInversiones(double capitalInicial, double interesAnual, int cantidadDeAños,double CapitalFinal) {
		
		CapitalInicial = capitalInicial;
		InteresAnual = interesAnual;
		CantidadDeAños = cantidadDeAños;
		
	
	for (int i= 0 ; i< 12; i++ ) {
			
		CapitalFinal = (CapitalInicial)*(Math.pow(1+InteresAnual/12, CantidadDeAños));
					
						
		}
	
		DecimalFormat inv=  new DecimalFormat("#.0000");
		inv.format(CapitalFinal);
		System.out.println(inv.format(CapitalFinal)); 
	
		
		}
public double 	RecuperarInversiones  (final double CapitalInicial , final double InteresAnual , final double CapitalFinal,int MesesDelaño) {
	
	double numerador = Math.log(CapitalFinal / CapitalInicial );
	double denominador = MesesDelAño  * Math.log((1 + InteresAnual / MesesDelAño));
	return Math.ceil(numerador / (denominador * 12));

		}
		}
	
	


