import java.util.Arrays;

public class KnapSackProblemWithMemoization {
	
	static int[][] computationResult;

	 public static void main(String args[]) 
	    { 
	        int val[] = new int[] { 60, 100, 120 }; 
	        int wt[] = new int[] { 10, 20, 30 }; 
	        int W = 50; 
	        int n = val.length; 
	        computationResult= new int[n+1][W+1];
	        for(int i=0;i<computationResult.length;i++){
	        	Arrays.fill(computationResult[i], -1);
	        }
	        System.out.println(knapSack(wt, val, W, n)); 
	    }

	private static int knapSack(int wt[], int val[], int W,int n) {
		//if bag has no capacity(W=0)
		//or no items present in store (n=0)
		//this case profit will be 0
		//there are two case=> the current element weight is less than bag capacity
				// recursion case=> include last item in bag and process rest of the elements 
				//exclude last item from the bag and process rest of the element
				// consider max of above 2
		
		// the current element weight is greater than bag capacity
				// exlude this and process with next set of elements
		
		if(n==0||W==0){
			return 0;
		}
		
		if (computationResult[n][W]!=-1){
			return computationResult[n][W];
		}
		
		if(wt[n-1]<=W){
			return computationResult[n][W]=Math.max(val[n-1]+knapSack(wt,val,(W-wt[n-1]),n-1),
					knapSack(wt,val,W,n-1) );
		}else{
			return computationResult[n][W]=knapSack(wt,val,W,n-1);
		}
	} 
}
