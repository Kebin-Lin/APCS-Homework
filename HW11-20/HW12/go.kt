Kevin Lin
APCS2 Pd1
HW12 -- +3R|\/|1|\|4|_  1|_|_|\|3$$
2018-03-02

Q0: A single file can have multiple classes, but the main method of the class
    that's marked public will be ran if the compiled file is ran.

Q1: The command line arguments are parsed into integers and set to a variable.

Q2: If no arguments are given, the default values for the variables are used.

Q3: The recursion increments moves every call until it's too big. This can be
    done with a for loop or while loop.

Q4: When I run it, I should see numbers changing on a board.

Q5: ANSI stands for the American National Standards Institute. They're useful
    because their codes work between different operating systems.

Q6: My observations met my expectations.

Q7: I can show the movement of the knight around the board instead of numbers
    changing.

Knight's Tour Algorithm

Before: Generate an integer array of size 8x8
1. Try to move the knight to the next valid spot (First move allows for any spot
on the board)
2. If there are no valid moves, return the knight to its previous position, and
set the spot the knight was on back to zero
3. If it succeeds, set the zero the knight is on to the move number
4. Repeat steps 1-3 until a solution is found or all spots on the board are used
up for the first move