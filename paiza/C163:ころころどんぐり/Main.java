import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        Integer energy = 0;
        String flag = "YES"; 
        
        String[] tmp = sc.nextLine().split(" ");
        int[] distances = new int[n];
        for(int i = 0; i < n; i++) { 
            distances[i] = Integer.parseInt(tmp[i]);
        }
        
        
        for(int i = 0; i < n; i++) {
            energy += distances[i];
            if(energy >= 1) {
                flag = "NO";
                break;
            }
        }
        
        System.out.println(flag);
    }
}