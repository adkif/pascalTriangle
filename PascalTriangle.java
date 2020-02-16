public class PascalTriangle {
	public static void main(String[] args) {
		final int N = 50;
		final int M = 50;
		int[][] tableau = new int[M][N];
		tableau[0][0] = 1;
		for (int i = 0; i < tableau.length; i++) {
			tableau[i][0] = 1;
			tableau[i][i] = 1;
			for (int j = 1; j < i-1; j++) {
				tableau[i][j] = tableau[i-1][j-1] + tableau[i-1][j];
			}
		}
		
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(tableau[i][j]+" ; ");
			}
			System.out.println();
		}
	}
}