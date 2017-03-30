package org.AD_P2.Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.*;
import org.AD_P2.Algorithmen.PrimzahlCheck;

public class TestPrimzahlCheck {

	@Test
	public void test() {

		Integer primArray[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
				89, 97 };

		for (int i = 0; i < primArray.length; i++) {
			System.out.println(primArray[i]);
			assertTrue(PrimzahlCheck.primzahlen(primArray[i]));
		}

	}
}
