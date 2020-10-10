# Java-TicTacToe
Tic-Tac-Toe game developed in Java. Specifications defined by HyperSkill.
The code I wrote can be found in task\src. The remaining code is provided by Hyperskill to automatically test the solution.

## Outcome
![Results Demo](tic-tac-toe.gif)

## About
Everybody remembers this paper-and-pencil game from childhood: Tic-Tac-Toe, also known as Noughts and crosses or Xs and Os. A single mistake usually costs you the game, but thankfully it is simple enough that most players discover the best strategy quickly. Let’s program Tic-Tac-Toe and get playing!

## Learning Outcomes
After finishing this project, you'll get to know a lot about planning and developing a complex program from scratch, using methods, handling errors, and processing user input.

## Stages

### [Stage 1/5: Welcome to the battlefield!](#Stage-1)
To start things off, the program needs to be able ot print any state of the field. See

### [Stage 2/5: The user is the gamemaster](#Stage-2)
Now it’s time to analyze user input and print the state of the field depending on it. You’ll learn to address specific positions in a string to achieve the required outcome.

### [tage 3/5: What's up on the field?](#Stage-3)
Now we’re going to write a fully-functioning multi-line program that responds to the user’s actions and analyzes the state of the field. Not only will it tell you who is winning, but it will also determine if the situation on a given field is theoretically possible!

### [tage 4/5: First move!](#Stage-4)
Tic-tac-toe is not all about analysis – a game is meant to be played! Write a program that can change the state of the field, as your first real step toward a fully-functioning game application!

### [tage 5/5: Fight!](#Stage-5)
Finally! Thanks to this app, you can always challenge a friend to play a quick game of Tic-Tac-Toe!

---

# Stage 1

## Skills
- Introduction to Java
- Basic literals
- Overview of the basic program
- Printing data

## Description

Tic-tac-toe is a game played by two players on a 3x3 field.

One of the players plays as 'X', and the other player is 'O'. 'X' plays first, then the 'O' side plays, and so on.

The players write 'X' and 'O' on a 3x3 field.

The first player that writes 3 'X' or 3 'O' in a straight line (including diagonals) wins.

Your first task in this project is to print any state of the field in the console output.

Example
The example below shows how your output might look.

```
X O X
O X O
X X O 
```

---

# Stage 2

## Skills
- Types and variables
- Primitive and reference types
- Array
- Comments
- Naming variables
- Scanning the input
- Arithmetic operations
- Integer types and operations
- Increment and decrement
- Characters
- String

## Description
In this stage, you should write a program that reads 9 symbols from the input and writes an appropriate 3x3 field. Elements of the field can contain only `'X'`, `'O'` and `'_'` symbols.

Note, that field has a specific format and should start and end with `---------`, all lines in between should start and end with `'|'` symbol and everything in the middle should be separated with a single space.

## Examples
Examples below show how the output should look.

#### Example 1:
```
Enter cells: O_OXXO_XX
---------
| O _ O |
| X X O |
| _ X X |
---------
```

#### Example 2:
```
Enter cells: OXO__X_OX
---------
| O X O |
| _ _ X |
| _ O X |
---------
```

### Example 3:
```
Enter cells: _XO__X___
---------
| _ X O |
| _ _ X |
| _ _ _ |
---------
```

---

# Stage 3

## Skills
- Boolean and logical operations
- Relational operators
- Conditional statement
- Ternary operator
- The for-loop
- The while and do-while loops
- Branching statements
- Iterating over arrays
- Multi-dimensional array

## Description
In this stage, you should analyze a Tic-Tac-Toe field.

Note. In this stage either `'X'` or `'O'` can start the game.

After printing the field, you need to find the state in which the game is at the moment. Possible states:

`"Game not finished"` - when no side has a three in a row but the field has empty cells;
`"Draw"` - when no side has a three in a row and the field has no empty cells;
`"X wins"` - when the field has three X in a row;
`"O wins"` - when the field has three O in a row;
`"Impossible"` - when the field has three X in a row as well as three O in a row. Or the field has a lot more X's than O's or vice versa (if the difference is 2 or more, should be 1 or 0).
Also, you can use `' '` or `'_'` to print empty cells - it's up to you.

## Examples
The examples below show outputs for some predefined states. Your program should work in the same way.

#### Example 1:
```
Enter cells: XXXOO__O_
---------
| X X X |
| O O _ |
| _ O _ |
---------
X wins
```

#### Example 2:
```
Enter cells: XOXOXOXXO
---------
| X O X |
| O X O |
| X X O |
---------
X wins
```

#### Example 3:
```
Enter cells: XOOOXOXXO
---------
| X O O |
| O X O |
| X X O |
---------
O wins
```

#### Example 4:
```
Enter cells: XOXOOXXXO
---------
| X O X |
| O O X |
| X X O |
---------
Draw
```

#### Example 5:
```
Enter cells: XO_OOX_X_
---------
| X O   |
| O O X |
|   X   |
---------
Game not finished
```

#### Example 6:
```
Enter cells: XO_XO_XOX
---------
| X O _ |
| X O _ |
| X O X |
---------
Impossible
```

#### Example 7:
```
Enter cells: _O_X__X_X
---------
|   O   |
| X     |
| X   X |
---------
Impossible
```

#### Example 8:
```
Enter cells: _OOOO_X_X
---------
|   O O |
| O O   |
| X   X |
---------
Impossible
```

---

# Stage 4

## Skills
- Units of information
- Sizes and ranges
- Type casting
- Defining methods
- Write, compile, and run
- Errors in programs

## Description
Now you need to implement player's moves.

Suppose the bottom left cell has the coordinates (1, 1) and the top right cell has the coordinates (3, 3) like in this table:

(1, 3) (2, 3) (3, 3)
(1, 2) (2, 2) (3, 2)
(1, 1) (2, 1) (3, 1)

The program should work in the following way:

Get the 3x3 field from the input as in the previous stages,
Output this 3x3 field with cells before the user's move,
Then ask the user about his next move,
Then the user should input 2 numbers that represent the cell on which user wants to make his X or O. (9 symbols representing the field would be on the first line and these 2 numbers would be on the second line of the user input),
Then output the table including the user's most recent move.
Do not delete code that checks for table state; it will be useful in the future.

Note that in this stage user moves as X, not O. Keep in mind that the first coordinate goes from left to right and the second coordinate goes from bottom to top. Also, notice that coordinates start with 1 and can be 1, 2 or 3.

But what if the user enters incorrect coordinates? The user could enter symbols instead of numbers or enter coordinates representing occupied cells. You need to prevent all of that by checking user's input and catching possible exceptions.

The program should also check user input. If the user input is unsuitable, the program should ask him to enter coordinates again.

So, you need to output a field from the first line of the input and then ask the user to enter a move. Keep asking until the user enters coordinates that represent an empty cell on the field and after that output the field with that move. You should output the field only 2 times: before the move and after a legal move.

## Example

The examples below show how your program should work.

#### Example 1:
```
Enter cells: X_X_O____
---------
| X   X |
|   O   |
|       |
---------
Enter the coordinates: 1 1
---------
| X   X |
|   O   |
| X     |
---------
```

#### Example 2:
```
Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 1 3
---------
| X X X |
| O O   |
| O X   |
---------
```

#### Example 3:
```
Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 3 1
---------
|   X X |
| O O   |
| O X X |
---------
```

#### Example 4:
```
Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 3 2
---------
|   X X |
| O O X |
| O X   |
---------
```

#### Example 5:
```
Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 1 1
This cell is occupied! Choose another one!
Enter the coordinates: 1 3
---------
| X X X |
| O O   |
| O X   |
---------
```

#### Example 6:
```
Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: one
You should enter numbers!
Enter the coordinates: one three
You should enter numbers!
Enter the coordinates: 1 3
---------
| X X X |
| O O   |
| O X   |
---------
```

#### Example 7:
```
Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 4 1
Coordinates should be from 1 to 3!
Enter the coordinates: 1 4
Coordinates should be from 1 to 3!
Enter the coordinates: 1 3
---------
| X X X |
| O O   |
| O X   |
---------
```

---

# Stage 5

## Skills
 - Switch statement
 
## Description
Now it is time to make a working game!

In the last stage, make it so you can play a full game with a friend. First one of you moves as X, and then the other one moves as O.

You need to create a game loop. The game starts with empty cells and ends when someone wins or there is a draw. You need to output the final result after the end of the game.

Good luck gaming!

## Example
The example below shows how your program should work.

```
---------
|       |
|       |
|       |
---------
Enter the coordinates: 2 2
---------
|       |
|   X   |
|       |
---------
Enter the coordinates: 2 2
This cell is occupied! Choose another one!
Enter the coordinates: two two
You should enter numbers!
Enter the coordinates: 1 4
Coordinates should be from 1 to 3!
Enter the coordinates: 1 3
---------
| O     |
|   X   |
|       |
---------
Enter the coordinates: 3 1
---------
| O     |
|   X   |
|     X |
---------
Enter the coordinates: 1 2
---------
| O     |
| O X   |
|     X |
---------
Enter the coordinates: 1 1
---------
| O     |
| O X   |
| X   X |
---------
Enter the coordinates: 3 2
---------
| O     |
| O X O |
| X   X |
---------
Enter the coordinates: 2 1
---------
| O     |
| O X O |
| X X X |
---------
X wins
```
