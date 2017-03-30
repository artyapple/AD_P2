package org.AD_P2.Algorithmen;

public class LangsameSuche {

	public static Boolean[] primzahlen(int n) {

		Boolean a[] = new Boolean[n];

		for (int i = 0; i < n; i++) {
			a[i] = true ;
		}

		for (int i = 2; i < n; i++) {
			for (int j = 2; j < n; j++) {
				if ((i % j == 0) && (j != i)) {
					a[i] = false;
				}
			}
		}
		return a;
	}
}
