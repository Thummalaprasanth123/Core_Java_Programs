package in.prasanth.internalimplementation;

public class CustomArrayList {
	Object[] ar;
	int index = 0;

	public CustomArrayList() {
		ar = new Object[10];
	}

	public CustomArrayList(int i) {
		ar = new Object[i];
	}

	public void insert(Object obj) {
		 if(index>=ar.length)
		 {
		  Object[] ar1=new Object[ar.length+(ar.length/2)];
		  for( int i=0;i<ar.length;i++)
		  {
			ar1[i]=ar[i];  
		  }
		  ar=ar1;
		 }
		 ar[index++] = obj;
		 System.out.println(ar[index-1]);
	}
	public int size()
	{
		System.out.println(ar.length);
		return index;
	}
}
