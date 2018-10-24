package sampleabstrcar;

public abstract class Car {
  
  // abstract keyword says java
  // 1. don't instantiate a new car class
  //    => we don't can do this => Car Audi = new Car()
  // 2. this class doesn't provide implementation for all the methods. it does not force like interface
  
  
  protected int doors;

  // abstract keyword forces the child class to provide the setDoors implementation
  public abstract void setDoors();
  
  // we could also do this. child class does NOT be forced to have this method
  public void setCounter() {
    
  }
  
}
