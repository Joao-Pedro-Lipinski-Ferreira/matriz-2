package atvMatrizes;
import java.util.Scanner;

public class atv01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int matriz[][] = new int [5][5];
		int matrizPar[][] = new int [5][5];
		int contPar = 0;
		int mediaPar;
		int cont = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Insira um número para a posição: "+linha+", "+coluna);
				matriz[linha][coluna] = sc.nextInt();
				
				if (matriz[linha][coluna] % 2 == 0) {
					contPar = contPar + matriz[linha][coluna];
					cont++;
					matrizPar[linha][coluna] = matriz[linha][coluna];
				}
				
			}
			
		}
		
		mediaPar = contPar / cont;
		System.out.println("A média dos números pares inseridos é de: "+mediaPar);
		System.out.println("E os números pares são: ");
		for(int cont2 = 0; cont2 < matriz.length; cont2++) {
			for(int cont3 = 0; cont3 < matriz.length; cont3++) {
				if (matrizPar[cont2][cont3] != 0) {
					System.out.print(matrizPar[cont2][cont3]+", ");
				}
				
			}
			
		}
		
	}

}
