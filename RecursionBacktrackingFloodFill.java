package com.javacompany;

import java.util.Scanner;

public class RecursionBacktrackingFloodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr [][] = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0,"", visited);

    }

    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited) {

        if(row < 0 || col < 0 || row >= maze.length || col >= maze[0].length ||
                maze[row][col] == 1 || visited[row][col] == true){
            return;
        } else if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(psf);
            return;
        }

        visited[row][col] = true;
        floodfill(maze, row -1,col,psf +"1",visited );
        floodfill(maze, row ,col-1,psf +"1",visited );
        floodfill(maze, row +1,col,psf +"1",visited );
        floodfill(maze, row ,col +1,psf +"1",visited );
        visited[row][col] = false;

    }
}