


#in ra giá trị của biến
"""
print(5)
print("hello world")
print(6); print("hello")
print("xin","chào","nguyen","1234")
print("xin","chào","nguyên","123345", sep=",")
print("ten ",end=":")
print("nguyên")
print("tên={0},họ={1}".format("nguyên","nguyễn"))
"""

# nhập chuỗi ký tự
"""
a = input("Nhap vao A :")
print("a={0}".format(a))

Ho = input("Nhap Ho :"); Ten = input("Nhap Ten :")
print("Họ = {0},Tên = {1}".format(Ho,Ten))
"""
# biễu thức với biến
"""
x=5
print(x)
x,y,z=5,6,"xin chao"
print(x,y,z)
x=y=10
print(x,y,z)

full_name="Nguyen Duy Nguyen"
print(full_name)
"""
#thay đổi kiểu dữ liệu 
"""
e=2.72
pi="3.14"
text="hello world"
print("kiễu dữ liệu của biến e :",type(e),"kiểu dữ liệu của pi :",type(pi),"kiểu dữ liệu của text :",type(text))
"""
# nhập số nguyên
"""
a = int(input("nhap so a:"))
b = int(input("nhap so b:"))
print(a>b)
print(a+b)
print(a-b)
print(a*b)
print(a/b)
print(a**b)
print(a//b)
print(a%b)
"""
"""
a = int(input("nhap so a:"))
# phép OR
a|=3
print(a)
# phép dịch phải
a >>=3
print(a)
# phép dịch trái
a <<=3
print(a)

print(a:=3)
"""
# toán tử 3 ngôi
"""
a= int(input("nhap so a:"))

x="nguyen" if a==9 else "thay đổi" if a==7 else "so hoc"
print(x)
"""
# toán tử so sánh
"""
a = int(input("nhap so a :"))
b = int(input("nhap so b :"))
 
print(a==b)
print(a!=b)
print(a>b)
print(a<b)
print(a>=b)
"""
# toán tử logic
"""
a = int(input("nhap so a :"))
print(a<10 and a>5)
print(a>0 or a<-1)
print(not(a>5 and a<10))
 """
 # toán tử coi có cùng đối tượng k
"""
x=[1,2,3]
y=[1,2,3] 
z=x
print(x is y)
print(x is z)
print(x is not y)
print(x is not z)
print(x==y)
"""
#toan tu xem phân thử bên trong có xuất hiện k
"""
text = "xin chao viet nam"

print("viet" in text)
print("" in text)
print("nam" not in text)
"""
#toan tu bit
"""
print(6&3)
print(6|3)
print(6^3)
print(~6)
print(6>>3)
print(6<<3)
"""
#bài tập
a=15;b=4
print("a%b=",a%b)
print("a//b=",a//b)
print("a**b=",a**b)
a+=10
print("a+=10",a)
