import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// HashSet
// 計算量　平均 O(n)

// HashSetはなぜ計算量が少なくなるのか
// 要素を追加するときや、contains() で要素の存在確認をするときは、
// その要素の「ハッシュ値（hashCode）」を計算し、ハッシュテーブルの特定の場所（バケット）にアクセスするから。またHashsetは重複なく1つずつしか保存できない。
// ArrayListでcontains() を使うと 最初から最後まで順番にすべての要素を比較するので O(n)（最悪のケースですべてチェックした場合）
class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

// 悪い例
// 計算量は全体で O(n²) 
// •for (int num : nums) のループは n 回
// •各ループで contains が最大 n 回の探索を行う
class BadSolution {
    public boolean containsDuplicate(int[] nums) {

        boolean flag = false;
        List<Integer> n = new ArrayList<Integer>();

        for (int num : nums) {
            if(n.contains(num)) 
                flag = true;
            n.add(num);
        }
        return flag;
    }
}