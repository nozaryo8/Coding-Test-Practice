# coding: utf-8

N, M = map(int, input().split())

# 各料理の必要食材
menus = [list(map(int, input().split())) for _ in range(N)]

# 各食材の消費期限
expires = list(map(int, input().split()))

Q = int(input())
queries = [list(map(int, input().split())) for _ in range(Q)]

# 在庫: 各食材ごとに [(last_usable_time, 個数), ...] （古い在庫が先頭）
stocks = [[] for _ in range(M)]

for query in queries:
    a = query[0]
    t = query[1]

    # 期限切れ削除（last_usable_time < t のものを捨てる）
    for i in range(M):
        while stocks[i] and stocks[i][0][0] < t:
            stocks[i].pop(0)

    if a == 0:
        # 仕入れ: 0 t b c
        _, _, b, c = query
        b -= 1
        # 最後に使える時刻は t + expires[b] - 1
        expiry = t + expires[b] - 1
        stocks[b].append((expiry, c))
        total = sum(x[1] for x in stocks[b])
        print(total)
    else:
        # 調理: 1 t d
        _, _, d = query
        d -= 1
        need = menus[d]

        # 在庫確認
        ok = True
        for i in range(M):
            if sum(x[1] for x in stocks[i]) < need[i]:
                ok = False
                break

        if not ok:
            print("NO")
        else:
            # 実際に消費（古い在庫から使う）
            for i in range(M):
                req = need[i]
                while req > 0:
                    exp, cnt = stocks[i][0]
                    if cnt <= req:
                        req -= cnt
                        stocks[i].pop(0)
                    else:
                        stocks[i][0] = (exp, cnt - req)
                        req = 0
            print("YES")