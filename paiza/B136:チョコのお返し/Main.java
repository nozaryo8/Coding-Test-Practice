import java.util.*;
public class Main {
    public static void main(String[] args) {
        // ・1 行目に移動回数を表す N、クラスの縦の席数 H、クラスの横の席数 W がこの順で半角スペース区切りで与えられます。
        // ・2 行目に あなたの座席が前から何列目かを表す sy と 左から何列目かを表す sx がこの順で半角スペース区切りで与えられます。
        // ・3 行目に、あなたの移動経路を表す N 文字の文字列 s が与えられます。 s の i 文字目 (1 ≦ i ≦ N) は、前方向に移動する場合 "F"、後方向に移動する場合 "B"、左方向に移動する場合 "L"、右方向に移動する場合 "R" となります。
        // ・続く H 行のうちの i 行目 (1 ≦ i ≦ H) には W 個の整数が半角スペース区切りで与えられます。i 行目の j 番目 (1 ≦ j ≦ W) の整数 c_{i, j} は前から i 列目、左から j 列目に座っているクラスメイトがくれるチョコレートの数を表します。
        // ・入力は合計で H + 3 行となり、入力値最終行の末尾に改行が 1 つ入ります。
        
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        Integer n  = Integer.parseInt(line1[0]);
        Integer vertical = Integer.parseInt(line1[1]);
        Integer horizontal = Integer.parseInt(line1[2]);
        
        String[] line2 = sc.nextLine().split(" ");
        Integer myPositionX = Integer.parseInt(line2[0])-1;
        Integer myPositionY = Integer.parseInt(line2[1])-1;
        
        String line3 = sc.nextLine();
        char[] route = new char[n];
        route = line3.toCharArray();
        
        Integer[][] seats = new Integer[vertical][horizontal];
        for (int i = 0; i < vertical; i++) {
            String[] lineX = sc.nextLine().split(" ");
            for (int j = 0; j < horizontal; j++) {
                seats[i][j] = Integer.parseInt(lineX[j]);
            }
        }
        
        for(int i = 0; i < n; i++) {
            int chocoCount = 0;
            if(route[i] == 'F') {
                chocoCount = seats[myPositionX-=1][myPositionY];
            } else if(route[i] == 'B') {
                chocoCount = seats[myPositionX+=1][myPositionY];
            } else if(route[i] == 'L') {
                chocoCount = seats[myPositionX][myPositionY-=1];
            } else if(route[i] == 'R') {
                chocoCount = seats[myPositionX][myPositionY+=1];
            }
            
            System.out.println(chocoCount);
        }
        
    }
}