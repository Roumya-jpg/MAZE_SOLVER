/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;

import java.util.*;


/**
 *
 * @author quaye
 */
public class DepthFirst {
      public static boolean searchpath(int[][] maze,int x,int y,List<Integer> path){
         if(maze[x][y] == 9){
            path.add(x);
            path.add(y);
            return true;
        }
         
         
         if(maze[x][y] == 0){
            maze[x][y] = 2; // Marks as visited by 2
            int drow[] = {-1, 0, +1, 0}; 
	    int dcol[] = {0, +1, 0, -1}; 
            for(int i = 0; i < 4; i++){
                int nrow = x + drow[i]; 
	        int ncol = y + dcol[i]; 
                if(searchpath(maze,nrow,ncol,path)){
                    path.add(x);
                    path.add(y);
                    return true;
                }
            }
         }
         return false;
      }
}
                
      
