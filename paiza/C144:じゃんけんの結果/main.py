def _judge_game(lines):
    win_count = 0
    for line in lines:
        alice = line[0]
        bob = line[2]
        
        if(alice == bob):
            pass
        elif(alice == 'G' and bob == 'C'):
            win_count += 1
        elif(alice == 'C' and bob == 'P'):
            win_count += 1
        elif(alice == 'P' and bob == 'G'):
            win_count += 1
        else:
            pass
        
        ##  修正版（読みやすさ重視 この2行で上記と同じ実行結果になる。 こういう書き方もあるという学習のためメモ）
        # if (alice, bob) in [('G', 'C'), ('C', 'P'), ('P', 'G')]:
        #     win_count += 1
    
    return win_count
    
n = int(input())
lines = [input() for _ in range(n)]

print(_judge_game(lines)) 