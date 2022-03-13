package org.junit.jupiter.api.Assertions.assertEquals;

import oracle.jdbc.logging.annotations.DisableTrace;

public class Assertions {
@Test
public void simple1() {
int A=1;
int B=1;
assertEquals(A, B);
}
@Test
public void simple2() {
int A=1;
int B=2;
assertEquals(A, B);
}
@DisableTrace
@Test
public void simple3() {
int A=1;
int B=3;
assertEquals(A, B);
}
private void assertEquals(int a, int b) {
	// TODO Auto-generated method stub
	
}
}