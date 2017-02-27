import aima.core.agent.Agent;
import cnrs.grph.set.IntSet;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.cursors.IntCursor;
import grph.Grph;
import grph.algo.distance.PredecessorMatrix;
import grph.algo.traversal.GraphSearchListener;
import grph.algo.traversal.*;
import grph.path.MatrixWrappedPath;
import java.util.ArrayList;
import java.util.Iterator;
import static org.apache.commons.math.stat.inference.TestUtils.t;
import toools.collections.IntQueue.ACCESS_MODE;

public class BFSAlgorithm extends TreeBasedTraversal 
{
	
  
    
    
    
    protected ACCESS_MODE getAccessMode()
	{
	  return ACCESS_MODE.QUEUE;
	}

	public void BFS(Grph g,Agent yolo,int a,int b)
	{
          
            new BFSAlgorithm().compute(g, a, Grph.DIRECTION.out, new GraphSearchListener() 
            {
                
                ArrayList MyList = new ArrayList();
                MatrixWrappedPath S = g.getShortestPath(a, b, true);
                
                
                @Override
		public GraphSearchListener.DECISION vertexFound(int v)
		{

                    g.getVertexColorProperty().setValue(v, 1);                    
                    System.out.println("found vertex: " + v);
                    return GraphSearchListener.DECISION.CONTINUE;
		}

		@Override
		public void searchStarted()
		{
                    System.out.println("Breadth search starting");
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
                   System.out.println("Breadth search terminated");
		}
            });
	}

    public BFSAlgorithm() {
        
    }
        
        
        

}


