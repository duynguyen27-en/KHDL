
"""
name ="toan cao cap 1"
diemQT = float(input("Nhap diemQT :"))
diemT = float(input("nhap diemT :"))

DTB = diemQT*0.4 + diemT*0.6

print( name)
print("diem qua trinh :", diemQT)

print("diem thi :", diemT)
print("diem trung binh :%.2f" %DTB)

if DTB>=8.5:
    print("ket qua : gioi")
elif DTB>=7.0:
    print("ket qua : kha")
elif DTB>=5:
     print("ket qua : trung binh")   
else:
    print("ket qua : yeu")       
 
"""
"""
ds_dtb=[]

for i in range(3):
    print( f"nhap thong tin hoc sinh {i+1}")
    name = str(input("nhap ten hoc sinh :"  ))
    DiemQT=float(input(f"nhap diemQT hs {i+1} :"))
    DiemT=float(input(f"nhap diemT hs {i+1} :"))
    DTB=DiemQT*0.4 +DiemT*0.6
    ds_dtb.append(DTB)

    print(f"diem trung binh hs {i+1} la :{DTB:.2f}")

    if DTB >= 8.5:
        print("ket qua : gioi")
    elif DTB >= 7.0:
        print("ket qua : kha")
    elif DTB >= 5:
        print("ket qua : trung binh")
    else:
        print("ket qua : yeu") 
    
dtb_lop=sum(ds_dtb)/len(ds_dtb)

print(f"diem trung binh cua ca lop la {dtb_lop:.2f}")
print(f"hoc sinh co dtb lon nhat la :{max(ds_dtb):.2f}")
print(f"hoc sinh co dtb nho nhat la :{min(ds_dtb):.2f}")
"""

"""path1 ="C:\new\test.txt"
path2 ="C:\\new\\test.txt"
regex =r"\d{4}-\d{2}-\d{2}"
print(path1)
print(path2)
print(regex)
"""
# tim kiem chuoi
"""
s="python"
s[0]
s[1]
s[-1]
s[-2]

print(s[0])
print(s[1])
print(s[-1])
print(s[-2])
"""
#cat chuoi 
"""
s="python"
s[0:6]
s[7:]
s[:6]
s[::2]
s[::-1]
print(s[0:6])
print(s[7:])
print(s[:6])
print(s[::2])
print(s[::-1])
"""
#chuoi khong the thay doi gia tri đây là lỗi bất biến của chuỗi 
"""
s="cat"
s[0]="b"
print(s)
"""
#chuoi co the thay doi gia tri 
"""
s="cat"
s="b"+s[1:]
print(s)
"""
# duyệt chuổi
"""
text="python"
for ch in text:
    print(ch)
"py" in text #kiểm tra xem chuỗi có trong chuỗi không   
"java" not in text  # kiểm tra xem chuỗi không có trong chuỗi
print("py" in text)
print("java" not in text)
print(len(text))
"""

# hàm đổi kiểu chữ
"""
name="Nguyen Van A"
print(name.lower()) # in ra chữ thường
print(name.upper()) # in ra chữ hoa
print(name.title()) # in ra chữ hoa cảu ký tự đầu tiên mỗi từ
print(name.capitalize()) # in ra chữ hoa cảu ký tự đầu tiên mỗi từ
print(name.strip()) # loại bỏ khoảng trắng ở đầu và cuối chuỗi
print(name.lstrip()) # loại bỏ khoảng trắng ở đầu chuỗi
print(name.rstrip()) # loại bỏ khoảng trắng ở cuối chuỗi
"""
#tách chuỗi
"""
line = "2026-08015,admin,LOGIN_FAIL"
p = line.split(",")

print(p)
r="|" .join(p)
print(r)
"""
# tim kiem chuoi 1
"""
msg = "ERROR: login failed for admin"

print(msg.startswith("ERROR"))
print(msg.endswith("admin"))
print(msg.find("login"))
print(msg.count("a"))
print(msg.replace("admin","user"))
"""
"""
user = "admin"
failed = 5
rate = 0.875

print(f"user {user} failed {failed} times")
print(f"Tỉ lệ : {rate:.2%}")
"""


