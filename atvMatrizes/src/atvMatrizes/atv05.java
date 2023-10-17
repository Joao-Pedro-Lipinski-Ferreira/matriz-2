package atvMatrizes;
import java.util.Scanner;

public class atv05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float matriz[][] = new float [3][4];
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Insira um número para aposição: "+linha+", "+coluna);
				matriz[linha][coluna] = sc.nextFloat();
			}
			
		}
		
		System.out.println("O número no canto superior esquerdo é: "+matriz[0][0]);
		System.out.println("E o número no canto inferior esquerdo é: "+matriz[2][0]);
		
	}

}
