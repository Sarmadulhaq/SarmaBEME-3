
public class Main {

    public static void main(String args[])
    {
        int []a = {2,15,22,47,51};
        int []b = {14,18,26,45,49,56,78};
        // Array C of sum of size of the two sorted array A and B
        int []c = new int[a.length+b.length];  
        merge(a,b,c);
        System.out.print("Array a: ");
        printArray(a);
        System.out.println();
        System.out.print("Array b: ");
        printArray(b);
        System.out.println();
        System.out.print("Array c: ");
        printArray(c);
    }
		
	public static void merge(int []a, int []b, int []c)
	{
        int cursorA = 0,cursorB = 0,cursorC = 0;
        int sizeA = a.length;
		int sizeB = b.length;
        while(cursorA < sizeA && cursorB < sizeB)
		{
            if(a[cursorA] < b[cursorB])
			{
                c[cursorC++] = a[cursorA++];
            }
			else
			{

                c[cursorC++] = b[cursorB++];
            }

        }
        while(cursorA < sizeA)
		{
            c[cursorC++] = a[cursorA++];
        }
        while(cursorB < sizeB)
		{

            c[cursorC++] = b[cursorB++];
        }

    }
	public static void printArray(int []array){

        for(int i : array){

            System.out.print(i+" ");
        }
    }


}