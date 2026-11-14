#câu1
"""
x = int(input("Nhap Vao So Nguyen x:"))
x+=10
print("Cong them 10 vao x :",x)
x*=2
print("Nhan Doi x:",x)
x%=3
print("Lay Phan Du x :",x)

print("Gia Tri Cuoi Cung Cua x :",x)
"""

#câu2
"""
n = int(input("Nhap Vao So Nguyen N :"))
ket_qua ="Chan" if n%2==0 else "lẻ"
print("Kêt Qua Của n : ",ket_qua)
"""
#câu3
"""
dtb = float(input("Điểm Trung Bình :"))
DRL = int(input("Điểm Rèn Luyên :"))

has_research = (input("nhap :"))

hb = dtb>=8.0 and (DRL>=8.0 or has_research )
print("Sinh Vien Nhan Hoc Bong :",hb)
"""
#câu4
"""
ds_mon = ["Toan cao cấp", "Lap trinh Python", "Co so du lieu", "Xac suat thong ke"]
mon_hoc = str(input("Nhap Mon Hoc :"))
ds_mon.append(mon_hoc) 

print("Mon Hoc sau Khi Nha :",mon_hoc not in ds_mon)
print(ds_mon[0:2])
print(ds_mon[2:])
print(ds_mon[5:])
print(ds_mon[-1:])


A=[1,2,3];B=[1,2,3]
print(A is B)
print(A is not B)
"""
#câu 5
a = int(input("Nhap so a:"))
print(a<<2)
a&=2
print(a)