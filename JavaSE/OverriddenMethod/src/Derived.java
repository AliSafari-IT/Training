/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class Derived extends Base{
     @Override
     public void methodOne()
   {
      super.methodOne();
      System.out.println("C");
   }

     @Override
   public void methodTwo()
   {
     super.methodTwo();
     System.out.print("D");
   }
}
