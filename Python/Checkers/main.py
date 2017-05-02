# Created by Carson Wilcox all rights deserved
# Modify and personalize By Aldair Bernal 
# These 
# Main class runs the game
from board import *
from minmax import *

# Setup variables
width = 8
height = 8
firstPlayer = 0

# Gets the move from the User
def getUserMove(b):
    statement1 = "Selecciona un movimiento."
    print(statement1)
    while True: # Loop until proper input
        move = []
        move = raw_input().lower().split()
        if not(len(move) == 2):
            print "Ese no es un movimiento valido, intenta de nuevo.", statement1
            continue
        moveFromTup = (int(move[0][1]), ord(move[0][0]) - 97)
        moveToTup = (int(move[1][1]), ord(move[1][0]) - 97)
        # Is the piece we want to move one we own?
        if not (moveFromTup in b.whitelist):
            print "La ficha no te pertenece", moveFromTup, "Intenta con alguna de estas:", b.whitelist
            continue
        break
    move = (moveFromTup, moveToTup, b.NOTDONE)
    return move

### MAIN PROGRAM ###

b = board(width, height, firstPlayer)
b.printBoard()
print("Juego de damas con Minimax, Bienvenido")

# Main game loop
while b.gameWon == -1:
    # First it is the users turn
    userMove = getUserMove(b)
    try:
        b.moveWhite(*userMove)
    except Exception:
        print "Invalid move"
        continue
        
    # Then it is the computers turn
    temp = minMax2(b)
    b = temp[0]
    print "*********Movimiento de la computadora**********"
    b.printBoard()
    if b.gameWon == b.WHITE:
        print "Las blancas ganan\nJuego terminado"
        break
    elif b.gameWon == b.BLACK:
        print "Las negras ganan\nJuego terminado"
        break
