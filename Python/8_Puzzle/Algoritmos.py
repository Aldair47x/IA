import Node
import sys
import main


def bfs( start, goal ):
	"""Performs a breadth first search from the start state to the goal"""
	# A list (can act as a queue) for the nodes.
	nodes = []
	cont = 0
	# Create the queue with the root node in it.
	nodes.append( main.create_node( start, None, None, 0, 0 ) )
	while True:
		cont+=1
		# We've run out of states, no solution.
		if len( nodes ) == 0: return None
		# take the node from the front of the queue
		node = nodes.pop(0)
		# Append the move we made to moves
		# if this node is the goal, return the moves it took to get here.
		if node.state == goal:
			moves = []
			temp = node
			while True:
				moves.insert(0, temp.operator)
				if temp.depth == 1: break
				temp = temp.parent
			m = (moves,cont)	
			return m				
		# Expand the node and add all the expansions to the front of the stack
		nodes.extend( main.expand_node( node, nodes ) )

def dfs( start, goal, depth=20 ):
	"""Performs a depth first search from the start state to the goal. Depth param is optional."""
	# NOTE: This is a limited search or else it keeps repeating moves. This is an infinite search space.
	# I'm not sure if I implemented this right, but I implemented an iterative depth search below
	# too that uses this function and it works fine. Using this function itself will repeat moves until
	# the depth_limit is reached. Iterative depth search solves this problem, though.
	#
	# An attempt of cutting down on repeat moves was made in the main.expand_node() function.
	depth_limit = depth
	cont=0
	# A list (can act as a stack too) for the nodes.
	nodes = []
	# Create the queue with the root node in it.
	nodes.append( main.create_node( start, None, None, 0, 0 ) )
	while True:
		cont+=1
		# We've run out of states, no solution.
		if len( nodes ) == 0: return None
		# take the node from the front of the queue
		node = nodes.pop(0)
		# if this node is the goal, return the moves it took to get here.
		if node.state == goal:
			moves = []
			temp = node
			while True:
				moves.insert(0, temp.operator)
				if temp.depth <= 1: break
				temp = temp.parent
			m = (moves,cont)
			return m				
		# Add all the expansions to the beginning of the stack if we are under the depth limit
		if node.depth < depth_limit:
			expanded_nodes = main.expand_node( node, nodes )
			expanded_nodes.extend( nodes )
			nodes = expanded_nodes