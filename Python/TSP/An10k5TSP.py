from TSP import *

def An10k5():
	N1= [82, 76]
	N2= [96, 44]
	N3= [50, 5]
	N4= [49, 8]
	N5= [13, 7]
	N6= [29, 89]
	N7= [58, 30]
	N8= [84, 39]
	N9= [14, 24]
	N10= [2, 39]
	cities=[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10]
	M[]
	matriz = fillMatriz(cities,M)
	matriz = matrizDistancia(cities,matriz)

	q0 = {1:matriz[0][1],2:matriz[0][2],3:matriz[0][3],4:matriz[0][4],5:matriz[0][5],6:matriz[0][6],7:matriz[0][7],
			8:matriz[0][8],9:matriz[0][9]}
 
 
	q2 = {1:matriz[2][1],2:matriz[2][2],3:matriz[2][3],4:matriz[2][4],5:matriz[2][5],6:matriz[2][6],7:matriz[2][7],
			8:matriz[2][8],9:matriz[2][9]}
	 
	 
	q3 = {1:matriz[3][1],3:matriz[3][2],3:matriz[3][3],4:matriz[3][4],5:matriz[3][5],6:matriz[3][6],7:matriz[3][7],
			8:matriz[3][8],9:matriz[3][9]}
	 
	 
	q4 = {1:matriz[4][1],2:matriz[4][2],3:matriz[4][3],4:matriz[4][4],5:matriz[4][5],6:matriz[4][6],7:matriz[4][7],
			8:matriz[4][8],9:matriz[4][9]}
	 
	 
	q1 = {1:matriz[1][1],2:matriz[1][2],3:matriz[1][3],4:matriz[1][4],5:matriz[1][5],6:matriz[1][6],7:matriz[1][7],
			8:matriz[1][8],9:matriz[1][9]}
	 
	 
	q5 = {1:matriz[5][1],2:matriz[5][2],3:matriz[5][3],4:matriz[5][4],5:matriz[5][5],6:matriz[5][6],7:matriz[5][7],
			8:matriz[5][8],9:matriz[5][9]}
	 
	 
	q6 = {1:matriz[6][1],2:matriz[6][2],3:matriz[6][3],4:matriz[6][4],5:matriz[6][5],6:matriz[6][6],7:matriz[6][7],
			8:matriz[6][8],9:matriz[6][9]}
	 
	 
	q7 = {1:matriz[7][1],2:matriz[7][2],3:matriz[7][3],4:matriz[7][4],5:matriz[7][5],6:matriz[7][6],7:matriz[7][7],
			8:matriz[7][8],9:matriz[7][9]}
	 
	 
	q8 = {1:matriz[8][1],2:matriz[8][2],3:matriz[8][3],4:matriz[8][4],5:matriz[8][5],6:matriz[8][6],7:matriz[8][7],
			8:matriz[8][8],9:matriz[8][9]}
	 
	 
	q9 = {1:matriz[9][1],2:matriz[9][2],3:matriz[9][3],4:matriz[9][4],5:matriz[9][5],6:matriz[9][6],7:matriz[9][7],
			8:matriz[9][8],9:matriz[9][9]}

	states = [q0,q1,q2,q3,q4,q5,q6,q7,q8,q9]
	distanciaM = matriz 