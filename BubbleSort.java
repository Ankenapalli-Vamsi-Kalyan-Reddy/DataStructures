//This is bubble sort where it sorts jumbled integers in ascending order
public class BubbleSort {

	public static void main(String[] args) {
	int temp,j;
	int array[] = {0,-10,50,20,10,40};
	System.out.println("given array");
	System.out.print("[ ");
	for(int l = 0; l < array.length; l++) {
		System.out.print(array[l]+" ");
	}
	System.out.print("]");
	System.out.println();
    for(int i = 0; i < array.length; i++) {
    	if (i%2 == 0) {
         	 j = 0;
    	}
    	else {
    		 j = 1;
    	}
    	while(j < array.length) {
    		if(j == array.length-1 ) {
    			break;
    		}
    		else if(array[j] > array[j+1]) {
    			temp = array[j];
    			array[j] = array[j+1];
    			array[j+1] = temp;
    		}
    		j+=2;
    	}
    }
    System.out.println("sorted array");
    System.out.print("[ ");
    for(int k =0; k < array.length; k++) {
    	System.out.print(array[k]+" ");
    }
    System.out.print("]");
    	}

}