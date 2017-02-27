package blinddog;
import aima.core.agent.Action;
import aima.core.agent.Agent;
import aima.core.agent.Percept;


public class BlindDog implements Agent {

    public BlindDog(Agent PerroCiego) {
    }

     void eat(Object thing) {
            System.out.println("Perro: comió en {}");
    }
    
    void drink(Object thing) {
            System.out.println("Perro: Bebió agua en {}");
    }

    public BlindDog() {
    }
    
    
    @Override
    public Action execute(Percept prcpt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean isAlive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlive(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
