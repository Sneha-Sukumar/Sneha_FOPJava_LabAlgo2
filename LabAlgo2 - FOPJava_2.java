import java.util.*;   
public class Main{  // function to count and print currency notes for a given amount 	
public static void getCurrencyCount(int amount,int[] notes,int n ) 	
{ 		
    int[] cnt = new int[n]; 	 		
    for (int i = 0; i < n; i++) 
    { 			
        if (amount >= notes[i]) 
        { 				
            cnt[i] = amount / notes[i]; 				
            amount = amount % notes[i]; 			        
            
        } 		
        
    } 	 		
    for (int i = 0; i < n; i++) 
    { 			
        if (cnt[i] != 0) 
        { 				
            System.out.println(notes[i] + " : " + cnt[i]);
            } 		
        
    } 	
    
} 	 	
// main function 	
public static void main(String argc[])
{ 	    
    Scanner sc= new Scanner(System.in); 	    
    System.out.println("Enter the size of currency denominations : "); 	    
    int n=sc.nextInt(); 		 		 		
    int[] notes = new int[n]; 		
    System.out.println("Enter the currency denominations value : "); 		
    for(int i=0;i<n;i++) 		
    { 		
        notes[i]=sc.nextInt(); 		
        
    } 	    
    
        int temp = 0;    //Temporary variable to store the element
        
         for (int i = 0; i < notes.length; i++)   //Holds each Array element
         {     
            for (int j = i+1; j < notes.length; j++)    //compares with remaining Array elements
            {     
               if(notes[i] < notes[j]) //Compare and swap
               {    
                   temp = notes[i];    
                   notes[i] = notes[j];    
                   notes[j] = temp;    
               }     
            }     
        }    
    System.out.println("Enter the amount you want to pay : "); 	    
    int amount=sc.nextInt();	
    System.out.println("Your payment approach in order to give min no of notes will be : ");
    getCurrencyCount(amount,notes,n); 	
    
} 
    
} 
