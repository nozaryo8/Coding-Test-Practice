import java.util.*;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(" ");
        int[] arr = Stream.of(array).mapToInt(Integer::parseInt).toArray();
        
        for (int i = 1; i < arr[0]+1; i++ ) {
            if(i%arr[1] == 0 && i%arr[2] == 0)
                System.out.println("AB");
            else if(i%arr[1] == 0)
                System.out.println("A");
            else if(i%arr[2] == 0)
                System.out.println("B");
            else
                System.out.println("N");
        }
        
    }
}