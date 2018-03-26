package com.greenfoxacademy.finalexam;

import org.junit.Before;
import org.junit.Test;

import static com.greenfoxacademy.finalexam.FinalexamApplication.shifterFunction;
import static org.junit.Assert.*;

public class FinalexamApplicationTest {

  @Test
  public void shifterFunctionTest0() throws Exception {
    int[] listin = {1, 2, 3, 4, 5};
    int shifter = 0;
    int[] listout = {1, 2, 3, 4, 5};
    assertArrayEquals(listout, shifterFunction(listin, shifter));
  }

  @Test
  public void shifterFunctionTes1() throws Exception {
    int[] listin = {1, 2, 3, 4, 5};
    int shifter = 1;
    int[] listout = {5, 1, 2, 3, 4};
    assertArrayEquals(listout, shifterFunction(listin, shifter));
  }

  @Test
  public void shifterFunctionTest2() throws Exception {
    int[] listin = {1, 2, 3, 4, 5};
    int shifter = 2;
    int[] listout = {4, 5, 1, 2, 3};
    assertArrayEquals(listout, shifterFunction(listin, shifter));
  }

  @Test
  public void shifterFunctionTest3() throws Exception {
    int[] listin = {1, 2, 3, 4, 5};
    int shifter = 3;
    int[] listout = {3, 4, 5, 1, 2};
    assertArrayEquals(listout, shifterFunction(listin, shifter));
  }

  @Test
  public void shifterFunctionTest4() throws Exception {
    int[] listin = {1, 2, 3, 4, 5};
    int shifter = 4;
    int[] listout = {2, 3, 4, 5, 1};
    assertArrayEquals(listout, shifterFunction(listin, shifter));
  }

  @Test
  public void shifterFunctionTest5() throws Exception {
    int[] listin = {1, 2, 3, 4, 5};
    int shifter = 5;
    int[] listout = {1, 2, 3, 4, 5};
    assertArrayEquals(listout, shifterFunction(listin, shifter));
  }

  @Test
  public void shifterFunctionTest6() throws Exception {
    int[] listin = {1, 2, 3, 4, 5};
    int shifter = 6;
    int[] listout = {5, 1, 2, 3, 4};
    assertArrayEquals(listout, shifterFunction(listin, shifter));
  }

  @Test
  public void shifterFunctionTestMinus1() throws Exception {
    int[] listin = {1, 2, 3, 4, 5};
    int shifter = -1;
    int[] listout = {2, 3, 4, 5, 1};
    assertArrayEquals(listout, shifterFunction(listin, shifter));
  }

  @Test
  public void shifterFunctionTestMinus2() throws Exception {
    int[] listin = {1, 2, 3, 4, 5};
    int shifter = -2;
    int[] listout = {3, 4, 5, 1, 2};
    assertArrayEquals(listout, shifterFunction(listin, shifter));
  }

  @Test
  public void shifterFunctionTestMinus6() throws Exception {
    int[] listin = {1, 2, 3, 4, 5};
    int shifter = -6;
    int[] listout = {2, 3, 4, 5, 1};
    assertArrayEquals(listout, shifterFunction(listin, shifter));
  }
}