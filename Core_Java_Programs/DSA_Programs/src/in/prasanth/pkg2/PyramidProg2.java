package in.prasanth.pkg2;

/*
 R=3 , C=5
 --*--
 -***-
 *****
 
 */
public class PyramidProg2 {
	public static void main(String[] args) {
		int n=3,x=0;
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
	}
}
