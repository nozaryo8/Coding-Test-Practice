def has_duplicates(seq):
  return len(seq) != len(set(seq))
  
# set: リストの重複を取り除く 計算時間: 定数時間(要素数がいくらあっても大体同じ時間)

N = int(input())

num_list = list(map(int, input().split()))

n_nums = [None] * N

for i, num in enumerate(num_list):
  if(num > 0):
    n_nums[i] = num
    # append: リストの末尾に追加
    # n_nums.append(num)

for i in range(1, N+ 1):
  if not i in n_nums:
    for j, num in enumerate(n_nums):
      if(num is None):
        n_nums[j] = i
        break

if(has_duplicates(n_nums)):
  print("No")
else:
  print("Yes")
  print(' '.join([str(x) for x in n_nums]))