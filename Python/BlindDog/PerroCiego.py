from agents import * 

class BlindDog (Agent):
	def eat(self,thing):
		print('Perro: comio en {}'.format(self,location))
	def drink(self,thing):
		print ('Perro: bebio en {}'.format(self,location))

dog=BlindDog()
print (dog.alive)
			
class Food (Thing):
	def comer():
		return "Está comiendo "
	
class Water (Thing):
	def tomar():
		return "Está tomando "
	
class Park (Environment):
	def percept (self,agent):
		#Imprime y retorna una lista de cosas que estan en la localizacion del agente
		things=self.list_things_at(agent.location)
		print (things)
		return things
		
	def execute_action (self,action,agent):
		#Cambia el estado del entorno basado en lo que hace el agente
		if action=="move down":
			agent.movedown()
		elif action=="eat":
			items=self.list_things_at(agent.location, tclass=Food)
			if len(items) != 0:
				if agent.eat(items[0]):
					self.double_things(items[0])
		elif action=="'drink":
			items=self.list_things_at(agent.location, tclass=Water)
			if len(items) != 0:
				if agent.drink(items[0]):
					self.double_things(items[0])
	
def isdone (self):
		no_edibles=notany(instance(things,Food) or instance(things,Water))
	
def program (percepts): 
	#Retorna accion basada en percepcion
	for p in percepts:
		print (p)
		print ()
		print (percepts)
		if isinstance (p, Food):
			return "eat"
		elif isinstance (p, Water):
			return "drink"
		return "move down"
			
parque=Park()
perro=BlindDog(program)
comida_perro=Food()
agua=Water()
parque.add_thing(perro,1)
parque.add_thing(comida_perro.comer,5)
parque.add_thing(agua.tomar,7)
parque.execute_action(comida_perro,perro)
parque.execute_action(agua,perro)
parque.run(10) 