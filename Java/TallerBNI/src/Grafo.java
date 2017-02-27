import brite.Graph.Node;
import grph.Grph;
import cnrs.grph.set.IntSet;
import grph.algo.AdjacencyMatrix;
import grph.properties.IntProperty;
import java.util.*;
import grph.Grph;
import grph.algo.topology.ClassicalGraphs;
import grph.algo.traversal.GraphSearchListener;
import grph.algo.traversal.*;
import toools.collections.IntQueue.ACCESS_MODE;

public class Grafo extends Grph
{
    Grph g;
   
    public Grafo()
    { 
        g = new Grph();
    }
    
    public void ver()
    {
        //g.displayGraphstream_0_4_2();
        g.display();
    }
    
    public void addNodos(int n)
    {   
        g.addNVertices(n);
    }
    
    public void removeNodo(int noVertice)
    {
        g.removeVertex(noVertice);
    }
    
    public void addArista(int nodoInicial, int nodoFinal, boolean dirigido, int peso)
    {
        int edge = g.addSimpleEdge(nodoInicial, nodoFinal, dirigido);
        g.getEdgeWeightProperty().setValue(edge, peso);
        g.getEdgeLabelProperty().setValue(edge,"("+edge+","+g.getEdgeWeightProperty().getValueAsString(edge)+")");
    }
    
    public void removeArista(int arista)
    {
      g.removeEdge(arista);
    }
    
    public void setTamanioVertice(int noVertice, int size)
    {
        g.getVertexSizeProperty().setValue(noVertice, size);
    }
    
    public void setPesoArista(int edge, int peso)
    {
       g.getEdgeWeightProperty().setValue(edge, peso);
       g.getEdgeLabelProperty().setValue(edge,"("+edge+","+g.getEdgeWeightProperty().getValueAsString(edge)+")");
    }
    
    public AdjacencyMatrix getMatrizAdyaciencia()
    {
       AdjacencyMatrix a = g.getAdjacencyMatrix();
        System.out.println(a.toString());
        return a;
       
    }
    
    public void crearRedNodos(int ancho, int alto, boolean dirigido, boolean diagonales)
    {
        g.grid(ancho, alto, dirigido, diagonales);
    }
    
    public void setColorNodo(int nodo, int color)
    {
        g.getVertexColorProperty().setValue(nodo, color);
    }
    
    public void setColorArista(int arista, int color)
    {
      g.getEdgeColorProperty().setValue(arista, color);
    }
    
    public int[] getNodos()
    {
      IntSet nVertices = g.getVertices();
      return nVertices.toIntArray();
    }
    
    public int[] getAristas()
    {
      IntSet nAristas = g.getEdges();
      return nAristas.toIntArray();
    }
    
    public Grph getGraph()
    {
      return this.g;  
    }
    
    public IntProperty getPesosAristas()
    {
      IntProperty e = g.getEdgeWeightProperty();
      System.out.println(e.toString());
      return e;
    }
    
    public void setNombreNodo(int nodo, String nombre)
    {
        g.getVertexLabelProperty().setValue(nodo, nombre);
    }
    
    public void setNombreArista(int arista, String nombre)
    {
       g.getEdgeLabelProperty().setValue(arista, nombre);
    }
    
    public Grafo MyGraph()
    {
        Grafo MyGraph = new Grafo();
        MyGraph.addNodos(14);
        MyGraph.setNombreNodo(1, "Mistrato");
        MyGraph.setNombreNodo(2, "Pueblo rico");
        MyGraph.setNombreNodo(3, "Guatica");
        MyGraph.setNombreNodo(4, "Quinchia");
        MyGraph.setNombreNodo(5, "Belen de umbria");
        MyGraph.setNombreNodo(6, "Apia");
        MyGraph.setNombreNodo(7, "Santuario");
        MyGraph.setNombreNodo(8, "La celia");
        MyGraph.setNombreNodo(9, "Balboa");
        MyGraph.setNombreNodo(10, "La virginia");
        MyGraph.setNombreNodo(11, "Pereira");
        MyGraph.setNombreNodo(12, "Dosquebradas");
        MyGraph.setNombreNodo(13, "Santa rosa de cabal");
        MyGraph.setNombreNodo(0, "Marsella");
        
        MyGraph.addArista(1, 2, true, 0);
        MyGraph.addArista(1, 3, true, 0);
        MyGraph.addArista(1, 5, true, 0);
        
        MyGraph.addArista(2, 5, true, 0);
        MyGraph.addArista(2, 6, true, 0);
        MyGraph.addArista(2, 7, true, 0);
        
        MyGraph.addArista(3, 4, true, 0);
        MyGraph.addArista(3, 5, true, 0);
        
        MyGraph.addArista(5, 6, true, 0);
        
        MyGraph.addArista(6, 7, true, 0);
        
        MyGraph.addArista(7, 8, true, 0);
        MyGraph.addArista(7, 9, true, 0);
        MyGraph.addArista(7, 10, true, 0);
        
        MyGraph.addArista(8, 9, true, 0);
        
        MyGraph.addArista(9, 10, true, 0);
        MyGraph.addArista(9, 11, true, 0);
        
        MyGraph.addArista(10, 11, true, 0);
        MyGraph.addArista(10, 0, true, 0);
        
        MyGraph.addArista(11, 12, true, 0);
        MyGraph.addArista(11, 13, true, 0);
        MyGraph.addArista(11, 0, true, 0);
        
        MyGraph.addArista(12, 13, true, 0);
        MyGraph.addArista(12, 0, true, 0);
        
        MyGraph.addArista(13, 0, true, 0);
        
        
        return MyGraph;
        
    }
    
    public class BFSAlgorithm extends TreeBasedTraversal
{

	protected ACCESS_MODE getAccessMode()
	{
		return ACCESS_MODE.QUEUE;
	}

	public void BFS()
	{
            //Grph g = ClassicalGraphs.PetersenGraph();
            new BFSAlgorithm().compute(g, 0, Grph.DIRECTION.out, new GraphSearchListener() 
            {

			@Override
			public GraphSearchListener.DECISION vertexFound(int v)
			{
				System.out.println("found vertex: " + v);
				return GraphSearchListener.DECISION.CONTINUE;
			}

			@Override
			public void searchStarted()
			{
				System.out.println("search starting");
			}

			@Override
			public void searchCompleted()
			{
				System.out.println("search terminated");
			}
            });
	}

    public BFSAlgorithm() {
    }
        
        
        

}


    
    
   
    
    
    
}
