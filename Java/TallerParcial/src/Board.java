import java.util.Arrays;

public class Board{
    
    public int N;
    int[] board;
    public int cnt;
    int matriz[][];
    
    
    public Board(int n)
    {
        N = n;
        board = new int[N];
        for (int i = 0; i < N; i++)
        board[i] = 0;
        matriz = new int[N][N];
        cnt = 0;
    }
    
    
    /*
    bool isSafe(int Clm):
    
    Antes de la  siguiente reina, debemos comprobar la restricción de ataque:
    Dos reinas pueden atacar entre sí cuando en la misma columna o en la misma diagonal (reina se mueve en el juego de ajedrez).
    El método siguiente comprueba si la nueva reina coloca en el número de columna Clm ataca a las reinas anteriores (true) o no (false) 
    */
    
    public boolean isSafe(int Clm)
    {
        for (int i = 0; i < cnt; i++)
        {

            if ((board[i] == Clm) || Math.abs(Clm - board[i]) == (cnt - i)) 
                return false;
        }
        return true;
    }
    
    
    
    /* 
        Pone la siguiente reina en la columna Clm
    */
    
    public void Place(int Clm)
    {
        if (Clm >= 0 && Clm < N)
        {
            board[cnt] = Clm;
            cnt++;
        }
        else
        {
            System.out.println("Bad Column");
        }
    }
    
    /*
        Verifica si se han puesto el número de reinas equivalentes para cumplir el objetivo
    */
    
    public boolean IsGoal()
    {
        if(cnt == N) {
            return true;
        } else return false;
    }
    
    /*
        control de la recursión y obtener la última reina del vector
        board al llamar a este método que resta por una unidad del atributo cnt:
    */
    
    
    public void UnPlace()
    {
        if (cnt > 0)
        {
            cnt--;
        }
    }
    
    
    
    
    
    public int[][] ShowBoard()
    {
        
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            {
                if(j==board[i])
                {
                    matriz[i][j]=1;
                    
                    
                }
                else
                {
                    matriz[i][j]=0;
                    
                }
                
                
            }
        
        /*
        int n=0;
        for (int i = 0; i < cnt; i++)
        {
            matriz[i][n]=board[i];
            
        }
        n++;
        */
        
        
        
        System.out.println("\t Matriz N Queens \t");
        System.out.println("\n\n");
        
        
        for(int[] x: matriz)
        {
            System.out.println(Arrays.toString(x));
        }
        System.out.println("\n\n");
        
        
        
       return matriz;
     
    }
  


    public int [][] Check()
    {
        Board board = new Board(N);
        Board res = Search(board);
        if ( res!= null)
        {
            return res.ShowBoard();
        }
        else
        {
            System.out.println("no Result");
            return null;
        }
        
    }
    
    public Board Search (Board board)
    {
        
        if (board.IsGoal() == true)
        {
            return board;
        }
        else
        {
            for (int i = 0; i < board.N; i++)
            {
                if (board.isSafe(i))
                {
                    board.Place(i);
                    Board res= Search(board);
                    if (res != null)
                        return res;
                    board.UnPlace();
                }
            }

        }
        return null;
    }
    
}
