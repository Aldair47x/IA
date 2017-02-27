import aima.core.agent.Action;
import aima.core.agent.Agent;
import aima.core.agent.Percept;

public class MyAgent implements Agent {
    
    private Agent YoloAgent;

    public MyAgent(Object thing) {
    }
    
    public MyAgent() {
    }
    
    public void caminar()
    {
        System.out.println("Estoy caminando por:");
    }
    
    @Override
    public void setAlive(boolean a)
    {
        YoloAgent.setAlive(a);
    }
    

    @Override
    public Action execute(Percept prcpt) {
        return YoloAgent.execute(prcpt);
    }

    @Override
    public boolean isAlive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
}
