package org.AD_P2.Algorithmen;

import org.AD_P2.Counter.Counter;

public class PrimzahlCheck extends Counter {

	public boolean primzahlen(int n) {

		boolean flag = true;

		for (int j = 2; j < n; j++) {
			count();
			if ((n % j == 0) && (j != n)) {
				flag = false;
			}
		}

		return flag;
	}

}
