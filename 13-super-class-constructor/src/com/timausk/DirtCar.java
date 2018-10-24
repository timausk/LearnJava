package com.timausk;

public class DirtCar extends Car {

  
  private int dirtyTerrainTopSpeed;


  public DirtCar(double mileage, int price, int doors, int dirtyTerrainTopSpeed) {

    // super calling car constructor, constructor from parent
    super(mileage, price, doors);
    this.dirtyTerrainTopSpeed = dirtyTerrainTopSpeed;
  }


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
