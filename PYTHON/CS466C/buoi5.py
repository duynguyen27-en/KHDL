#                                             bài 3
"""

logs = [
    "10.0.0.5|08:00|/login|401",
    "10.0.0.8|08:01|/login|401",
    "10.0.0.5|08:02|/login|401",
    "10.0.0.5|08:03|/login|200",
    "10.0.0.9|08:04|/login|401",
    "10.0.0.8|08:05|/login|200",
    "10.0.0.9|08:06|/login|401",
    "10.0.0.9|08:07|/home|200",
    "10.0.0.9|08:08|/login|401",
    "10.0.0.9|08:09|/login|200"
]

ds_TB=[]
dsIP_NV=[]
SO_NV=0


for i in logs :
    ip,tg,dd,ma=i.split("|")
    if dd in "/login" :
        if ma == "401":
        

          da_Ton_Tai=False
          for row in ds_TB:
            if row[0]==ip:
                row[4]+=1
                row[1]=tg
                da_Ton_Tai=True
                break
          if not da_Ton_Tai:
            ds_TB.append([ip,"",dd,ma,1])
        else :
            for rox in ds_TB:
                if rox[0]==ip :
                    rox[1]=tg
                   


     
for k in range(len(ds_TB)):
    if int(ds_TB[k][4])>=3:
        dsIP_NV.append(ds_TB[k])


print("============== THONG KE DANG MHAP THAT BAI ================")
for h in range(len(ds_TB)) :
    print(ds_TB[h][0],":",ds_TB[h][4],"lan",end="\n")

print("============== DANH SACH IP NGHI VAN ==================")
for h in range(len(dsIP_NV)) :
    print("IP :",dsIP_NV[h][0],end="\n")
    print("So Lan That Bai Lien Tiep :",dsIP_NV[h][4],end="\n")
    print("Dang Nhap Thanh Cong Luc :",dsIP_NV[h][1],end="\n")

print("Tong So IP Nghi Van :",len(dsIP_NV))
"""
#                                          bài 2
"""
logs = [
    "admin|09:00|401",
    "user123|09:01|401",
    "admin|09:02|401",
    "admin|09:03|401",
    "admin|09:04|200",  # Đăng nhập thành công
    "guest|09:05|401",
    "guest|09:06|403",  # Bị cấm truy cập
    "user123|09:07|401",
    "user123|09:08|200",
]

ds_TB=[]
dsip_2=[]

for i in logs:
    tk,tg,ma=i.split("|")
    if ma !="403" :
        if ma =="401":

            so_lan_TB=False
            for row in ds_TB:
                if row[0]==tk:
                    row[3]+=1
                    so_lan_TB=True
                    break
            if not so_lan_TB :
                ds_TB.append([tk,"",ma,1])
        else :
            for rox in ds_TB:
                if rox[0]==tk :
                    rox[1]=tg
                
for i in range(len(ds_TB)) :
    if int(ds_TB[i][3])>=2 :
        dsip_2.append(ds_TB[i])

print("========== DANH SACH TAI KHOAN NGHI VAN =========")
for i in range(len(dsip_2)):
    print("TAI KHOAN NGHI VAN :",dsip_2[i][0],end="\n")
    print("SO LAN THAT BAI LIEN TIEP :",dsip_2[i][3],end="\n")
    print("THOI GIAN DANG NHAP THANH CONG :",dsip_2[i][1])
    print(end="\n")
    
"""

#                                        bài 3
"""
transactions = [
      "KH01|10:15|checkout|FAIL",
      "KH02|10:16|checkout|SUCCESS",
      "KH01|10:17|checkout|FAIL",
      "KH01|10:18|checkout|FAIL",
      "KH01|10:20|checkout|SUCCESS",
      "KH03|10:21|checkout|FAIL",
      "KH03|10:22|checkout|FAIL",
      "KH03|10:25|checkout|SUCCESS",
  ]
  
ds_TB=[]
ds_NV=[]

for i in transactions:
    ma,tg,hd,tt=i.split("|")
    if tt == "FAIL":
        da_Ton_Tai=False
        for row in ds_TB:
            if row[0]==ma :
                row[4]+=1
                da_Ton_Tai=True
                break
        if not da_Ton_Tai :
            ds_TB.append([ma,"",hd,tt,1])
    else:
        for rox in ds_TB:
            if rox[0]==ma:
                rox[1]=tg

for i in range(len(ds_TB)):
    if int(ds_TB[i][4])>=2:
        ds_NV.append(ds_TB[i])

print("======== KHACH HANG NGHI VAN =========")
for i in range(len(ds_NV)):
    print("MAKH :",ds_NV[i][0],end="\n")
    print("SO LAN THAT BAI LIEN TIEP :",ds_NV[i][4],end="\n")
    print("THOI GIAN DANG NHAP THANH CONG :",ds_NV[i][1])
    print(end="\n")
"""
#                                            bài 4
ds_diem = [
    "SV01|Nguyen Van A|8.5|7.0|9.0",
    "SV02|Tran Thi B|4.0|5.5|3.0",
    "SV03|Le Van C|9.0|9.5|8.5",
    "SV04|Pham Thi D|abc|8.0|7.0",  # Dữ liệu lỗi ở điểm Toán
    "SV05|Hoang Van E|6.5|7.0|6.0",
]
ds_sv=[]
ds_G=[]
# cách 1 nhưng lỗi islower()
"""
for i in ds_diem:
    ma,ten,toan,van,anh=i.split("|")
    if toan.islower() or van.islower() or anh.islower():
        ds_sv.append([ma,ten,toan,van,anh])
    else:
        TB=float((float(toan)+float(van)+float(anh))/3)
        ds_G.append([ma,ten,TB])

print("======= danh sach hoc sinh gioi =======")
for i in range(len(ds_G)):
     print(ds_G[i][0],",",ds_G[i][1],",",f'{ds_G[i][2]:.2}',end="\n")
"""
#   cách 2
"""
for i in ds_diem:
    ma,ten,toan,van,anh=i.split("|")
   # Dùng try-except để bắt lỗi nếu có bất kỳ cột điểm nào không đổi được sang số
    try:
      dt = float(toan)
      dv = float(van)
      da = float(anh)

    # Nếu đổi thành công hết thì tính điểm trung bình
      TB = (dt + dv + da) / 3

    # Lọc sinh viên giỏi (TB >= 8.0)
      if TB >= 8.0:
        ds_G.append([ma, ten, TB])

    except ValueError:
    # Nếu có chữ cái (abc, ABC...), ký tự lạ, Python sẽ rơi vào đây (coi như dòng lỗi)
     ds_sv.append([ma, ten, toan, van, anh])

print("======= danh sach hoc sinh gioi =======")
for i in range(len(ds_G)):
     print(ds_G[i][0],",",ds_G[i][1],",",f'{ds_G[i][2]:.2}',end="\n")
   
"""
#                                     bài 5
"""
reviews = [
      "SP001|Ao thun|5|San pham rat dep va vua vom",
      "SP002|Quan jean|2|Vai qua mong va rong so với mô tả",
      "SP001|Ao thun|4|Giao hang nhanh, chat luong on",
      "SP003|Giay sneaker|1|Loi keo, qua te",
      "SP002|Quan jean|5|Rat hai long, se ung ho tiep",
  ]
ds_kem=[]
tong_BLL=0

for i in reviews :
    ma,ten,dg,bl= i.split("|")
    if int(dg)<3 :
        ds_kem.append([ma,ten,dg,bl])
    if ("te" or "loi") in bl:
        tong_BLL+=1

print("========== danh sach san pham kém chat luong ========")
for i in range(len(ds_kem)):
    print(ds_kem[i][0],",",ds_kem[i][1],",",ds_kem[i][2],",",ds_kem[i][3],end="\n")

print("tong so bình luan te va loi la :",tong_BLL)
"""
#                                bài 6
"""
sensor_data = [
    "Station_01|08:00|32.5|80",
    "Station_02|08:01|45.0|60",  # Nhiệt độ quá cao (bất thường)
    "Station_01|09:00|33.0|75",
    "Station_03|09:15|loi_cam_bien|50",  # Dữ liệu lỗi
    "Station_02|10:00|30.5|70",
    "Station_01|10:00|34.2|72",
]

ds_CB=[]
ds_L=[]

for i in sensor_data:
    tt,tg,nd,da= i.split("|")
    try :
      nd_1=float(nd)
      if nd_1>=40.0 :
        ds_CB.append([tt,tg,nd,da])


    except ValueError :
        ds_L.append([tt,tg,nd,da])

print("========== NHUNG TRAM NANG GAT ==========")
for i in range(len(ds_CB)):
    print(ds_CB[i][0],",",ds_CB[i][1],",",ds_CB[i][2],",",ds_CB[i][3],end="\n")
    
"""





