
# danh sách python
"""
#tạo danh sách
ds = ["apple","banana","cherry"]
print(ds)
#xách định độ dài danh sách
print(len(ds))
#kiểu dữ liệu của danh sách
print(type(ds))
#tạo danh sách bằng list()
ds_list = list(["apple","banana","cherry"])
print(ds_list)
"""
# truy cập các phân tử trong danh sách
"""
ds = ["apple",2,5,7,"banana",9,1]
# in mục 2 ra danh sách
print(ds[1])
# in mục cuối
print(ds[-1])
print(ds[-2])
# trả về đầu cuối khi mình cần tìm
print(ds[2:5])
# in ra danh sách từ đầu đến mục 4
print(ds[:4])
# int từ mục 2 đến hết
print(ds[2:])
# in ra danh sách từ mục -4 đến mục -1
print(ds[-4:-1])
print(ds[-6:])
# kiểm tra xem tồn tại không
if "apple" in ds :
    print("apple có trong danh sách")
"""
# thay đổi các giá trị trong danh sách
"""
ds = ["apple","cherry",4,5,1,9,3.14]
# thay đổi giá trị số 2
ds[1]="banana"
print(ds)
# thay đổi giá trị từ 1 đến 4
ds[1:4]=["kiri","lemon",99]
print(ds)
# thay thế giá trị thứ 3 bằng 2 giá trị mới =>> chèn vào có thể dịch chuyển
ds[2:3]=["apple","mango"]
print(ds)
print(len(ds))
# thêm vào giá trị 99 bằng lemon và xóa giá trị 1
ds[4:6]=["lemon"]
print(ds)
print(len(ds))
# cách xóa một phân tử trong mảng
ds[4:5]=[]
print(ds)
# chèn một phân tử vào vị trí chỉ định
ds.insert(0,"kiri")
print(ds)
"""
# thêm mục vào danh sách
"""
ds = ["apple","banana",1,5,3,9]
# thêm một giá trị vào cuối danh sách
ds.append("orange")
print(ds)
# chen vào vị trí chỉ định
ds.insert(2,"kiwi")
print(ds)
# thêm các phân từ từ danh sách này sang danh sách khác
ds_2 = [9,8,4]
ds_2.extend(ds)
print(ds)
print(ds_2)
"""
# xóa các giá trị trong danh sách
"""
ds = ["apple","banana",1,5,3,9]
# xóa giá trị chỉ định
ds.remove("banana")
print(ds)
# nếu trong ds có nhiều giá trị giống nau thì nó chỉ xóa cái đầu tiên
ds.append("banana")
ds.remove("banana")
print(ds)
# xóa chỉ mục đích
ds.pop(1)
print(ds)
del ds[1]
print(ds)
# xóa toàn bộ danh sách
ds.clear()
print(ds)
"""
# danh sách vòng lặp
 
"""
ds = ["apple","banana",1,5,3,9]
# in từng danh sách riêng lẻ
for i in ds :
    print(i,end=" ")
print("\n")    
# In tất cả các mục bằng cách tham chiếu đến số chỉ mục của chúng
for i in range(len(ds)) :
    print(ds[i],end=" ")
print("\n")
# In bằng vòng lặp while
x=0
while x<len(ds) :
    print(ds[x],end=" ")
    x+=1
"""
# đọc hiểu danh sách 
"""
ds = ["apple","banana","kiwi","orange"]
ds_2=[]
# tạo danh sách dựa trên danh sách đã có
for i in ds:
    if "a" in i:
        ds_2.append(i)
print(ds_2)
# làm với một dòng mã 
ds_3=[i for i in ds if "a" in i ]
print(ds_3)
ds_4=[i for i in ds if "apple" and "a" not in i]
print(ds_4)
# làm vói 1 dòng mã mà k có if
ds_5=[i for i in ds]
print(ds_5)
# có thể lặp lại
ds_ds=[1,2,5,1,7]
ds_6=[i for i in range(5) if i>2 and i<=5 ]
print(ds_6)
# chuyển các chủ thành in hoa
ds_7=[i.upper() for i in ds]
print(ds_7)
# đặt tất cả các giá trị bằng a
ds_8=['a' for i in ds]
print(ds_8)
# nếu mình k thích giá trị này thì trả về giái trị khác
ds_9=[i if i!="apple" else "tao" for i in ds ] 
print(ds_9)
"""
# sắp xếp danh sách
"""
ds = ["orange", "mango", "kiwi", "pineapple", "banana"]
ds_1=[100,50,62,82,23]
ds_2=["Orange", "mango", "Kiwi", "pineapple", "Banana"]
# sắp xếp theo chữ cái
ds.sort()
print(ds)
#sắp xếp theo số
ds_1.sort()
print(ds_1)
#sắp xếp giảm dần
ds.sort(reverse = True)
print(ds)
ds_1.sort(reverse = True)
print(ds_1)
# tùy chỉnh chức năng sắp xếp
def ham(n) :
    return abs(n-50)

ds_1.sort(key=ham)
print(ds_1)
# sắp xếp không phân biệt chữ hoa và chữ thường
ds_2.sort(key=str.lower)
print(ds_2)
# đảo ngược thứ tự trong danh sách
ds.reverse()
print(ds)
"""

# sao chép danh sách
"""
ds = ["orange", "mango", "kiwi", "pineapple", "banana"]

# sử dụng phương thức copy()
ds_1=ds.copy()
print(ds_1)
# sử dung phương thức list(n)
ds_2=list(ds)
print(ds_2)
# sử dụng toán tử cắt lát
ds_3=ds[:]
print(ds_3)
"""
# tham gia danh sách
"""
ds=["apple","banana","kiwi"]
ds_1=[1,2,3]
# kết hợp 2 danh sách
KH=ds+ds_1
print(KH)
# kết hợp danh sách bằng vòng lặp for
for i in ds:
    ds_1.append(i)
print(ds)
#thêm bằng hàm extend()
ds.extend(ds_1)
print(ds)
print(ds_1)
"""
                                                          #  BÀI TẬP
#bài tập vd
"""
colors=["do","xanh la","xanh duong"]
print(colors[0])
colors[1:2]=["vang"]
print(colors)
colors.append("mau tim")
print(colors)
colors.remove("do")
print(colors)
colors.pop(1)
print(colors)

for i in colors :
    print(i,end=" ")
"""

# bài tập 1
"""
TT=["áo sơ mi", 150, "quần tây", 300, "giày", 500, "nón"]
print(TT[2],TT[-1])
print(TT[1:5])
TT[1:2]=["áo thun"]
print(TT)
TT[3:5]=["túi xách",600]
print(TT)
TT.insert(0,"thắt lưng")
print(TT)
"""
# bài tập 2
"""
ds=[8,5,9,6,7]
ds_1=[3,2]
ds.append(10)
print(ds)
ds.insert(2,4)
print(ds)
ds.extend(ds_1)
print(ds)
ds.remove(5)
print(ds)
ds.pop(1)
print(ds)
"""
# bài 3
"""
viec_nha=["quét nhà","nấu cơm","giặt đồ","lau kính"]
for i in viec_nha :
    print(i,end=",")

print("\n")
for x in range(len(viec_nha)) :
    print(x,viec_nha[x],end=",")

print("\n")
k=len(viec_nha)-1
while k>=0 :
    print(viec_nha[k],end=",")
    k-=1
"""
# bài 4
"""
tu_vung=["apple","banana","kiwi","orange","grape","pear"]

ds_moi_1=[x for x in tu_vung if "e" in x]
print(ds_moi_1)
ds_moi_2=[x.upper() for x in tu_vung ]
print(ds_moi_2)
ds_moi_3=[x if x!="apple" else "tao" for x in tu_vung]
print(ds_moi_3)
"""
# bài 5
"""
diem_lop = [45, 12, 89, 33, 76, 50]
ten_hs = ["hoa", "An", "binh", "Chi", "dung"]

diem_lop.sort()
print("điểm số sau khi sắp xếp tăng :",diem_lop)
diem_lop.sort(reverse=True)
print("điểm số sau khi giảm dần :",diem_lop)

def tinh_khoang_cach(n) :
    return abs(n-50)

diem_lop.sort(key=tinh_khoang_cach)
print(diem_lop)
ten_hs.sort(key=str.lower)
print(ten_hs)
"""
# bài 6
"""
bang_diem = [
    ["An", 8, 9],
    ["Binh", 6, 7],
    ["Chi", 9, 8],
    ["Dung", 5, 6]
]
ds_1=[x[0] for x in bang_diem if x[1]>=7 ]
print(ds_1)
ds_2=[]
for x in bang_diem:
    k=(x[1]+x[2])/2
    ds_2.append([x[0],k])
print(ds_2)
"""
# bài 7
"""
hoc_sinh = [
    ("An", 8, 9),
    ("Binh", 8, 7),
    ("Chi", 9, 8),
    ("Dung", 8, 10)
]

def xep_hang(x):
    return x[1]

hoc_sinh.sort(key=xep_hang)
hoc_sinh.reverse()
print(hoc_sinh)

def xap_hang_1(x):
    

    return (-x[1],-x[2])
    
hoc_sinh.sort(key=xap_hang_1)

print(hoc_sinh)
"""
# bài 8
"""
ma_tran = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
ma_tran_1=[i for x in ma_tran for i in x]
print(ma_tran_1)
"""
# bài 9 # lọc trùng mã 
du_lieu = ["apple", "banana", "apple", "kiwi", "banana", "orange", "kiwi"]
# giữ nguyên vị trí dict.fromkeys()
du_lieu_1=[]

for i in du_lieu :

    if i not in du_lieu_1:
        du_lieu_1.append(i)
    
print(du_lieu_1)
# cách 2 dùng dict.fromkeys()
du_lieu_2=list(dict.fromkeys(du_lieu))
print(du_lieu_2)
