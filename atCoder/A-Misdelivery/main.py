num = int(input())

rooms = [input() for _ in range(num)]

room_number, person_name = input().split()

if(rooms[int(room_number)-1] == person_name):
  print('Yes')
else:
  print('No')