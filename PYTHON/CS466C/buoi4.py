# kiễu dữ liệu list trong python


#truy cập phân tử
"""
names=["An","Binh","cường","dũng"]
print(names[0])
print(names[2])
"""
# sữa phân tử trong list
"""
names=["An","Binh","cường","dũng"]
names[1]="Nam"
print(names)
"""

# thêm một phân tử append()
"""
ds=["An","Binh"]
ds.append("Cường")
print(ds)
"""
# thêm phân tử vào vị trí chỉ định insert()
"""
ds=[1,2,4]
ds.insert(2,3)
print(ds)
"""

# xóa phân tử remove(xóa giá trị),pop(xó theo chỉ số),del(xó theo vị trí)
# xóa hết bộ list clear()

# duyệt list bằng for
"""
ds=["An","Bình","cường"]
for i in ds :
    print(i,end=",")
"""
# duyệt vừa có index,vừa có giá trị enumerate()
"""
ds=["An","Bình","cường"]
for i,v in enumerate(ds):
    print(i,v,end=",")
"""
# kiểm tra phâb tử in và not in

# sắp xếp sort()
# #sorted() tạo kết quả đả sắp xếp=>tìm hiểu
"""
ds=[5,2,8,1,3]
ds.sort()
print(ds)
"""
# count() đếm số lần xuất hiện của một phần tử
#index() tìm index của một phần tử
#sum() tính tổng
#min(),max() tìm giá trị min,max 

# nối list 
"""
a=[1,2,3]
b=[4,5,6]
c=a+b
print(c)
# lặp list
print([1,2]*3)
"""
# list bên trong list
"""
ds=[[1,2,3],
    [4,5,6],
    [7,8,9]
    ]
print(ds[2][1])
"""

# copy list 

#                                             bài tập
"""
students = [    "  NGUYEN   VAN AN ",    "tran thi binh",    "Nguyen Van An",    "  LE    MINH  ",    "TRAN THI BINH",    "pham quoc huy",    "   "]
sumSV=0
ghiTrung=0
ghiRong=0
sv=[]

for i in students:
     
     hoten = i.split()
     ht=" ".join(hoten).title()
     
     if ht=="":
        ghiRong+=1
        
     elif ht in sv:
        
        ghiTrung+=1 
        
     else:
        sv.append(ht)
        sumSV+=1

for i in range(len(sv)):
    print(i+1,".",sv[i],end="\n")

print(f"tong so sinh vien : {sumSV}")
print(f"so sinh vien bi trung : {ghiTrung}")
print(f"so sinh vien bi rong : {ghiRong}")
"""
#                                              bài 2
"""
orders = [    "DH01|Ban phim|2|150000",    "DH02|Chuot|1|120000",    "DH03|Tai nghe|3|200000",    "DH04|USB|2|90000",    "DH05|USB|0|90000",    "DH06|Chuot|abc|120000"]
sumDT=0
donMAX=0
donKHL=0
ds_HL=[]
ds_DGMAX=[]
ds_DH300=[]

for item in orders:
  
  ma, ten, sl, dg = item.split("|")

  
  if sl.isdigit() and dg.isdigit() and int(sl) != 0 and int(dg) != 0:
    thanh_tien = int(sl) * int(dg)
    ds_HL.append([ma, ten, thanh_tien])
    sumDT += thanh_tien

    
    if thanh_tien > donMAX:
      donMAX = thanh_tien
      ds_DGMAX = [ma] 
    elif thanh_tien == donMAX:
      ds_DGMAX.append(ma)  

    
    if thanh_tien >= 300000:
      ds_DH300.append(ma)
  else:
    donKHL += 1

print("========= DANH SÁCH ĐƠN HÀNG HỢP LỆ ==========")
for i in ds_HL:
  print(f"{i[0]} - {i[1]} : {i[2]}")

print("Tong Doanh Thu :", sumDT)
print("Don dat hang tri gia lon nhat:", ", ".join(ds_DGMAX), "-", donMAX)
print("So don dat hang khong hop le :", donKHL)

print("======= ĐƠN HÀNG TỪ 300.000 TRỞ LÊN =======")
for ma_dh in ds_DH300:
  print(ma_dh)
"""



            
 
           

































     

     
     
     





