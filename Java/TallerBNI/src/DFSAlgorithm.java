import aima.core.agent.Agent;
import grph.Grph;
import grph.algo.traversal.GraphSearchListener;
import grph.algo.traversal.TreeBasedTraversal;
import grph.path.MatrixWrappedPath;
import java.util.ArrayList;
import toools.collections.IntQueue.ACCESS_MODE;

public class DFSAlgorithm extends TreeBasedTraversal
{

	@Override
	protected ACCESS_MODE getAccessMode()
	{
		return ACCESS_MODE.STACK;
	}
        
        

	public void DFS(Grph g,Agent yolo, int a,int b)
	{
            new DFSAlgorithm().compute(g, a, new GraphSearchListener() {
                
                
            ArrayList MyList = new ArrayList();
            MatrixWrappedPath S = g.getShortestPath(a, b, true);    

            @Override
            public DECISION vertexFound(int v)
            {
		g.getVertexColorProperty().setValue(v, 1);
                System.out.println("found vertex: " + v);
		return DECISION.CONTINUE;
            }

            @Override
            public void searchStarted()
            {
		System.out.println("Depht search starting");
            }

            @Override
            public void searchCompleted()
            {
                MyList.add(S.getVertexSet());
                System.out.println("Path of A to B");
                System.out.println(yolo+" Estoy caminando por:");
                for(Object i : MyList)
                {
                    System.out.println(i);  
                }
                System.out.println("Depht search terminated");
            }
		});
	}

    public DFSAlgorithm() {
    }

}