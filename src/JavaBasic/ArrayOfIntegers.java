package JavaBasic;

import java.util.Arrays;

public class ArrayOfIntegers {
	
	public static void main(String[] args) {
		
		int[] numerosInteiros = new int[11];
		
		numerosInteiros[0] = -5;
		numerosInteiros[1] = -4;
		numerosInteiros[2] = -3;
		numerosInteiros[3] = -2;
		numerosInteiros[4] = -1;
		numerosInteiros[5] = 0;
		numerosInteiros[6] = 1;
		numerosInteiros[7] = 2;
		numerosInteiros[8] = 3;
		numerosInteiros[9] = 4;
		numerosInteiros[10] = 5;		
		
		ArrayOfIntegers arrayOfIntegers = new ArrayOfIntegers();		
		System.out.println(Arrays.toString(arrayOfIntegers.getResultado(numerosInteiros)));
		
	}
	
	private int[] getResultado(int[] numerosInteiros) {
		int[] resultado = new int[2];
		

		if ((numerosInteiros == null) || (numerosInteiros.length == 0)) {			
			return new int[0];
		}
		
		resultado[0] = this.getQtdPositivos(numerosInteiros);
		resultado[1] = this.getSomaNegativos(numerosInteiros);
		
		return resultado;
	}
	
	private int getQtdPositivos(int[] numerosInteiros) {
		int contador = 0;
		
		for(int i = 0; i < numerosInteiros.length; i++) {
			if (numerosInteiros[i] > 0) {
				contador = contador + 1;				
			} 					
		}
		
		return contador;
		
	}
	
	private int getSomaNegativos(int[] numerosInteiros) {
		int somador = 0;
		
		for(int i = 0; i < numerosInteiros.length; i++) {
			if (numerosInteiros[i] < 0) {
				somador = numerosInteiros[i] + somador;
			}
		}
		return somador;
		
	}
	
	
}
