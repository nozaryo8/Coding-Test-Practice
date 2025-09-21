count, level = map(int, input().split())

for n in range(count):
    enemy_level = int(input())
    if level > enemy_level:
        level += enemy_level//2
    elif level < enemy_level:
        level //= 2
    else:
        pass
    
print(level)