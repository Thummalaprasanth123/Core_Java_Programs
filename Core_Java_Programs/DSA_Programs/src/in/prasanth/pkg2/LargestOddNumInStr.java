package in.prasanth.pkg2;

public class LargestOddNumInStr {

	public static void main(String[] args) {
		String str = "10";      //46070
		int max = 0;
		int[] arr = new int[str.length()];
		int a=Integer.parseInt(str);
		int d=a/10;
		 if(str.charAt((str.length()-1))-'0'==0)
         {
             if(d%2!=0)
             {
       	     String s1=String.valueOf(d);
                System.out.println(s1);
             }
         }
         else if(a%2!=0)
         {
            String s2=String.valueOf(a); 
            System.out.println(s2);
         }
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] =str.charAt(i)-'0';
			if ((arr[i] % 2 != 0)&&arr[i]!=0) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
		}
		String result=String.valueOf(max);
		
		if(max>0)
			System.out.println(result);
	        else
	        	System.out.println("");
//		int f=Integer.parseInt(result);
//		System.out.println(f);
	}

}
