package insertionsort;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        
        //Insertion Sort Algorithm
        
        int[] vetor = {56, 25, 32, 10 ,11};
        
        for(int i = 1; i < vetor.length; i++){  
            int currentNumber = vetor[i];  
            int j = i - 1;     
            
            while(( j > -1 ) && ( vetor[j] > currentNumber)){  
                 vetor[j + 1] = vetor[j];  
                 j--;   
            }
            vetor[j + 1] = currentNumber;  
        }
        System.out.println(Arrays.toString(vetor)); 
        
    }
    
}
