/* Implementation of selection sort algorithm using java.
   Performance of this selection sort algorithm is O(n^2).
   Initially it takes element at index 0 as minimum value
   and compare with rest of the elements in the array if any
   value in rest of the array is smaller than minimum value
   then swapping takes place otherwise no swapping.
   That means 1st element is sorted and the next element at index 1
   is considered as minimum value and compared with rest of the 
   array and if any value in rest of the array is smaller than 
   minimum value then swapping takes place otherwise no swapping.
   Process continues like that....
*/
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
