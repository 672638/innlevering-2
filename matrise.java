package matriser;
public class matrise {
public static void skrivUt(int[][] matrise) {
	
	// TODO
	for (int i = 0; i < matrise.length; i++) {
		for (int j = 0; j < matrise[i].length; j++) {
			System.out.print(matrise[i][j] + " ");}
		
		System.out.println();
	}}}