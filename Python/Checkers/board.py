#!/usr/bin/env python
# -*- coding: utf-8 -*-

class board(object):
    BLACK = 1
    WHITE = 0
    NOTDONE = -1
    def __init__(self, height, width, firstPlayer):
        """
            Constructs a board, right now maxDepth is statically assigned
        """
        # Altura y anchura del tablero
        self.width = width
        self.height = height
        # Crea dos listas en las cuales se guardará las fichas de cada jugador
        self.blacklist = []
        self.whitelist = []
        # Se establece las fichas por defecto del tablero, en esté caso de 8*8
        for i in range(width):
            self.blacklist.append((i, (i+1)%2))
            self.whitelist.append((i, height - (i%2) - 1))
            if i%2==0 :
                self.whitelist.append((i, height - (i%1) - 3))
            else:
                self.blacklist.append((i, height - (i%1) - 6))
        # boardState contiene el estado actual del tablero para la función printing/eval
        self.boardState = [[' '] * self.width for x in range(self.height)]
        self.gameWon = self.NOTDONE
        self.turn = firstPlayer
        self.maxDepth = 10
    
    # Genera un iterador para todos los movimientos
    def iterWhiteMoves(self):
        """
            Main generator for white moves
        """
        for piece in self.whitelist:
            for move in self.iterWhitePiece(piece):
                yield move
                
    def iterBlackMoves(self):
        """
            Main Generator for black moves
        """
        for piece in self.blacklist:
            for move in self.iterBlackPiece(piece):
                yield move
                
    def iterWhitePiece(self, piece):
        """
            Generates possible moves for a white piece
        """            
        return self.iterBoth(piece, ((-1,-1),(1,-1)))
    
    def iterBlackPiece(self, piece):
        """
            Generates possible moves for a black piece
        """
        return self.iterBoth(piece, ((-1,1),(1,1)))

    def iterBoth(self, piece, moves):
        """
            Handles the actual generation of moves for either black or white pieces
        """
        for move in moves:
            # Movimiento normal
            targetx = piece[0] + move[0]
            targety = piece[1] + move[1]
            # Si el movimiento está fuera de los límites, no se mueva
            if targetx < 0 or targetx >= self.width or targety < 0 or targety >= self.height:
                continue
            target = (targetx, targety)
            # Se verifica que en la posición en la cuál se va mover na haya nada
            black = target in self.blacklist
            white = target in self.whitelist
            if not black and not white:
                yield (piece, target, self.NOTDONE)
            # Si hay algo en el camino...
            else:
                # Tiene que ser del color opuesto para poder saltar
                if self.turn == self.BLACK and black:
                    continue
                elif self.turn == self.WHITE and white:
                    continue
                # El salto procede agregando el mismo movimiento para saltar sobre el contrario
                # Pedazo en el tablero de ajedrez
                jumpx = target[0] + move[0]
                jumpy = target[1] + move[1]
                # Si el salto va a estar fuera de los límites, no lo hace
                if jumpx < 0 or jumpx >= self.width or jumpy < 0 or jumpy >= self.height:
                    continue
                jump = (jumpx, jumpy)
                # Verifica que no haya nada en la zona la cuál va saltar
                black = jump in self.blacklist
                white = jump in self.whitelist
                if not black and not white:
                    yield (piece, jump, self.turn)                   
    
    def updateBoard(self):
        """
            Actualiza el array que contiene el tablero para reflejar el estado actual de las piezas en el tablero
        """
        for i in range(self.width):
            for j in range(self.height):
                self.boardState[i][j] = " "
        for piece in self.blacklist:
            self.boardState[piece[1]][piece[0]] = u'◆'
        for piece in self.whitelist:
            self.boardState[piece[1]][piece[0]] = u'◇'

    # Movement of pieces
    def moveSilentBlack(self, moveFrom, moveTo, winLoss): 
        """
            Mueve las fichas negras sin imprimirlas
        """
        if moveTo[0] < 0 or moveTo[0] >= self.width or moveTo[1] < 0 or moveTo[1] >= self.height:
            raise Exception("Eso movería la pieza negra", moveFrom, "Fuera de los límites")
        black = moveTo in self.blacklist
        white = moveTo in self.whitelist
        if not (black or white):
            self.blacklist[self.blacklist.index(moveFrom)] = moveTo
            self.updateBoard()
            self.turn = self.WHITE
            self.gameWon = winLoss
        else:
            raise Exception
        
    def moveSilentWhite(self, moveFrom, moveTo, winLoss):
        """
            Mueve las fichas blancas sin imprimirlas
        """
        if moveTo[0] < 0 or moveTo[0] >= self.width or moveTo[1] < 0 or moveTo[1] >= self.height:
            raise Exception("Eso movería la pieza blanca", moveFrom, "Fuera de los límites")
        black = moveTo in self.blacklist
        white = moveTo in self.whitelist
        if not (black or white):
            self.whitelist[self.whitelist.index(moveFrom)] = moveTo
            self.updateBoard()
            self.turn = self.BLACK
            self.gameWon = winLoss
        else:
            raise Exception
    
    def moveBlack(self, moveFrom, moveTo, winLoss):
        """
            Mueve la ficha negra de un punto a otro. \n winLoss se pasa como 0(white)
            ó 1(black) si el movimiento es saltar
        """
        self.moveSilentBlack(moveFrom, MoveTo, winLoss)
        self.printBoard()
        
    def moveWhite(self, moveFrom, moveTo, winLoss):
        """
            Mueve la ficha blanca de un punto a otro. \n winLoss se pasa como 0(white)
            ó 1(black) si el movimiento es saltar
        """
        self.moveSilentWhite(moveFrom, moveTo, winLoss)
        self.printBoard()

    def printBoard(self):
        """
            Imprime el tablero
        """
        print unicode(self)
        
    def __unicode__(self):
        
        self.updateBoard()
        lines = []
        # Esto imprime los números en el tope del tablero
        lines.append('    ' + '   '.join(map(str, range(self.width))))
        
        lines.append(u'  ╭' + (u'───┬' * (self.width-1)) + u'───╮')
        
        
        for num, row in enumerate(self.boardState[:-1]):
            lines.append(chr(num+65) + u' │ ' + u' │ '.join(row) + u' │')
            lines.append(u'  ├' + (u'───┼' * (self.width-1)) + u'───┤')
        
      
        lines.append(chr(self.height+64) + u' │ ' + u' │ '.join(self.boardState[-1]) + u' │')

       
        lines.append(u'  ╰' + (u'───┴' * (self.width-1)) + u'───╯')
        return '\n'.join(lines)
