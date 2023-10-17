package atvMatrizes;
import java.util.Scanner;

public class atv03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int matriz[][] = new int [5][5];
		int somaDiagonalP = 0;
		int somaDiagonalS = 0;
		int somaLinha4 = 0;
		int somaColuna2 = 0;
		int somaMatriz = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Insira um número para a posição: "+linha+", "+coluna);
				matriz[linha][coluna] = sc.nextInt();
				
				somaMatriz = somaMatriz + matriz[linha][coluna];
			}
			
		}
		
		somaLinha4 = matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3] + matriz[3][4]; 
		somaColuna2 = matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][4] + matriz[4][4];
		somaDiagonalP = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3] + matriz[4][4];
		somaDiagonalS = matriz[4][0] + matriz[3][1] + matriz[2][2] + matriz[1][3] + matriz[0][4];
		
		System.out.println("A matriz é: ");
		for(int cont = 0; cont < matriz.length; cont++) {
			for(int cont2 = 0; cont2 < matriz.length; cont2++) {
				System.out.print(matriz[cont][cont2]+", ");
			}
			
		}
		
		System.out.println("\nA soma dos números da linha 4 é: "+somaLinha4);
		System.out.println("A soma dos números da coluna 2 é: "+somaColuna2);
		System.out.println("A soma da diagonal principal é: "+somaDiagonalP);
		System.out.println("A soma da diagonal secundária é: "+somaDiagonalS);
		
	}

}
