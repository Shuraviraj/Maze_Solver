# MAZE SOLVER

This is a project made under guidance of ACCIOJOB

Maze Solver -> Using JAVA

It’s a 2d grid have Start point and End point

we have to find The Shortest possible path b/w starting point and end point

## Features

- Obstacles
- Free block
- Give path from start point and end point
- Business Logic for finding the path
- GUI for the MAZE SOLVER

## Technology Used:

- JAVA
- SWING -> GUI - Graphical user interface
- JFrame
- DFS Traversal Algorithm used to traverse the graph

## RAVI RAJ

- [@shuravi](https://github.com/Shuraviraj?tab=repositories) GITHUB
- [@ravi-raj-singh97](https://www.linkedin.com/in/ravi-raj-singh97/) LINKEDIN

## Technology Explanation

	• JFC -> Java foundation classes 
		○ A set of GUI Component to simplify the development of desktop application
	• We can also use JAVA AWT -> Abstract Window Toolkit
		○ Its heavyweight platform dependent
	• JAVA Swing (why to use JAVA Swing)
		○ Used to create a window-based application
		○ Entirely written in java
		○ Lightweight component and platform independent
		○ Using JFrame
	• Styling of project
    • Boundary and minute style for GUI enhancement are important

## Algorithm

		○ Access each data stored in array using DFS
		○ Check it for further use for my path
			§ 1 -> blocker
			§ 0 - accessibble
			§ 9 -> destination
			§ 3 -> external boundary (to enhance GUI)
		○ DFS : 
			§ It goes FAR away from source it returns when it reached destination or dead END
			§ It marks the element when it traverse each block
			§ Time Complexity O(N*M)
            § Implemented using recursion

## Advance TIP to make a JAR

		○ In IntelliJ go to Project Structure -> artifact -> click on + icon
		○ Select you main class and keep extract to the target JAR selected
		○ Select location hit okay
		○ Come on main menu hit Build -> Build Artifact -> Build

** Open the location of your JAR and double-click on it, you are ready to go