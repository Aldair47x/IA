import grph.Grph;
import cnrs.grph.set.IntSet;
import grph.algo.AdjacencyMatrix;
import grph.properties.IntProperty;

public class Grafo
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
    
}

