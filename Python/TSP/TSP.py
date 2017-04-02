#import matplotlib.pyplot as plt
import random
import time
import itertools
import urllib
import math
import csv
import functools
#from statistics import mean, stdev

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
	DEPOSITO=[0,0]
	cities=[DEPOSITO,N1,N2,N3,N4,N5,N6,N7,N8,N9,N10]
	return cities
	
def distance(A,B):
	x=math.sqrt(pow(A[0]-B[0],2)+pow(A[1]-B[1],2))
	return x


def alltours(cities):
	a = itertools.permutations(cities)
	return a

def alltours_tsp(cities):
	"Generate all possible tours of the cities and choose the shortest tour."
	return shortest_tour(alltours(cities))

def shortest_tour(tours): 
	"Choose the tour with the minimum tour length."
	return min(tours, key=tour_length)

def tour_length(tour):
	"The total of distances between each pair of consecutive cities in the tour."
	return sum(distance(tour[i], tour[i-1]) 
		for i in range(len(tour)))
		
def fillMatriz(x, z):
	for i in range(len(x)):
		y = []
		z.append(y);
		for j in range(len(x)):
			z[i].append(0)
	return z

def printMatriz(z):
	for i in range(len(z)):
		print (z[i])

def matrizDistancia(x, matriz):
	z=0
	for i in range (len(x)):
		z=0
		for j in range (len(x)):
			if(z <= len(x)):
				if(i < j):
					matriz[i][j] = distance(x[i],x[z])
				z+=1
	return matriz
	
def matrizAhorros(x, matriz):
	z=0
	for i in range (len(x)):
		z=0
		for j in range (len(x)):
			if(z <= len(x)):
				if(i < j):
					matriz[i][j] = (distance(x[0],x[i])+distance(x[0],x[j]) - (distance(x[i],x[j])))
				z+=1
	return matriz


def saving(A,B,depot):
	return distance(depot[0],A[0])+distance(depot[0],B[0])-distance(A[1],B[1])


def bigest_saving_first(cities,depot):
	edges = [(A,B) for A in cities for B in cities if id(A) < id(B)]
	return sorted(edges,key=lambda edge: saving(*edge,depot), reverse=True)

def cws_vrp(cities,depot):
	endpoints = {c:[c] for c in cities}
	for (A,B) in bigest_saving_first(cities,depot):
		if A in endpoints and B in endpoints and endpoints[A] != endpoints [B]:
			Asegment,Bsegment = endpoints[A],endpoints[B]
			if Asegment[-1] is not A : Asegment.reverse()
			if Bsegment[0] is not B : Bsegment.reverse()
			Asegment.extend(Bsegment)
			del endpoints[A],endpoints[B]
			endpoints[Asegment[0]]=endpoints[Asegment[-1]] = Asegment
	list=set(map(tuple,endpoints.values()))
	tour = [[depot]+list(x)for x in list]
	return tour		

DEPOSITO=[1,1]
A=[3,0]
B=[0,4]
C=[1,3]
D=[6,2]
E=[7,1]
F=[3,4]
Z=[12,15]
X1=[10,11]
U=[11,5]

cities = An10k5()
#cities = [DEPOSITO, A, B, C, D, E, F,Z,X1,U]
tour0 = shortest_tour(alltours_tsp(cities))
tour = [A,B,C,D,E,A] #17.05
tour1 = [B,C,A,D,E,B] #17.65
tour2 = [C,B,E,A,D,C] #21.85
tour3 = [B,D,E,A,C]
tour4 = [DEPOSITO,A,DEPOSITO]

z = []
matriz = fillMatriz(tour0, z)
matriz = matrizDistancia(tour0,matriz)
print ("\n------DISTANCIAS----------\n")
printMatriz (matrizDistancia(cities,matriz))
print ("\n------AHORROS-------------\n")
printMatriz (matrizAhorros(cities,matriz))
print ("--------------°--------------")

print (list((alltours_tsp(cities))))

#print (list(cws_vrp(cities,DEPOSITO)))