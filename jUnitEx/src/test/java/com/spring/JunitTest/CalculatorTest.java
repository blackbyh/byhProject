package com.spring.JunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void test() {
		Calculator c = new Calculator();
		
		double res = c.sum(10, 20);
		//결과값(기대값), 결과값변수(실제값), 오차범위(허용오차 (시간도 가능하다))
		assertEquals(30, res, 0); // 20, res, 10
	}
}
