package dev.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance0() {
		int distance = StringUtils.levenshteinDistance("hello","hello");
		
		assertEquals(0, distance);
	}

	@Test
	public void testLevenshteinDistance1() {
		int distance = StringUtils.levenshteinDistance("hello", "hellp");
		
		assertEquals(1, distance);
	}
	
	@Test
	public void testLevenshteinDistanceParam1Null() {
		int distance = StringUtils.levenshteinDistance(null, "hello");
		
		assertEquals(-1, distance);
	}
	
	@Test
	public void testLevenshteinDistanceParam2Null() {
		int distance = StringUtils.levenshteinDistance("hello", null);
		
		assertEquals(-1, distance);
	}
	
	@Test
	public void testLevenshteinDistanceBothParamsNull() {
		int distance = StringUtils.levenshteinDistance(null, null);
		
		assertEquals(-1, distance);
	}
	
	@Test
	public void testLevenshteinDistanceBothParamsEmpty() {
		int distance = StringUtils.levenshteinDistance("", "");
		
		assertEquals(0, distance);
	}
	
	@Test
	public void testLevenshteinDistanceWhiteSpace() {
		int distance = StringUtils.levenshteinDistance("  hello ", "hello");
		
		assertEquals(0, distance);
	}
	
	@Test
	public void testLevenshteinDistanceCaseSensitivity() {
		int distance = StringUtils.levenshteinDistance("HELLO", "hello");
		
		assertEquals(0, distance);
	}

}
