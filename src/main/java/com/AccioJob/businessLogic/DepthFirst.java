package com.AccioJob.businessLogic;

import com.AccioJob.dto.Pair;

import java.util.List;

public class DepthFirst {
    public void searchPath(int[][] maze, int r, int c, List<Pair> currPath, List<Pair> shortestPath) {
        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length ||
                maze[r][c] == 1 ||
                maze[r][c] == 2 ||
                maze[r][c] == 3) return;
        if (maze[r][c] == 9) {
            currPath.add(new Pair(r, c));
            if (shortestPath.isEmpty() || shortestPath.size() > currPath.size()) {
                shortestPath.clear();
                shortestPath.addAll(currPath);
            }
            return;
        }
        maze[r][c] = 2; // marking the path as visited
        Pair me = new Pair(r, c);
        currPath.add(me);
        // left,    right    top and bottom
        int[][] dir = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        for (int[] nbr : dir) {
            int nr = r + nbr[0];
            int nc = c + nbr[1];
            searchPath(maze, nr, nc, currPath, shortestPath);
        }
        maze[r][c] = 0;// making the changes back to original so that other path can explore me
        currPath.remove(me);// back tracing path
    }
}
