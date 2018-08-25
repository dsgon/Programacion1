package ar.edu.ort.programacion1.tp1.ejercicio4;

public class PuntoDeSilla {

	public static void main(String[] args) {
		boolean result = false;
		int posX=0, posY=0;
		int[][] matriz = { {6,1,9},{2,3,4},{5,8,9}};
		
		int i=0;
		while(!result&&(i<matriz.length)){
			int j=0;
			while(!result&&(j<matriz[i].length)){
				posX=i;
				posY=j;
				int k=i+1;
				int l=j+1;
				result=true;
				while(result&&(l<matriz.length)&&(matriz[posX][posY]<matriz[i][l])){
					result=false;
					l++;
				}
				while(result&&(k<matriz[i].length)&&(matriz[posX][posY]>matriz[k][i])){
					result=false;
					k++;
				}
				j++;
			}
			i++;
		}
		if(result)
			System.out.println("Punto de Silla! el valor es :"
		+matriz[posX][posY]+" y esta en la posicion: ["+posX+"]["+posY+"]");
	}

}
