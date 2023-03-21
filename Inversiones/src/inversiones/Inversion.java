package inversiones;

import java.text.DecimalFormat;

public class Inversion {

	public static void main(String[] args) {
		double CapitalInicial =1000;
		double InteresAnual= 0.71355714 ;
		int CantidadDeAños= 5 ;
		
			
			for ( int i = 0 ; i <12; i++ ) {
				
					CapitalInicial *=  (Math.pow(1+InteresAnual/12, CantidadDeAños));
							
							
							DecimalFormat inv=  new DecimalFormat("#.0000");
							inv.format(CapitalInicial);
							System.out.println(inv.format(CapitalInicial));	
			
		}
	
		}
		}

