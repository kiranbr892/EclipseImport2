
public class Arraytwodimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]={1,2,3,4};
		int l[]={5,6,7,8};
		int m[]={4,5,8,9};
		
		int d[][]={
					{1,2,3,4},
					{5,6,7,8},
					{4,5,8,9}
				};
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print("	"+d[i][j]);
			}
			System.out.println();
		}
		}
	}


