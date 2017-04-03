package org.AD_P2.Algorithmen;

import org.AD_P2.Counter.Counter;

public class SiebDesErasthotenes extends Counter {

	public Boolean[] primzahlen(int n) {

		Boolean a[] = new Boolean[n];
		for (int i = 0; i < n; i++)
			a[i] = true;
		for (int i = 2; i < Math.sqrt(n); i++) {
			count();
			if (a[i] == true) {
				for (int j = 2; i * j < n; j++) {
					count();
					a[i * j] = false;
				}
			}
		}
		return a;
	}
}
