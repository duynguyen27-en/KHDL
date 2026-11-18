#
"""
f=open("ghichu.txt","r",encoding="utf-8")
noi_dung=f.read()
f.close()
"""
# 4 chế dộ cần nhớ 
# r :đọc tệp
# W :ghi mới/ ghi đề
# a : ghi thêm cuối tệp
# x : tạo tệp mới

# dùng with không cần f.close()
"""
with open("ghichu.txt","r",encoding="utf-8") as f:
     noi_dung=f.read()

print(noi_dung)
"""
# dung read() là để đọc hêt , kiểu dữ liệu là str

# đọc từng dòng bằng readline() 
"""
with open("ghichu.txt","r",encoding="utf-8") as f:
     dong_1=f.readline()
     dong_2=f.readline()

print(dong_1,end="")
print(dong_2,end="")
"""

# đọc bằng for
"""
with open("ghichu.txt","r",encoding="utf-8") as f:

    for dong in f:
        print(dong.rstrip("\n"))
"""

# đọc bằng readlines(): mỗi phân tử tương ứng môth dòng văn bản
"""
with open("ghichu.txt","r",encoding="utf-8") as f:

    cac_dong=f.readlines()
    
print(cac_dong)
print(len(cac_dong))
"""

# ghi tệp bằng lệnh write() => ghi là ghi đè lên luôn
"""
with open("ghichu.txt","w",encoding="utf-8") as f:

   f.write("Xin chò python\n")
   f.write("Đây là dòng thứ 2\n")
"""


# writelines() ghi một lúc nhiều dòng => và cái này truyền vào bằng list
"""
cac_dong=["An\n","Binh\n","Chi\n"]
with open("ghichu.txt","w",encoding="utf-8") as f:
    f.writelines(cac_dong)
    noi_dung=f.read()
"""
#         bài tập
# bài 1

with open("nhatky_dangnhap.txt","r",encoding="utf-8") as f:
 ds=f.readlines()
 print("số sự kiện đăng nhập la :",len(ds))
 TC=0
 TB=0
 for i in ds:
    if "SUCCESS" in i :
        TC+=1
    else :
        TB+=1
 print("Đăng nhập thành công la :",TC)
 print("đăng nhập thất bại la :",TB)
 list_ip=[]
 for i in ds:
    if len(i)>=2:
     if i.split("|")[1] not in list_ip:
        list_ip.append(i.split("|")[1])
 print(list_ip)
# cho phép người dùng nhập tên tài khoản và hiện thị lịch sư đăng nhập
 
 nhap=input("Nhập Địa Chỉ ten để kiếm :").strip()
 tim_thay=False
 for i in ds:
    pars=i.strip().split("|")
    if len(pars)>=4 and pars[2].strip()==nhap:
        print(i.strip())
        tim_thay=True
 if not tim_thay:
    print("Không tìm thấy lịch sử tài khoản :",nhap)

# thống kê số lần đăng nhập thành công và thất bại
 ds_TC={}
 ds_TB={}

 for i in ds:
    pars=i.strip().split("|")
    if len(pars)>=4 :
        if pars[3]=="SUCCESS":
            ds_TC[pars[1]]=ds_TC.get(pars[1],0)+1
        else:
            ds_TB[pars[1]]=ds_TB.get(pars[1],0)+1
 
 print("danh sách đăng nhập thành công :")
 print(ds_TC)
 print("Danh sách đăng nhập thết bại :")
 print(ds_TB)

 # xác định địa chỉ IP có số lần đăng nhập thất bại nhiều nhất
 max_TB=-1
 ds_max_TB={}
 for i in ds_TB:
    if ds_TB[i]>max_TB:
        max_TB=ds_TB[i]
        ds_max_TB={i:ds_TB[i]}
    elif ds_TB[i]==max_TB:
        max_TB=ds_TB[i]
        ds_max_TB.update({i:ds_TB[i]})
 print("Địa chỉ IP có số lần đăng lập thất bại nhiều nhất :",ds_max_TB)

 # các tài khỏa có đăng nhập thất bại ít nhất 1 lần
 ds_max_TB_hon1=[]
 for i in ds:
    pars=i.strip().split("|")
    if len(pars)>=4 and pars[3]=="SUCCESS":
        tk=pars[2].strip()
        if tk not in ds_max_TB_hon1:
            ds_max_TB_hon1.append(tk)
     
 print("Danh sách đăng nhập thất bại >= 1 :")
 print(ds_max_TB_hon1)

 # xác định thống kê tài khoản khác nhau IP thử đăng nhập 
 ip_pars={}

 for i in ds:
    pars=i.strip().split("|")
    if len(pars)>=4:
        ip=pars[1].strip()
        tk=pars[2].strip()
        ip_pars.setdefault(ip,set()).add(tk)
 
 print(ip_pars)
 thong_ke_ip_pars={ip:len(users) for ip,users in ip_pars.items()}
 print("Số tài khoản khác nhau mỗi IP đã thử:", thong_ke_ip_pars)

 # kết quả thống kê vào file thongke.txt
with open("thongke.txt","w",encoding="utf-8") as f_out:
    f_out.write("===== Báo Cáo Thống Kê Đăng Nhập =====\n")
    f_out.write(f"Tổng số sự kiên đăng nhập :{len(ds)}\n")
    f_out.write(f"Tỏng số lần đăng nhập thành công :{TC}\n")
    f_out.write(f"Tỏng số lần đăng nhập thất bại :{TB}\n")
    
    f_out.write(f"Danh sách IP xuất hiện: {', '.join(list_ip)}\n\n")
    
    f_out.write("===== danh sách đăng nhập thành công =====\n")
    for ip,sl in ds_TC.items():
        f_out.write(f"-{ip}:{sl}\n")
    f_out.write("===== danh sách đăng nhập thất bại =====\n")
    for ip,sl in ds_TB.items():
        f_out.write(f"-{ip}:{sl}\n")
    
    f_out.write(f"Địa chỉ IP có số lần đăng nhập thất bại nhiều nhất \n")
    for ip,sl in ds_max_TB.items():
         f_out.write(f"-{ip}:{sl}\n")
    f_out.write(f"Tài khỏa từng đăng nhập thất bại 1 lần :{', '.join(ds_max_TB_hon1)}\n")

    f_out.write("===== Thống kê số tài khoản khác nhau mà mỗi IP từng đăng nhập =====\n")
    for ip,sl in thong_ke_ip_pars.items():
         f_out.write(f"-{ip}:{sl}\n")


  


