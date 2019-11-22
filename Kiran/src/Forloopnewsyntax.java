
public class Forloopnewsyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,9,4,7,8};
		int sum =0;
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		for ( int i: a)      // new syntax of for loop
		{
			sum+=i;
		}
		
		System.out.println("sum of array is"+sum);
		/*int i=0;
		for (;i<5;i++)
		{
			System.out.println(a[i]);
		}*/
	}

}
