package matriser;
public class matriseC {
public static int[][] skaler(int tall, int[][] matrise) {
		
		int m = matrise.length;
		int n = matrise[0].length;
		
		int[][] nymatrise = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				nymatrise[i][j] = tall * matrise[i][j];
			}}
		return nymatrise;
}}