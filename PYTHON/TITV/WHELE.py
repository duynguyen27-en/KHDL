# vòng lặp while
"""
i=1
while i<6:
    print(i)
    i+=1
"""
# câu lệnh break trong while
"""
i=1
while i<6:
    print(i)
    if i==3:
        break
    i+=1
"""
# với câu lệnh continue dừng vòng lặp hiện tại và tiếp tục vòng lặp tiếp theo

i=1
while i<6:
    i+=1
    if i==3:
        continue
    print(i)