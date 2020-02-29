/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Ali
 */
public class Car
{
  private int fuel;

  public Car() { fuel = 0; }
  public Car(int g) { fuel = g; }

  public void addFuel() { fuel++; }
  public void display() { System.out.print("Fuel: "+fuel + "\t"); }
}

