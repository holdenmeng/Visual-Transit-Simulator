package edu.umn.cs.csci3081w.project.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class PassengerFactoryTest {

  /**
   * Tests generate function.
   */
  @Test
  public void testGenerate() {

    PassengerFactory.DETERMINISTIC = true;
    assertEquals(3, PassengerFactory.generate(1, 10).getDestination());

  }

  /**
   * Tests generate function.
   */
  @Test
  public void testGenerate1() {

    PassengerFactory.DETERMINISTIC = false;
    assertNotEquals(-3333, PassengerFactory.generate(1, 10).getDestination());

  }

  /**
   * Tests generate function.
   */
  @Test
  public void nameGeneration() {

    PassengerFactory.DETERMINISTIC = true;
    PassengerFactory.DETERMINISTIC_NAMES_COUNT = 0;

    assertEquals("Goldy", PassengerFactory.nameGeneration());

  }

  /**
   * Tests generate function.
   */
  @Test
  public void nameGeneration1() {

    PassengerFactory.DETERMINISTIC = false;
    PassengerFactory.DETERMINISTIC_NAMES_COUNT = 0;

    assertNotEquals("Gold", PassengerFactory.nameGeneration());

  }




  /**
   * Clean up our variables after each test.
   */
  @AfterEach
  public void cleanUpEach() {
    PassengerFactory.DETERMINISTIC = false;
  }


}
