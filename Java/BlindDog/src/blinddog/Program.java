package blinddog;
import aima.core.agent.Action;
import aima.core.agent.AgentProgram;
import aima.core.agent.Percept;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Program implements AgentProgram {

    public Action execute(Percept prcpt) 
    {
       List<Percept> list = new ArrayList<>();
       list.stream().map((p) -> {
           if (isinstance(p,null))
           {
               System.out.println("Eat");
           } return p;
        }).map(new Function<Percept, Percept>() {
           @Override
           public Percept apply(Percept p) {
               if (isinstance(p,null))
               {
                   System.out.println("Drink");
               } return p;
           }
       }).forEach((_item) -> {
            System.out.println("move down");
        });
       return null;
    }

    private boolean isinstance(Percept p, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
