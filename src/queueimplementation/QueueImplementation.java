/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Queue Implementation USing Linked List*/
package queueimplementation;

/**
 *
 * @author Pranay
 */
public class QueueImplementation {
    int maxSize;
  private  int Qarray[];

    private QueueImplementation(int s) {
    maxSize = s ;
    Qarray =new int [maxSize]; 
    }
    
    public static void main(String[] args) {
    
        QueueImplementation myQ = new QueueImplementation(10);
    }
    
}
