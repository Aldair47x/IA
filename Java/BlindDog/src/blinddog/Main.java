package blinddog;


public class Main {
    
    public static void main(String[] args) {
        
    Park parque = new Park();
    BlindDog perro = new BlindDog();
    Food comida_perro = new Food();
    Water agua = new Water();
    parque.add_thing(perro, 0);
    parque.add_thing(comida_perro, 5);
    parque.add_thing(agua, 7);
       
    }
    
}
