package sampleabstrcar;

public class Main {
  public static void main(String[] args) {
    
    // we can instantiate a child class
    BMW bmw   = new BMW();
    Limo limo = new Limo();
    
    // but we cannot instantiate a car/parent class!
    // Car car = new Car();
    
    
    bmw.setDoors();
    limo.setDoors();

    System.out.println(bmw.doors);
    System.out.println(limo.doors);
    
  }
}
