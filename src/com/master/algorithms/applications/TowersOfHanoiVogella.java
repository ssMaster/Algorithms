
package com.master.algorithms.applications;

/**
 * Sample code from Vogella Tutorials covering one method of implementing a solution
 * to the Towers of Hanoi problem. Credit goes to Lars Vogel.
 * 
 * @author simon_000
 */
public class TowersOfHanoiVogella {
    /*
    Towers of Hanoi
    Poles are labeled 1, 2, 3
    Each disk is also labeled
    */
    
    /**
     * move the poles 
     * @param n
     * @param startPole - The first pole
     * @param endPole - The last pole
     */
    public static void move(int n, int startPole, int endPole){
        if(n == 0){
            return;
        }
        int tempPole = 6 - startPole - endPole;
        move(n-1, startPole, tempPole);
        System.out.println("Move " + n + " from " + startPole + " to " + endPole);
        move(n-1, tempPole, endPole);
    }
    
    public static void main(String[] args){
        move(5, 1, 3);
    }
}
