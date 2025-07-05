import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer points = Integer.parseInt(sc.nextLine());
        Integer returnRatio =  Integer.parseInt(sc.nextLine());
        
        Integer totalPoints = 0;
        Integer curPoints = 0;
        
        for(int i = 0; i < 7; i++) {
            totalPoints += points;
            points = (int)(points * returnRatio * 0.01);
        }
        
        System.out.println(totalPoints);
    }
}