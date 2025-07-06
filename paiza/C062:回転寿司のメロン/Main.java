import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        Integer melonCount = 0;
        List<String> foods = new ArrayList<String>();
        Integer waitTime = 0;
        
        for(int i = 0; i < n; i++) {
            String food = sc.nextLine();
            
            if(food.equals("melon") && waitTime == 0) {
                melonCount++;
                waitTime = 10; 
            } else if(waitTime > 0) {
                waitTime--;
            }
        }
        
        System.out.println(melonCount);
    }
}