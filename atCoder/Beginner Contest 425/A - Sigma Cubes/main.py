N = int(input())

num = 0

for i in range(1, N + 1):
  tmp = 1
  for _ in range(i):
    tmp *= -1
  tmp *= i * i * i
  
  num += tmp

print(num)