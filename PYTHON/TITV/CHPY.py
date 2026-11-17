# tạo hàm được định nghĩa def
"""
def ham():
    print("tao ham")

ham()
# Tên hàm phải bắt đầu bằng một chữ cái hoặc dấu gạch dưới.
# Tên hàm chỉ được chứa chữ cái, số và dấu gạch dưới.
# Tên hàm phân biệt chữ hoa chữ thường ( myFunctionvà myfunctionkhác nhau)

# giá trị trả về
def ham_1():
    return "chao ham 1"
x=ham_1()
print(x)
print(ham_1())
# pass viết trong hàm khi để hàm để trống 
def ham_2():
    pass
"""
# các đối số trong python
"""
# 1 một hàm có một hàm tham số
def ham(fname):
    print(fname+"rene")
ham("email")
ham("chocho")
# 2 tham số so với đối số
def ham_1(name):
    print("name",name)
ham_1("nguyen")
# 3 số lượng đối  số
def ham_2(fname,lname):
    print(fname,"",lname)
ham_2("email","nguyen")# nếu lỗi khi hàm này có 2 cái mà mình chỉ nhập 1 cái
# 4 giá trị tham số mặc định
def ham_3(name="norway"):
    print("tôi ở quốc gia :",name)
ham_3()
ham_3("Nga")
# 5 truyền các kiểu dữ liêij khác nhau
def ham_4(ds):
    for i in ds:
        print(i)
ds_1=["apple", "banana", "cherry"]
ham_4(ds_1)
#6 giá trị trả về
def ham_5(x,y):
    return x+y
print(ham_5(8,5))
#7 một hàm trả về danh sách
def ham_6():
    return ["apple", "banana", "cherry"]
ds_2=ham_6()
print(ds_2[0])
print(ds_2[1])
# 8 kết hợp vị trí tìm kiếm và từ khóa
def my_function(a, b, /, *, c, d):
  return a + b + c + d

result = my_function(5, 10, c = 15, d = 20)
print(result)
"""
# python *args và **kwargs
"""
# sử dụng *(biến của mình) để chấp nhận đối số nào
def ham(*ds):
    print("type :",type(ds))
    print("cần tìm 0 :",ds[0])
    print("cần tìm 1 :",ds[1])
    print("cần tìm cả danh sách :",ds)
ham("mail","gogg","nanu")

# sử dụng * vói đối số thông thường
def ham_1(ds,*ds_1):
    for i in ds_1:
        print(ds,i)
ham_1("Hello", "Emil", "Tobias", "Linus")
# dùng * để tính tổng cho nhanh
def ham_2(*ds_2):
    tong=0
    for i in ds_2:
        tong+=i
    return tong
print(ham_2(1,2,3))
print(ham_2(40,50,60))
# dùng * để tìm giá trị lớn nhất
def ham_3(*ds_3):
    if len(ds_3)==0:
     return None
    max=ds_3[0]
    for i in ds_3:
        if i>max:
            max=i
    return max   
print(ham_3(3, 7, 2, 9, 1))

# đối khóa tùy ý **
def ham_4(**ds_4):
    print("cần tìm :",ds_4["name"])
ham_4(name="nguyen",email="nguyenduy@.com")
# ** cho phép chấp nhận bất kì số lượng nào
def my_function(**myvar):
  print("Type:", type(myvar))
  print("Name:", myvar["name"])
  print("Age:", myvar["age"])
  print("All data:", myvar)

my_function(name = "Tobias", age = 30, city = "Bergen")
# kết hợp * vad **
def my_function(title, *args, **kwargs):
  print("Title:", title)
  print("Positional arguments:", args)
  print("Keyword arguments:", kwargs)

my_function("User Info", "Emil", "Tobias", age = 25, city = "Oslo")
# sử dụng * để tách một danh sách thành các đối số
def ham_5(a,b,c):
    return a+b+c
numbers = [1, 2, 3]
kq=ham_5(*numbers)
print(kq)
"""
# phamj vi python
"""
def ham():
    x=300
    print(x)
ham()
# hàm bêb trong hàm biến cục bộ có thể truy vấn vào hàm khác
def ham_1():
    x=400
    def ham_2():
        print(x)
    ham_2()
ham_1()
# biến được tạo bên ngoài hàm là biến toàn cục có thể sử dụng với bất kì ai
x=500
def ham_3():
    print(x)
ham_3()
print(x)
# từ khóa toàn cầu global
def ham_4():
    global x
    x=200
ham_4
print(x)
# từ khóa không cục bộ nonlocal
def myfunc1():
  x = "Jane"
  def myfunc2():
    nonlocal x
    x = "hello"
  myfunc2()
  return x

print(myfunc1())
# Python tuân theo quy tắc LEGB khi tìm kiếm tên biến và tìm kiếm chúng theo thứ tự này:

# Cục bộ - Bên trong hàm hiện tại
# Bao bọc - Các chức năng bao bọc bên trong (từ trong ra ngoài)
# Toàn cầu - Ở cấp độ cao nhất của mô-đun
# Tích hợp sẵn - Trong không gian tên tích hợp sẵn của Python
"""
# trình trang tri của python
"""
def ham(ds):
    def ham_1():
        return ds().upper()
    return ham_1
@ham
def ham_2():
    return "Hello Sally"
print(ham_2())
# các đối số trong hàm được trang trí
def ham_3(ds):
    def ham_4(x):
        return ds(x).upper()
    return ham_4

@ham_3
def ham_5(name):
    return "Hello "+name
print(ham_5("nguyên"))
# sử dụng * và ** trong trang trí
def ham_6(ds):
    def ham_7(*x,**y):
        return ds(*x,**y).upper()
    return ham_7
@ham_6
def ham_8(name):
    return "Hello "+name
print(ham_8("Nguyên"))
"""
# python lambda 
"""

# biểu thức được thực 
x=lambda a:a+10
print(x(5))
# lambda có thể nhân bất kì đối số nào
x= lambda a,b:a*b
print(x(5,5))
# tóm tắt a,b,c về kết quả
x=lambda a,b,c:a+b+c
print(x(2,3,4))
# hàm có lambda
def ham(n):
    return lambda x:x*n
ds=ham(2)
print(ds(3))
#Hàm Lambda thường được sử dụng với các hàm tích hợp sẵn như map(), filter(), và sorted()
ds_1=[1,2,3,4,5]
ds_2=list(map(lambda x:x*2,ds_1))
print(ds_2)
# filter() tạo ra ds mục mà hàm kia trả về true 
ds_3=list(filter(lambda x:x%2!=0,ds_1))
print(ds_3)
# hàm sorted() sắp xếp tùy ý
ds_4=[("email",25),("nguyen",22),("n",28)]
ds_5=sorted(ds_4,key=lambda x:x[1])
print(ds_5)
# sắp xếp theo chuổi độ dài
ds_6=["apple", "pie", "banana", "cherry"]
ds_7=sorted(ds_6,key=lambda x :len(x))
print(ds_7)
"""
# đề quy
"""
# hàm đề quy đơn giản đếm ngược từ 5
def ham_dq(n):
    if n<=0:
        return "het"
    print(n)
    return ham_dq(n-1)
ham_dq(5)
# Trường hợp cơ sở - Điều kiện ngăn chặn sự đệ quy.
# Trường hợp đệ quy - Hàm tự gọi chính nó với một đối số đã được sửa đổi.
# xác định trường hợp cơ sở và đề quy
def ham_dq_1(n):
    if n==0 or n==1:
        return 1
    return n*ham_dq_1(n-1)
print(ham_dq_1(5))
def ham_dq_2(n):
    if n<=1:
        return n
    return ham_dq_2(n-1)+ham_dq_2(n-2)
print(ham_dq_2(7))
# đệ quy với danh sách
def ham_dq_3(ds):
    if len(ds)==0:
        return 0
    return ds[0]+ham_dq_3(ds[1:])

ds_1=[1,2,3,4,5]
print(ham_dq_3(ds_1))
# tìm giá trị lớn nhất trong danh sách
def ham_dq_4(ds):
    if len(ds)==1:
        return ds[0]
    ds_max=ham_dq_4(ds[1:])
    return ds[0] if ds[0]>ds_max else ds_max
ds_2=[3, 7, 2, 9, 1]
print(ham_dq_4(ds_2))
"""
# trình tạo python
"""
# một hàm tạo đơn giản
def ds():
    yield 1
    yield 2
    yield 3
for i in ds():
    print(i,end=",")
# máy tạo ra các con số
def ds_1(n):
    count=1
    while count<=n:
        yield count
        count+=1

for i in ds_1(5):
    print(i,end=",")
# máy phát điện giúp tiết kiệm bộ nhớ
def large_sequence(n):
  for i in range(n):
    yield i

gen = large_sequence(1000000)
print(next(gen))
print(next(gen))
print(gen)
#So sánh giữa List comprehension và biểu thức generator:
# List comprehension - creates a list
list_comp = [x * x for x in range(5)]
print(list_comp)

# Generator expression - creates a generator
gen_exp = (x * x for x in range(5))
print(gen_exp)
print(list(gen_exp))
# Tạo 100 số Fibonacci:

def fibonacci():
  a, b = 0, 1
  while True:
    yield a
    a, b = b, a + b

# Get first 100 Fibonacci numbers
gen = fibonacci()
for _ in range(100):
  print(next(gen))
#Phương pháp này send()cho phép bạn gửi một giá trị đến trình tạo:
#Phương pháp này close()dừng máy phát điện:
"""
#                 bải tập
# bài 1
"""
dem_ham=0

def thong_ke_goi_ham(ds):
    def ham_1(*ds_1,**ds_2):
        global dem_ham
        dem_ham+=1
        if ds_2["kieu"]=="chan":
            ds_da_loc=list(filter(lambda x:x%2==0,ds_1))
        else:
            ds_da_loc=list(filter(lambda x:x%2!=0,ds_1))
        print(
        f"[LOG] Lần gọi thứ {dem_ham}  | Kết quả sau khi"
        f" lọc: {ds_da_loc}"
    )
        return ds(ds_da_loc)
    return ham_1
   
@thong_ke_goi_ham
def tinh_tong(danh_sach):
  return sum(danh_sach)


# --- THỬ NGHIỆM CHẠY THỬ ---
# Gọi lần 1: Lọc số chẵn
print("Tổng =", tinh_tong(1, 2, 3, 4, 5, 6, kieu="chan"))

print("-" * 30)

# Gọi lần 2: Lọc số lẻ
print("Tổng =", tinh_tong(1, 2, 3, 4, 5, 6, kieu="le"))
"""
# bài 2
"""
so_lan_thanh_toan=0
def kiem_tra_gia(ds):
    def ham_gia(*ds_1,**ds_2):
        global so_lan_thanh_toan
        so_lan_thanh_toan+=1
        muc_gia_min=ds_2.get("muc_gia_toi_thieu",50)
        ds_da_loc=list(filter(lambda x:x>=muc_gia_min,ds_1))
        print(f"lần thanh toán thứ :{so_lan_thanh_toan} | điều kiện lọc :{muc_gia_min} | danh sách sau khi đọc : {ds_da_loc}")
        return ds(ds_da_loc)
    return ham_gia
@kiem_tra_gia
def tinh_tong_tien(tinh_tong):
    return sum(tinh_tong)
       
print(tinh_tong_tien(30, 80, 150, 200, 40, muc_gia_toi_thieu=100))
print(tinh_tong_tien(20, 60, 90, 110, 40))
"""
# bài 3
"""
def lam_phang_ds(ds):
    for i in ds:
        if isinstance(i,list):
            yield from lam_phang_ds(i)
        else:
            yield i

def tao_ham_nhan(n):
    return lambda x:x*n

du_lieu_goc = [1, [2, [3, 4], 5], 6, [7, 8]]

get=lam_phang_ds(du_lieu_goc)
nhan_doi=tao_ham_nhan(2)
print("kết quả sau khi nhân đôi :")
for so in get:
    kq=nhan_doi(so)
    print(kq,end=" ")


du_lieu_goc = [1, [2, [3, 4], 5], 6, [7, 8]]
"""
# bài 4
"""

def giai_ma_kho_bau(ds):
    for i in ds:
        if isinstance(i,list) :
            yield from giai_ma_kho_bau(i)
        else:
            yield i

def tao_bo_cong_diem(diem_thuong_them):
    return lambda x:x+diem_thuong_them

diem_thuong=tao_bo_cong_diem(10)
kho_bau_goc = [5, [10, [15, 20], 25], 30, [35, 40]]
print("Giải mã kho bau long nhau :")
for so in giai_ma_kho_bau(kho_bau_goc):
    kq=diem_thuong(so)
    print(kq,end=" ")
"""
# bài 5 ==> bài tôi chưa làm được
"""
def sinh_nhiet_do_vo_ham(base,step):
    nd=base
    while True:
        yield nd
        step+=nd

def gioi_ham_va_loc(max_mau,nguong_canh_bao):
    def ds_1(ds):
        def ds_2(*k,**d):
            gen=ds(*k,**d)
            dem=0
            ket_qua_loc=[]

            for nhiet_do in gen:
                if dem>=max_mau:
                    break
                dem+=1
                if nhiet_do>=nguong_canh_bao:
                    ket_qua_loc.append(nhiet_do)
                    print(f"[CẢNH BÁO] Mẫu thứ {dem}: Nhiệt độ {nhiet_do}°C vượt ngưỡng!")
                else:
                    print(f"[BÌNH THƯỜNG] Mẫu thứ {dem}: Nhiệt độ {nhiet_do}°C")
            return ket_qua_loc
        return ds_2
    return ds_1

@gioi_ham_va_loc(max_mau=8,nguong_canh_bao=35)
def lay_du_lieu_goc(base,step):
    return sinh_nhiet_do_vo_ham(base,step)


danh_sach_canh_bao = lay_du_lieu_goc(20, 5)
print("\nDanh sách các mức nhiệt độ cần cảnh báo:", danh_sach_canh_bao)
"""


