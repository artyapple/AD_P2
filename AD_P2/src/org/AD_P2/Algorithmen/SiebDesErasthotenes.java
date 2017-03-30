package org.AD_P2.Algorithmen;

public class SiebDesErasthotenes {

	public static Boolean[] primzahlen(int n) {

		Boolean a[] = new Boolean[n];
		for (int i = 0; i < n; i++)
			a[i] = true;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (a[i] == true) {
				for (int j = 2; i * j < n; j++)
					a[i * j] = false;
			}
		}
		return a;
	}
}
