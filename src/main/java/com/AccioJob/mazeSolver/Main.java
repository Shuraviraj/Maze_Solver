package com.AccioJob.mazeSolver;

import com.AccioJob.businessLogic.DepthFirst;
import com.AccioJob.dto.Pair;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {
    private final int[][] maze = {
            {3, 3, 3, 3, 3, 3, 3, 3, 3},
            {3, 0, 0, 0, 0, 0, 0, 1, 3},
            {3, 0, 1, 1, 0, 1, 0, 0, 3},
            {3, 0, 0, 1, 0, 1, 1, 0, 3},
            {3, 1, 0, 0, 0, 0, 1, 0, 3},
            {3, 1, 1, 1, 1, 0, 0, 0, 3},
            {3, 0, 1, 0, 1, 0, 1, 0, 3},
            {3, 1, 0, 0, 0, 0, 0, 9, 3},
            {3, 3, 3, 3, 3, 3, 3, 3, 3}
    };
    public List<Pair> path = new ArrayList<>();

    public Main() {
        setTitle("Maze Solver by Ravi"); // setting the title of our window
        setSize(680, 450); // setting the size of our window
        setDefaultCloseOperation(EXIT_ON_CLOSE); // setting the default close operation to EXIT the window
        DepthFirst depthFirst = new DepthFirst();
        depthFirst.searchPath(maze, 1, 1, new ArrayList<>(), path);
        System.out.println(path.toString());
    }

    public static void main(String[] args) {
        var view = new Main();
        view.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.translate(150, 100);
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                Color color = switch (maze[i][j]) {
                    case 1 -> Color.decode("#1b5284"); //obstacle
                    case 3 -> Color.decode("#783f04");// boundary
                    case 9 -> Color.decode("#f379b5"); // path
                    default -> Color.decode("#fff2cc"); // free-path
                };
                g.setColor(color);
                g.fillRect(30 * j, 30 * i, 30, 30);
                g.setColor(Color.decode("#351c75"));
                g.drawRect(30 * j, 30 * i, 30, 30);
            }
        }

        for (Pair p : path) {
            int pathRow = p.row;
            int pathCol = p.col;

            g.setColor(Color.decode("#65d87e"));
            g.fillRect(30 * pathCol, 30 * pathRow, 25, 25);
            g.setColor(Color.decode("#351c75"));
            g.drawRect(30 * pathCol, 30 * pathRow, 30, 30);

        }
    }
}