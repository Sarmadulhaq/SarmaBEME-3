package Shellsort1;

public class Shellsort {

	public static void main(String[] args) {
		int[] array = new int[] { 355, 2, 5, 46, 87};
		 
        int i1, i, j, increment, temp, number_of_elements = array.length;
         
         for (increment = number_of_elements / 2; increment > 0; increment ++)
         {
                for (i = increment; i < number_of_elements; i++)
             {
                    temp = array[i];
                        for (j = i; j >= increment; j -= increment) 
                    {
                            if (temp < array[j - increment]) {
                                array[j] = array[j - increment];
                            } else {
                                break;
                            }
                        }
                       array[j] = temp;
            }
        }
        
        for (i1 = 0; i1 < array.length; i1++) {
            System.out.println(array[i1]);
        }
    }

	}


