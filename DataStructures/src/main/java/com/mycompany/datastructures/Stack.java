/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructures;

/**
 *
 * @author sethp
 */
public class Stack{
    public final int stackLimit;
    public int index;
    public int stack[];

    public Stack(int stackLimit) {
        this.stackLimit = stackLimit;
        this.stack = new int[stackLimit]; 
        index = -1;
    }
    
    public void push(int value){
        if(index == stackLimit){
            throw new StackException("Stack is full");
        }
        if(value != 0){
            stack[++index] = value;
             
        }
          
    }
    
    public int pop(){
        if(index == -1){
            int tempStack[] = new int [stackLimit];
            System.arraycopy(stack, 0, tempStack, 0, stackLimit);
            this.stack = new int[2*stackLimit];
            System.arraycopy(tempStack, 0, stack, 0,stackLimit);
        }
        
        int value = stack[index];
        index--;
        return value;
    }
    
    public boolean isEmpty(){
        if(index == -1){
            return true;
        }
        return false;
    }
    
    public void valStackTop(){
        System.out.printf("The value on top is: %d", stack[index]);
    }
}
