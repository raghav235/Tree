import java.util.Arrays;

public class KnapSackProblemWithDP {
	
	static int[][] computationResult;

	 public static void main(String args[]) 
	    { 
	        int val[] = new int[] { 60, 100, 120 }; 
	        int wt[] = new int[] { 10, 20, 30 }; 
	        int W = 50; 
	        int n = val.length; 
	        computationResult= new int[n+1][W+1];
	        for(int i=0;i<computationResult.length;i++){
	        	Arrays.fill(computationResult[i], 0);
	        }
	        
	        for(int i=1;i<n+1;i++){
	        	for (int j=1;j<W+1;j++){
	        		if(wt[i-1]<=j){
	        			computationResult[i][j]=Math.max(val[i-1]+computationResult[i-1][j-wt[i-1]],computationResult[i-1][j]);
	        		}
	        		else {
	        			computationResult[i][j]=computationResult[i-1][j];
	        		}
	        	}
	        }
	        
	        System.out.println(computationResult[n][W]); 
	    }
}
	