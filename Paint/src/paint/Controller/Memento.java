/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.Controller;

import Paint.Model.Shape;
import java.util.ArrayList;

/**
 *
 * @author wadiebishoy
 */
public class Memento {
    
    private ArrayList<Shape> State ;
    
     public Memento(ArrayList<Shape> state){
      this.State = state;
   }

   public ArrayList<Shape> getState(){
      return State;
   }	

    
}
