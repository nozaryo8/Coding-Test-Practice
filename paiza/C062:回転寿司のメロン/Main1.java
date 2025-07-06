// 別解
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int melonCount = 0;
        List<String> foods = new ArrayList<String>();
        int waitTime = 0;

        // 寿司の種類を読み込み
        for(int i = 0; i < n; i++) {
            String line = sc.nextLine();
            foods.add(line);
        }

        // 各寿司をチェック
        for(int i = 0; i < foods.size(); i++) {
            String food = foods.get(i);

            if(food.equals("melon") && waitTime == 0) {
                melonCount++;
                waitTime = 10; 
            } else if (waitTime > 0) {
                waitTime--;
            }
        }

        System.out.println(melonCount);
    }
}