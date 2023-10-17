package atvMatrizes;
import java.util.Scanner;

public class atv04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int matriz[][] = new int [5][5];
		int matrizCubica[][] = new int [5][5];
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Insira um número para aposição: "+linha+", "+coluna);
				matriz[linha][coluna] = sc.nextInt();
			}
			
		}
		
		for(int linha2 = 0; linha2 < matriz.length; linha2++) {
			for(int coluna2 = 0; coluna2 < matriz.length; coluna2++) {
				matrizCubica[linha2][coluna2] = matriz[linha2][coluna2] * matriz[linha2][coluna2];
			}
			
		}
		
		System.out.println("A matriz cúbica é: ");
		for(int linhaF = 0; linhaF < matriz.length; linhaF++) {
			for(int colunaF = 0; colunaF < matriz.length; colunaF++) {
				System.out.println(matrizCubica[linhaF][colunaF]);
			}
			
		}
		
	}

}
