package Workshop3;

public class Question2 {
public static void main(String[] args) {
        
        float[] arr = {10.5f, 20.0f, 30.5f, 40.0f, 50.5f};

        float sum = 0;

    
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

     
        float average = sum / arr.length;

      
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

}
