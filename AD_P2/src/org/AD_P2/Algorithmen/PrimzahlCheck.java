package org.AD_P2.Algorithmen;

public class PrimzahlCheck {

	public static boolean primzahlen(int n) {

		boolean flag = true;

		for (int j = 2; j < n; j++) {
			if ((n % j == 0) && (j != n)) {
				flag = false;
			}
		}

		return flag;
	}

}
