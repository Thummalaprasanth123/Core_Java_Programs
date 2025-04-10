package in.prasanth.pkg2;
public class DiamondProg {
	public static void main(String[] args) {
		int n=4,x=0;
       for(int i=1;i<=n;i++)
       { 
    	 for(int j=i;j<n;j++)
    	 {
    	   System.out.print(" ");	 
    	 }
    	 for(int k=1;k<=(i+x);k++)
    	 {
    	    System.out.print("*");
    	 }
    	 x=x+1;  //x=1;  //x=2
    	 System.out.println();
       }
      
     int y=(2*n-1);
       for(int i=n;i>=1;i--)
       { 
    	 for(int j=i;j<n;j++)
    	 {
    	   System.out.print(" ");	 
    	 }
    	 for(int k=1;k<=y;k++)
    	 {
    	    System.out.print("*");
    	 }   	
    	 y=y-1;
    	 if(y%2==0)
    	 {
    		 y=y-1;
    	 }
    	 System.out.println();
       }
	}
}
