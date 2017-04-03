package org.AD_P2.Tests;

import static org.junit.Assert.*;

import org.junit.*;
import org.AD_P2.Algorithmen.PrimzahlCheck;

public class TestPrimzahlCheck {

	@Test
	public void test() {
		PrimzahlCheck primChecker = new PrimzahlCheck();

		// test till 100
		assertTrue(primChecker.primzahlen(97));
		System.out.println("prim Check for 97: "+ primChecker.getOpCount());
		primChecker.reset();

		// test till 1000
		assertTrue(primChecker.primzahlen(21521));
		System.out.println("prim test till 21521: " + primChecker.getOpCount());
		primChecker.reset();

		// test till 10000
		assertTrue(primChecker.primzahlen(99991));
		System.out.println("prim test till 99991: " + primChecker.getOpCount());
		primChecker.reset();

	}
}
