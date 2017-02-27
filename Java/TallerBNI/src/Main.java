import grph.Grph;

public class Main extends Grph{
    
    public static void main(String[] args) {
        
        
        BFSAlgorithm MyBFS = new BFSAlgorithm(); //Instanciamos dos objetos para hacer la busqueda en anchura y profundidad
        DFSAlgorithm MyDFS = new DFSAlgorithm();
        
        
        MyAgent YoloAgent = new MyAgent(); //Creamos un agente que va acompañar la busqueda del camino A to B
        
        
        ViejoCaldas Graph = new ViejoCaldas(); //Creamos un grafo con todos los municipios del viejo caldas "53"
        Grph newGraph = new Grph();
        Grafo MyGraph = new Grafo();
        
        Graph.addGraph(MyGraph); //Se le añade los municipios al grafo
        
        newGraph = MyGraph.getGraph();//Convertimos nuestro grafo al tipo de grafo de la librería para poder hacer la busqueda
        
        MyBFS.BFS(newGraph,YoloAgent,1,50);//BFS y DFS, las cuáles nos dibujan un grafo por pantalla y no recibe, un grafo, un agente, camino A y camino B
        MyDFS.DFS(newGraph,YoloAgent,1,50);
        
        newGraph.display();
        
        
    }
    
}















