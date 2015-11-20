package insertsort;

public class Main 
{

	public static void main(String[] args) 
	{
		int[] num =new int[] {2,78,4,3};
		int x= num.length;
		for(int u=0;u<x;u++)
		{
			for(int y=0;y<x;y++)
			{
				for(int z=y+1;z<x;z++)
				{
					if(num[y]>num[z])
					{
					int temp= num[y+u];
					num[y+u]=num[z];
					num[z]=temp;
					}
				
				}
			
			}
			System.out.println(num[u]);
		}
		
	}

}
