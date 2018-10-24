package sampleabstrcar;


// must either be declared as abstract or implement abstract method setDoor();
public class BMW extends Car {


  @Override
  public void setDoors() {
    
    // field of parent class
    this.doors = 4;
  }
}
