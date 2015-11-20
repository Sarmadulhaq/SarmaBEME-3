package Classwork;

public class Main {

	public static void main(String[] args) 
	{
		int [] num = new int [] {2,5,3,3,5,3,8};
		int x=num.length;
	
		for(int y=0;y<x;y++)
		{
			for(int u=y+1;u<x;u++)
			{
				if(num[y]>num[u])
				{
					int temp=num[y];
					num[y]=num[u];
					num[u]=temp;
				}
			}
			System.out.println(num[y]);
		}
		
	}

}
