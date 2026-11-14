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

