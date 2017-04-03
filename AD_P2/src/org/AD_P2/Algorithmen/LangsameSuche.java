package org.AD_P2.Algorithmen;

import org.AD_P2.Counter.Counter;

public class LangsameSuche extends Counter {

	public Boolean[] primzahlen(int n) {

		Boolean a[] = new Boolean[n];

		for (int i = 0; i < n; i++) {
			a[i] = true;
		}

		for (int i = 2; i < n; i++) {
			count();
			for (int j = 2; j < n; j++) {
				count();
				if ((i % j == 0) && (j != i)) {
					a[i] = false;
				}
			}
		}
		return a;
	}
}
