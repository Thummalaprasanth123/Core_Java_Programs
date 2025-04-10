package in.prasanth.pkg2;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str1 = "ho23bh2824j4k";
		String str2=new String(str1);
		String str="";
		int count=0;
        for(int i=0;i<(str1.length()-1);i++)
        {
        	for(int j=0;j<str2.length();j++)
        	{
        		if((i==j)/*&&i<=(str1.length()-2)*/)
        		{
        			j=i+1;
        		}
        		if(str1.charAt(i)==str2.charAt(j))
        		{
        			if(!(str.contains(String.valueOf(str1.charAt(i)))))
        			{
        			str=str+String.valueOf(str1.charAt(i));
        			System.out.println(str1.charAt(i));
        			count=count+1;
        			}		
        		}
				if ((i == j)/* &&i<=(str1.length()-2) */)
        			j--;
        	}
        	
;        }
        System.out.println(count);
	}

}
