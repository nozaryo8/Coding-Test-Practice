num_list = list(map(int, input().split()))

for i in (range(2, 10)):
  val = num_list[i-1] + num_list[i-2]
  num_list.append(int(str(val)[::-1]))      
print(num_list[9])
