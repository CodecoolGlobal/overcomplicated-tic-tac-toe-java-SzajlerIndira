# Overcomplicated TicTacToe

My job was to write a single player TicTacToe game based on microservices. 
I had to model the game (state and movements), and connect it with the UI, and write a simple version for all the extra services and wire them together. 

## Run

You have to run all the microservices, then you can play the game on http://localhost:8091/

### The vision

The idea behind this system is to build multiple services for smaller parts. 
This will allow autonomous development and maintenance. 
The *architect guy* created the following component UML:

![UML](overcomplicated-tictactoe/overcomplicated-tictactoe-diagram.png)


## Services one by one</a>

The project, beside the main application and contain several services. 

## funfact-service

This service generates a fun fact for showing it next the game board to make your TicTacToe more fun.

## comics-service

A service to help showing a comic. 

### avatar-service

It generates a profile avatar picture's URI.
The requirement is to keep the picture unchanged during the session.

### tictactoe-ai-service

The logic behind the computer's move. 
