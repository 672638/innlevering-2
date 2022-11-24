package tabelller;
public class tabellB {
public static String tilStreng(int[] tabell) {

		String str = "[";

		for (int i = 0; i < tabell.length; i++) {

			str = str + tabell[i];
			if (i < tabell.length - 1) {
				str = str + ",";
			}}

		str = str + "]";
		return str;
	}}