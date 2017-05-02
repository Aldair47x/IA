import sys
from Node import*
import Algoritmos

estado_final = [1, 3, 4, 8, 6, 2, 7, 0, 5]
#estado_final = [5, 6, 7, 4, 0, 8, 3, 2, 1]
#estado_final = [1, 8, 7, 2, 0, 6, 3, 4, 5]

	
def move_up( state ):
	"""Moves the blank tile up on the board. Returns a new state as a list."""
	# Perform an object copy
	new_state = state[:]
	index = new_state.index( 0 )
	# Sanity check
	if index not in [0, 3, 6]:
		# Swap the values.
		temp = new_state[index - 1]
		new_state[index - 1] = new_state[index]
		new_state[index] = temp
		return new_state
	else:
		# Can't move, return None (Pythons NULL)
		return None

def move_down( state ):
	"""Moves the blank tile down on the board. Returns a new state as a list."""
	# Perform object copy
	new_state = state[:]
	index = new_state.index( 0 )
	# Sanity check
	if index not in [2, 5, 8]:
		# Swap the values.
		temp = new_state[index + 1]
		new_state[index + 1] = new_state[index]
		new_state[index] = temp
		return new_state
	else:
		# Can't move, return None.
		return None

def move_left( state ):
	"""Moves the blank tile left on the board. Returns a new state as a list."""
	new_state = state[:]
	index = new_state.index( 0 )
	# Sanity check
	if index not in [0, 1, 2]:
		# Swap the values.
		temp = new_state[index - 3]
		new_state[index - 3] = new_state[index]
		new_state[index] = temp
		return new_state
	else:
		# Can't move it, return None
		return None

def move_right( state ):
	"""Moves the blank tile right on the board. Returns a new state as a list."""
	# Performs an object copy. Python passes by reference.
	new_state = state[:]
	index = new_state.index( 0 )
	# Sanity check
	if index not in [6, 7, 8]:
		# Swap the values.
		temp = new_state[index + 3]
		new_state[index + 3] = new_state[index]
		new_state[index] = temp
		return new_state
	else:
		# Can't move, return None
		return None

def create_node( state, parent, operator, depth):
	return Node( state, parent, operator, depth)

def expand_node( node, nodes ):
	"""Returns a list of expanded nodes"""
	expanded_nodes = []
	expanded_nodes.append( create_node( move_up( node.state ), node, "Arriba", node.depth + 1) )
	expanded_nodes.append( create_node( move_left( node.state ), node, "Izquierda", node.depth + 1) )
	expanded_nodes.append( create_node( move_down( node.state ), node, "Abajo", node.depth + 1) )
	expanded_nodes.append( create_node( move_right( node.state), node, "Derecha", node.depth + 1) )
	# Filter the list and remove the nodes that are impossible (move function returned None)
	expanded_nodes = [node for node in expanded_nodes if node.state != None] #list comprehension!
	return expanded_nodes



def main():
	estado_inicial = [1,2,3,8,0,4,7,6,5]
	resultado = Algoritmos.dfs(estado_inicial, estado_final)
	if resultado[0] == None:
		print "No se encontro solucion"
	elif resultado[0] == [None]:
		print "El estado inicial es el final! "
	else:
		print "Movimientos totales:",len(resultado[0])
		print "Lista de movimientos apartir del estado inicial al estado final: \n",resultado[0]
		print "Numero de estados visitados: ", resultado[1]


if __name__ == "__main__":
	main()