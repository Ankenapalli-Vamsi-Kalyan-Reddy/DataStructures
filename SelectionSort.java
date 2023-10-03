// Implementation of selection sort algorithm using java

public class SelectionSort {
	public static void main(String[] args) {
		int min,temp,index =0;
		int array[] = {0,-10,50,20,10,40};
		for(int i = 0; i < array.length; i++) { 
			
			   min = array[i];
			   index = i;
			   
               for(int j = i; j < array.length-1; j++ ) {
            	   
            	    if(min > array[j+1]) {
            	    	
                         min = array[j+1];
                         index = j+1;
                       
            	    }
               }
               
               temp = min;
               array[index] = array[i];
               array[i] = temp;
                            
		}
for(int k = 0; k < array.length; k++) {
	System.out.println(array[k]);
}
}
}