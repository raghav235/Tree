



public class KnapSackProblem {

	 public static void main(String args[]) 
	    { 
	        int val[] = new int[] { 60, 100, 120 }; 
	        int wt[] = new int[] { 10, 20, 30 }; 
	        int W = 50; 
	        int n = val.length; 
	        System.out.println(knapSack(wt, val, W, n)); 
	    }

	private static int knapSack(int wt[], int val[], int W,int n) {
		//if bag has no capacity(W=0)
		//or no items present in store (n=0)
		//this case profit will be 0
		if(n==0||W==0){
			return 0;
		}
		if(wt[n-1]<=W){
			return Math.max(val[n-1]+knapSack(wt,val,(W-wt[n-1]),n-1),
					knapSack(wt,val,W,n-1) );
		}else{
			return knapSack(wt,val,W,n-1);
		}
	} 
}
