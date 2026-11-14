# câu match chọn một trong nhiều khối mã đễ thực thi
day=4
match day:
    case 1:print("mot")
    case 2:print("hai")
    case 3:print("ba")
    case 4:print("bốn")
    case 5:print("năm")

# giá trị mặc định 
day=6
match day:
    case 1:print("mot")
    case 2:print("hai")
    case 3:print("ba")
    case 4:print("bốn")
    case 5:print("năm")
    case _:print("sáu")

# kết hợp các giá trị |
day=6
match day:
    case 1|2|3|4|5|6:print("mot")
    case 7|8:print("bay tam")
    