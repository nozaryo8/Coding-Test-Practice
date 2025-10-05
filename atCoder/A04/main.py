num = int(input())

remainders = []

while num != 0:
  remainders.append(str(num % 2))
  num = num // 2

remainders.reverse()

binary_str = ''.join(remainders)

while len(binary_str) < 10:
    binary_str = '0' + binary_str

print(binary_str)