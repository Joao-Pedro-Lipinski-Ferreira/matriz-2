package atvMatrizes;

public class atv06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int [7][8];
		
		for(int linha = 0; linha < 7; linha++) {
			for(int coluna = 0; coluna < 8; coluna++) {
				matriz[linha][coluna] = linha + coluna;
			}
			
		}
		
		for(int linha2 = 0; linha2 < 7; linha2++) {
			for(int coluna2 = 0; coluna2 < 8; coluna2++) {
				System.out.println(matriz[linha2][coluna2]);
			}
			
		}
		
	}

}
