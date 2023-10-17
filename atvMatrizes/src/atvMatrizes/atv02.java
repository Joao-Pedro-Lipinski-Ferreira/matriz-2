package atvMatrizes;
import java.util.Scanner;

public class atv02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int matriz[][] = new int [7][4];
		int menorValor = 99999999;
		int menorLinha = 0;
		int menorColuna = 0;
		
		for(int linha = 0; linha < 7; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Insira um número para a posição: "+linha+", "+coluna);
				matriz[linha][coluna] = sc.nextInt();
				
				if (matriz[linha][coluna] < menorValor) {
					menorValor = matriz[linha][coluna];
					menorLinha = linha;
					menorColuna = coluna;
				}
				
			}
			
		}
		
		System.out.println("O menor valor é: "+menorValor);
		System.out.print("E a posição é: "+menorLinha+", "+menorColuna);

	}

}
