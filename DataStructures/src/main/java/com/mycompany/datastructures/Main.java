/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructures;

import java.util.Scanner;


/**
 *
 * @author sethp
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(10);
        int value;
        
        while(true){
            value = sc.nextInt();
            if(value != 0){
                stack.push(value);
            } else{
                sc.close();
                break;
            }
        }
        System.out.println("");
        while(!stack.isEmpty()){
            System.out.printf("Popped: %d%n",stack.pop());
        }
    }
}
