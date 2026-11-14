# khởi tạo dict
"""
ds={"name":"An","socore":8.5}
info= dict(nam="binh",age=20)
print(ds,end="\n")
print(info,end="\n")
"""
# key phải dùng kiểu dữ liệu hashable
# thường dùng :str,int,float,tuple
# không thể dùng list hoặc dict làm key

# truy cập phân tử bằng []
"""
ds={"name":"an","score":"8.5"}
print(ds["name"],end="\n")
print(ds["score"],end="\n")
print(ds.get("name"))
print(ds.get("email"))
print(ds.get("email"),"chưa có")
"""
# thêm phần tử
"""
ds={"name":"an"}
ds["score"]=8.5
ds["email"]="an@example.com"
print(ds)
"""
# cập nhật 
"""
ds={"name":"an","score":8.5}
ds["score"]=9.0
print(ds)
"""
# update()
"""
ds={"name":"an","score":8.5}
ds.update({"score":9.0,"age":20})
print(ds)
"""
# xóa
"""
ds={"name":"an","score":8.5}
del ds["score"]
print(ds)
"""
# pop()
"""
ds={"name":"an","score":8.5}
score=ds.pop("score")
print(score)
print(ds)
"""
# keys()
"""
ds={"name":"an","age":20,"score":8.5}
print(ds.keys())
print(ds.values())
print(ds.items())
"""

# duyệt dict
"""
ds={"name":"an","age":20,"score":8.5}
# cách 1
for key in ds :
    print(key,ds[key])
# cách 2
for key,value in ds.items():
    print(key,":",value)
"""

# dict lồng nhau
"""
ds={
    "name":"an",
    "contact":{
        "email":"an@example.com",
        "phone":"0901234567"
    }
}
print(ds["contact"]["email"])
"""

# list chưa dict
"""
ds=[{"id":"SV01","name":"An","score":8.5},
     {"id":"SV02","name":"Binh","score":7.8},
     {"id":"SV03","name":"chi","score":9.1}]
for i in ds :
  print(i["name"],i["score"])

"""

#                                     bài tập
# bài 1
"""
bang_gia = {    "SP01": 12000,    "SP02": 8000,    "SP03": 15000}
gio_hang = [    "SP01", "SP02", "SP01",    "SP03", "SP02", "SP01"]

gio_hang_1={}
thanh_tien={}
tong=0
max=-1
ds_max={}
# thống kê sôd lượng sản phẩm
for i in gio_hang :
   if i in gio_hang_1:
    gio_hang_1[i]+=1
   else:
    gio_hang_1[i]=1
print(gio_hang_1)

# tính thành tiền của tuuwngf loại sp
for i in bang_gia :
    if i in gio_hang_1:
        thanh_tien[i]= bang_gia[i]*gio_hang_1[i]
print(thanh_tien)

# tổng tiền hóa đơn
for i in thanh_tien:
    tong+=thanh_tien[i]
print("Tổng thành tiền hóa đơn :",tong)

# giàm 10% cho ai có tổng > 60000
if tong>60000:
    tong-=tong*0.1
    print("Tổng sau khi giảm 10% :",tong)

# xác định sản phẩm mua nhiều nhất 
for i in gio_hang_1:
    if gio_hang_1[i]>max:
        max=gio_hang_1[i]
        ds_max={i:gio_hang_1[i]}
         
    elif gio_hang_1[i]==max:
        ds_max[i]=gio_hang_1[i]


print(ds_max)       
"""
#  bài 2

dap_an = ["A", "C", "B", "D", "A"]
bai_lam = {    "SV01": ["A", "C", "B", "D", "A"],    "SV02": ["A", "B", "B", "C", "A"],    "SV03": ["D", "C", "A", "D", "B"],    "SV04": ["A", "C", "B", "A", "A"]}
ds_kq={}
DAD=0
DAS=0
k=0
sum=0
ds_DASMAX={}


for i in bai_lam:
    DAD=0
    DAS=0
    k=0
    for row in bai_lam[i]:
        
        if row == dap_an[k]:
         
           DAD+=1
           k+=1
        else :
           ds_DASMAX[k+1]=ds_DASMAX.get(k+1,0)+1
           DAS+=1
           k+=1
    ds_kq[i]=DAD*2
    print(f"Sinh Vien {i}-> số câu đúng {DAD} | số câu sai {DAS} | tổng điểm = {ds_kq[i]} ")
    sum+=ds_kq[i]
    k=0
        
# sinh viên có điểm cao nhất
max=-1
ds_max={}
dtb=0
ds_DH={}
for i in ds_kq:
    dtb+=ds_kq[i]
    if ds_kq[i]>max:
        ds_max={i:ds_kq[i]}
        max=ds_kq[i]
    elif ds_kq[i]==max:
        ds_max.update({i:ds_kq[i]})
        max=ds_kq[i]
    if ds_kq[i]==10:
        ds_DH.update({i:ds_kq[i]})
print("Sinh viên có điểm cao nhất la :",ds_max)
# tính điểm trung bình của cả lớp
print(f"Điểm trung bimhf cả lớp là : {dtb/len(ds_kq):.2f}")
# thống kê số sinh viên trả lười đúng từng câu hỏi
print("số học sinh trả lời đúng hết kết quả :",ds_DH)
# xác định câu hỏi có nhiều người sai nhiều nhất
cau_max=-1
ds_cau_max={}
for i in ds_DASMAX:
    if ds_DASMAX[i]>cau_max:
        cau_max=ds_DASMAX[i]
        ds_cau_max={i:ds_DASMAX[i]}
    elif ds_DASMAX[i]==cau_max:
         cau_max=ds_DASMAX[i]
         ds_cau_max.update({i:ds_DASMAX[i]})
print("câu hỏi có số người sai nhiều nhất :",ds_cau_max)
# sắp xếp sinh viên theo điểm giảm dần
ds_sap_xep=dict(sorted(ds_kq.items(),key=lambda x:x[1],reverse=True))
print(ds_sap_xep)


#                                   baiTL

