package edu.umn.cs.csci3081w.project.model;

import java.io.PrintStream;

public class TrainTestImpl extends Train {
  public TrainTestImpl(int id, Line line, int capacity, double speed, int color) {
    super(id, line, capacity, speed, color);
  }

  @Override
  public void report(PrintStream out) {

  }

  @Override
  public int getCurrentCO2Emission() {
    return 0;
  }
}
