package com.timausk;

public class DirtCar extends Car {
  
  // super keyword! => referring  => parent => CAr 
  
  
  // just present in this class, not in parent class Car
  private int dirtyTerrainTopSpeed;

  public int getDirtyTerrainTopSpeed() {
    return dirtyTerrainTopSpeed;
  }

  public void setDirtyTerrainTopSpeed(int dirtyTerrainTopSpeed) {
    this.dirtyTerrainTopSpeed = dirtyTerrainTopSpeed;
  }
  
  
  // call method from parent class
  public String startDirtCar() {
    return "Dirt car status is: " + super.carStart();
  }
  
}
