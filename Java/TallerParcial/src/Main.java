
import java.util.Arrays;


public class Main {
    
    
    public static void main(String[] args) {
       
        int n,source,destination,distance;
        int[][] matriz_a;
        int[][] matriz_b;
        source = 1;
        destination = 8;
        n=8;
        
        Board BoardNQueens = new Board(n);
        RecorridoCaballo BoardKnightTravel = new RecorridoCaballo(n);
        
        
        
        System.out.println("\n\n");
        matriz_a = new int[n][n];
        matriz_b = new int[n][n];
        matriz_a = BoardNQueens.Check();
        matriz_b = BoardKnightTravel.solveKT();
        
        System.out.println("The BFS traversal of the NQueens graph is ");
        BFS bfs = new BFS();
        bfs.bfs(matriz_a, source);
        
        System.out.println("\n\n");
        
        System.out.println("The DFS Traversal for the NQueens graph is given by ");
        DFS dfs = new DFS();
        dfs.dfs(matriz_a, source);
        
        System.out.println("\n\n");
        
        
        UniformCostSearch uniformCostSearch = new UniformCostSearch(n);
        distance = uniformCostSearch.uniformCostSearch(matriz_a,source, destination);
        uniformCostSearch.printPath();
 
        System.out.println("\nThe Distance between source " + source +
                           " and destination " + destination + " is " + distance);
        
        System.out.println("\n\n");
        
        System.out.println("The BFS traversal of the Knights graph is ");
        BFS bfs1 = new BFS();
        bfs1.bfs(matriz_b, source);
        
        System.out.println("\n\n");
        
        System.out.println("The DFS Traversal for the Knights graph is given by ");
        DFS dfs1 = new DFS();
        dfs1.dfs(matriz_b, source);
        
        System.out.println("\n\n");
        
        UniformCostSearch uniformCostSearch1 = new UniformCostSearch(n);
        distance = uniformCostSearch1.uniformCostSearch(matriz_a,source, destination);
        uniformCostSearch1.printPath();
 
        System.out.println("\nThe Distance between source " + source +
                           " and destination " + destination + " is " + distance);
        
        System.out.println("\n\n");
        
        
        
 
        
 
            
            
 
        
      
        
    }

}
