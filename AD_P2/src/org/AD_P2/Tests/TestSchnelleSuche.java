package org.AD_P2.Tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.AD_P2.Algorithmen.SchnelleSuche;
import org.junit.*;

public class TestSchnelleSuche {

	@Test
	public void test() {
		Integer primArray[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
				89, 97 };
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(primArray));
		Iterator<Integer> iterator = list.iterator();

		Boolean isPrim[] = SchnelleSuche.primzahlen(100);

		for (int i = 2; i < 100; i++) {
			if (isPrim[i] == true) {
				assertTrue(i == iterator.next());
			}
		}
	}

}
