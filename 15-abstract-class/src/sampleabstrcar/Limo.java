package sampleabstrcar;


// prevent implementation of a setDoors method by setting class abstract
//public abstract class Limo extends Car {
public class Limo extends Car {

  @Override
  public void setDoors() {
    this.doors = 12;
  }
}
