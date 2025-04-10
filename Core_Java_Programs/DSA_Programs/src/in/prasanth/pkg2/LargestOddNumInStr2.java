package in.prasanth.pkg2;

public class LargestOddNumInStr2 {

	public static void main(String[] args) {
		String str ="46076"; /*"48637840"; */     //46070
		int i=Integer.parseInt(str);
		int coe=0;
		if(i%2!=0)
		{
			System.out.println(i);
		}
		else {
		while(i>0)
		{
		   coe=i/10;
		   if(coe%2!=0)
		   {
			 System.out.println(coe);
			 break;
		   }
		   i=coe;
	
		}
		}
		
	}

}
