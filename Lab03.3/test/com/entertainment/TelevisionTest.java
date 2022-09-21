package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

  private Television tv1;

  @Before
  public void setUp() {
    tv1 = new Television("LG", 12, DisplayType.LCD);
  }

  @Test
  public void testSetVolume() {
    assertEquals(12, tv1.getVolume());
  }

//  @Test
//  public void testSetVolumeIllegalArgumentException() {
//    int tv1.set
//    try {
//      Television tv1 = new Television("LG", -4, DisplayType.LCD);
//      tv1.getVolume(); // Should throw IllegalArgumentException
//    }
//  }


  @Test
  public void testChangeChannel() {
  }

  @Test
  public void testCompareTo() {
  }

  @Test
  public void testHashCode() {
    fail();
  }

  @Test
  public void testEquals() {
    fail();
  }
}