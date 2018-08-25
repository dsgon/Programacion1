package ar.edu.ort.programacion1.tp1.ejercicio3;

public class Cuadrado {

	public static void main(String[] args) {
		int[][] cuadrado = { {2,7,6},{9,5,1},{4,3,8} };
		int valorMagico = 0;
		int[] acumulador = new int[8];
		int a = cuadrado.length-1;
		boolean result = true;
		for (int i=0; i<cuadrado.length; i++) {
			acumulador[0] += cuadrado[0][i];
			acumulador[1] += cuadrado[1][i];
			acumulador[2] += cuadrado[2][i];
			acumulador[3] += cuadrado[i][0];
			acumulador[4] += cuadrado[i][1];
			acumulador[5] += cuadrado[i][2];
			acumulador[6] += cuadrado[i][i];
			acumulador[7] += cuadrado[i][a];
			a--;
		}
		valorMagico = acumulador[0];
		int j=1;
		while (result&&(j<acumulador.length)){
			if(valorMagico!=acumulador[j]){
				result=false;
			}
			j++;
		}
		if(result){
			System.out.println(0);
		} else{
			System.out.println(1);
		}
	}

}
