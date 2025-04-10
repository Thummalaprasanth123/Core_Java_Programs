package in.prasanth.pkg1;

public class ArmstrongNumber {
	public static void main(String[] args) {
//		153=(1*1*1)+(5*5*5)+(3*3*3)
		int num = 54748;
		int finalR=0;
		int ind=1;
		String str = String.valueOf(num);
        for(int i=0;i<=(str.length()-1);i++)
         {  
        	for(int j=0;j<=(str.length()-1);j++)
        	{
           	  int r=str.charAt(i)-'0';
           	  ind=ind*r;
        	}
        	finalR=finalR+ind;
        	ind =1;
         }
        System.out.println(finalR);
        }
	}

