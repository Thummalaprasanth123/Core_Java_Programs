package in.prasanth.pkg2;
/*
 R=3 , C=5
 
 *****
 -***-
 --*--
 
 */
public class PyramidReverseProg3 {
	public static void main(String[] args) {
		int n=3,x=(2*n-1);
       for(int i=n;i>=1;i--)
       { 
    	 for(int j=i;j<n;j++)
    	 {
    	   System.out.print(" ");	 
    	 }
    	 for(int k=1;k<=x;k++)
    	 {
    	    System.out.print("*");
    	 }   	
    	 x=x-1;
    	 if(x%2==0)
    	 {
    		 x=x-1;
    	 }
    	 System.out.println();
       }
       
	}
}
