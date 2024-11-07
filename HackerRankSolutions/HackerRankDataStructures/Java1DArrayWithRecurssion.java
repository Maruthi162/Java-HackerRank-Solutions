package HackerRankSolutions.HackerRankDataStructures;

import java.util.Scanner;

public class Java1DArrayWithRecurssion {

    
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        // Create an array to track visited positions to prevent infinite recursion.
        boolean[] visited=new boolean[game.length];
        // Start the recursion from position 0.
        return canWinHelper(leap, game, 0, visited);
    }


    //Helper method for canWin
    public static boolean canWinHelper(int leap, int[] game, int position, boolean[] visited){
         // Base case 1: If the current position is out of bounds (you won the game).
        if(position>=game.length){
            return true;
        }
        // Base case 2: If the current position is a hole (0) or you've already visited it, return false
        if(position<0 || visited[position] || game[position]==1){
            return false;
        }
        visited[position]=true;
        // 3 possible moves: 
        
        // 1. Try to move forward by "leap"
        if(canWinHelper(leap, game, position+leap, visited)){
            return true;
        }
         // 2. Try to move one step forward (i.e., position + 1)
        if(canWinHelper(leap, game, position+1, visited)){
            return true;
        }
        // 3. Try to move one step backward (i.e., position - 1)
        if(canWinHelper(leap, game, position-1, visited)){
            return true;
        }
        return false;
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
