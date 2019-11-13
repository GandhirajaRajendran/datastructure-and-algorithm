package com.myfirst.trialproj;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       int array[] = {1,10,11,15,2,-3};
       
       int value =12;
       
      System.out.println("native"+ nativemethod(array,value));
       nativemethodmultipleans(array,value);
    		   
    }

    
    //GIVES ONLY ONE RESULT SO NOT SUITABLE IF THERE ARE MANY ANSWERS //BRUTE FORCE
	private static String nativemethod(int[] array, int value) {

		for(int i=0; i<array.length-1;i++) {
			for(int j=i+1; j<array.length;j++) {
				
				if(array[i]+array[j]==value) {
					//System.out.println(array[i] +"   " + array[j]);
					return "i = "+array[i]+" and j ="+array[j];
					
				}
			}
		}
	
		
	
		return "NO PAIRS FOUND";
	}

	//SUITABLE FOR MANY ANSWERS //BRUTE FORCE
	private static void nativemethodmultipleans(int[] array, int value) {
		
		for(int i=0; i<array.length-1;i++) {
			for(int j=i+1; j<array.length;j++) {
				
				if(array[i]+array[j]==value) {
					System.out.println(array[i] +"   " + array[j]);
					
					
				}
			}
		}
	
		
	}
}
