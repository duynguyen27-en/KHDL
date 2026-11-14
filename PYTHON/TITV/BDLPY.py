#  bọ dữ liệu
"""

# bộ dữ liệu
ds=("apple","banana","chery")
print(ds)
# đếm bọ dữ liệu
print(len(ds))
# tuple chỉ gồm một mọc và teem dấu ,
ds_1=("apple",)
print(type(ds_1))
# tạo hàm tuple bằng tuple
ds_2=tuple(("apple","banana"))
print(ds_2)
"""
# truy cập bộ dữ liệu
"""
ds=("apple","banana",1,3,6,True)
print(ds[0])
print(ds[-1])
print(ds[1:4])
"""

# cập nhật bộ dữ liệu
"""

ds=("apple","banana",1,3,6,True)

# thêm mục(chuyển sang list)
ds_1=list(ds)
ds_1.append("kiwi")
ds=tuple(ds_1)
print(ds)
#thêm bộ dữ liệu vào một bộ dữ liệu
y=("cacao",)
ds+=y
print(ds)
#xóa giá trị trong tuple bằng cách chuyể sang list
ds_2=list(ds)
ds_2.remove("apple")
ds=tuple(ds_2)
print(ds)
# xóa hoàn toàn bộ dữ liệu
del ds
print(ds)# sẽ bị lỗi
"""

# giải nén bộ dữ liệu
"""
ds=("apple","banana",1,3,6,True)

(a,b,c,d,e,f)=ds
print(a)
print(b)
print(c)
print(d)
print(e)
print(f)
# nếu số lượng biến ít hơn giá trị bằng Asterisk*
(j,k,*l)=ds
print(j)
print(k)
print(l)
"""
#  bộ dữ liệu vòng lặp
"""
ds=("apple","banana",1,3,6,True)
#vòng lặp for
for i in ds :
    print(i,end=",")
print("\n")
# vòng lặp qua chỉ số index
for i in range(len(ds)):
    print(ds[i],end=",")

# dùng vòng lặp while
print("\n")
s=0
while s<len(ds):
    print(ds[s],end=",")
    s+=1
"""
# phương thức sử dụng trong tuple +count(),+index()

#                         bài tập 
# bài 1
"""
don_hang=("DH01","bàn phím cơ",150000,2)
(ma_dh,ten_sp,don_gia,so_luong)=don_hang
tong_tien = don_gia*so_luong
ds=list(don_hang)
ds.append(tong_tien)
don_hang=ds

print(don_hang[0],"-",don_hang[1],"có tổng thanh toán là :",don_hang[4],end="\n")
"""
# bài 2
"""
diem_thi = (8.5, 7.0, 9.0, 8.5, 6.5, 8.5, 10.0)
print("có bao nhiêu điểm 8.5 xuất hiện :",diem_thi.count(8.5),end="\n")
print("vị trí cuất hiện đầu tiên của 9.0 la :",diem_thi.index(9.0))
diem_thi[0]=9.5#trong tuple không thể gán được mà phải chuyể qua list
print(diem_thi)
"""

# bài 3
danh_sach_sv = [
    ("SV01", "Nguyễn Văn An", 8.2),
    ("SV02", "Trần Thị Bình", 7.5),
    ("SV03", "Lê Hoài Nam", 9.1),
    ("SV04", "Phạm Minh Tâm", 6.8),
]
ds_t8=[]
ds_Max=[]
TB=-1

for i in danh_sach_sv:
    (ma,ten,dtb)=i  
    if dtb>=8.0:
        ds_t8.append((ma,ten,dtb))
    if dtb>TB :
        TB=dtb
        ds_Max=[i]
    elif dtb==TB:
        ds_Max.append(i)
            
print("========== danh sách sinh viên >= 8.0 =========")
print(ds_t8,end="\n")
print("Sinh Viên có Điểm cao nhất :")
print(ds_Max)