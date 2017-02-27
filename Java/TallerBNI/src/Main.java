import grph.Grph;

public class Main extends Grph{
    
    public static void main(String[] args) {
        
        Grafo MyGraph = new Grafo();
        BFSAlgorithm MyBFS = new BFSAlgorithm();
        DFSAlgorithm MyDFS = new DFSAlgorithm();
        @SuppressWarnings("UnusedAssignment")
        Grph newGraph = new Grph();
        MyAgent YoloAgent = new MyAgent();
        
        
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
        
        MyGraph.addArista(1, 2, false, 70);
        MyGraph.addArista(1, 3, false, 25);
        MyGraph.addArista(1, 5, false, 16);
        
        MyGraph.addArista(2, 5, false, 54);
        MyGraph.addArista(2, 6, false, 26);
        MyGraph.addArista(2, 7, false, 40);
        
        MyGraph.addArista(3, 4, false, 18);
        MyGraph.addArista(3, 5, false, 25);
        
        MyGraph.addArista(5, 6, false, 28);
        
        MyGraph.addArista(6, 7, false, 15);
        
        MyGraph.addArista(7, 8, false, 23);
        MyGraph.addArista(7, 9, false, 38);
        MyGraph.addArista(7, 10, false, 35);
        
        MyGraph.addArista(8, 9, false, 14);
        
        MyGraph.addArista(9, 10, false, 19);
        MyGraph.addArista(9, 11, false, 46);
        
        MyGraph.addArista(10, 11, false, 27);
        MyGraph.addArista(10, 0, false, 55);
        
        MyGraph.addArista(11, 12, false, 5);
        MyGraph.addArista(11, 13, false, 15);
        MyGraph.addArista(11, 0, false, 32);
        
        MyGraph.addArista(12, 13, false, 12);
        MyGraph.addArista(12, 0, false, 35);
        
        MyGraph.addArista(13, 0, false, 39);
        
        
       
        newGraph = MyGraph.getGraph();
        
        //MyBFS.BFS(newGraph,YoloAgent,1,13);
        
        MyDFS.DFS(newGraph,YoloAgent,1,13);
        
        newGraph.display();
        
        
    }
    
}















