
# truy cập trong từ điển
"""
ds={"name":"Nguyên","tuoi":19,"age":9}
print(ds["name"])
print(ds.get("name"))
# keys() trả về các khóa trong từ điển
print(ds.keys())
# thêm mục mới vào từ điể gốc 
ds["HK"]="gioi"
print(ds)
# lấy danh sách giá trị
print(ds.values())
# lấy cả khỏ cả giá trị
print(ds.items())
# kiểm tra xem từ khóa đó có trong từ điển không
if "name" in ds:
    print(True)
else:
    print(False)
"""
# thay đổi mục
"""
ds={"name":"Nguyên","tuoi":19,"age":9}

# thay đổi giá trị
ds["tuoi"]=20
print(ds["tuoi"])
# cập nhật từ điể bằng update()
ds.update({"age":9.5})
print(ds["age"])
"""
# thêm mục
"""
ds={"name":"Nguyên","tuoi":19,"age":9}
ds["HK"]="gioi"
print(ds)
# cập nhật từ điển
ds.update({"toan":8})
print(ds)
"""

# xóa các mục
"""
ds={"name":"Nguyên","tuoi":19,"age":9}
ds.pop("name")
print(ds)
del ds["age"]
print(ds)
# del có thể xóa hoàn toàn từ điển
# clear() xoa sạch từ điể
ds.clear()
print(ds)
"""
# từ điển vòng lặp
"""
ds={"name":"Nguyên","tuoi":19,"age":9}

for i in ds:
  print(i)
# in ra tất cả giá trị có trong từ điể
for i in ds:
    print(ds[i])

# dùng values() trả về một giá trị
for i in ds.values():
    print(i)
# dùng keys() trả về khóa
# dung items() trả về cả khóa và giá trị
"""
# từ điển sao chép
"""
ds={"name":"Nguyên","tuoi":19,"age":9}
# sao chép từ điển bằng copy()
ds_1=ds.copy()
print(ds_1)
# tạo bảng sao từ từu điển dict()
ds_2=dict(ds)
print(ds_2)
"""
# từ điển lồng nhau
"""
ds={"sv1":{
    "name":"nguyen",
    "tuoi":18
         },
    "sv2":{
        "name":"tay",
        "tuoi": 22 
          },
    "sv3":{
        "name":"khoi",
        "tuoi":23
    }
  }
# in tên sv thứ 2
print(ds["sv2"]["name"])
# dùng vòng for
for i,row in ds.items():
    print(i)
    for k in row:
        print(k,":",row[k])
"""
#                                               bài tập

# bài 1
"""
gio_hang = {"áo thun": 2, "quần jean": 1, "giày sneaker": 1}
# khách hàng mua thêm 1 chiếc áo thun
gio_hang["áo thun"]=3
print(gio_hang)
# mua mới mũ lưỡi trai
gio_hang["mũ lưởi trai"]=2
print(gio_hang)
# kiểm tra có túi xách k 
print(gio_hang.get("túi xách"),"không có sản phẩm này")
# khách hàng hủy mua quần jean
gio_hang.pop("quần jean")
print(gio_hang)
"""
# bài 2
"""
danh_sach_loi = ["ERR_404", "ERR_500", "ERR_404", "ERR_200", "ERR_500", "ERR_404"]
ds_loi={}
# cách 1
# for i in danh_sach_loi:
#     ds_ton_tai=False
#     for row in ds_loi:
#         if row==i :
#             ds_loi[i]+=1
#             ds_ton_tai=True
#     if not ds_ton_tai:
#         ds_loi[i]=1   

# print(ds_loi)    

# cách 2
for i in danh_sach_loi:
    ds_loi[i]=ds_loi.get(i,0)+1
print(ds_loi)
"""
# bài 3
"""
ql_sinh_vien = {
    "SV01": {"ten": "Nguyen Van A", "toan": 8.5, "van": 7.0},
    "SV02": {"ten": "Tran Thi B", "toan": 9.0, "van": 8.0},
    "SV03": {"ten": "Le Van C", "toan": 6.0, "van": 6.5},
}
ds_moi={}
# in ra tên và điểm toán có mã sv02
for i,row in ql_sinh_vien.items():
    if i == "SV02":
         print(row["ten"],":",row["toan"])
    elif i=="SV03":
        row["van"]=7.5
        

    row["DTB"]=(row["toan"]+row["van"])/2
    
        
for i,row in ql_sinh_vien.items():
    print(i,"-",row["ten"],":",row["DTB"])

"""

# bài 3
"""
kho_hang = {
    "SP01": {"ten": "Nước ngọt", "so_luong": 15, "gia": 10000},
    "SP02": {"ten": "Mì tôm", "so_luong": 3, "gia": 5000},
    "SP03": {"ten": "Bánh snack", "so_luong": 25, "gia": 8000},
    "SP04": {"ten": "Sữa tươi", "so_luong": 4, "gia": 12000},
}
ds_TK={}
# cập nhật hang_ve={"SP02": 20, "SP05": {"ten": "Kẹo gum", "so_luong": 50, "gia": 4000}}
kho_hang["SP02"].update({"so_luong":20})
kho_hang["SP05"]={"ten":"Kẹoc gum","so_luong":50,"gia":4000}
print(kho_hang)

for i ,row in kho_hang.items():
    if row["so_luong"]<10:
        ds_TK[i]=row
print(ds_TK)
# tính tổng tiền cho từng sản phẩm
for i,row in kho_hang.items():
    kho_hang[i].update({"Tong_tien":row["so_luong"]*row["gia"]})

print(kho_hang)
"""
# bài 4
"""
bang_diem = {
      "Lớp A": {
          "An": {"toan": 8.5, "van": 7.0, "anh": 9.0},
          "Bình": {"toan": 4.5, "van": 5.0, "anh": 6.0},
          "Châu": {"toan": 9.0, "van": 8.5, "lat": 9.5},  # (giả sử có môn khác)
          "Dũng": {"toan": 6.0, "van": 6.5, "anh": 5.5},
      }
  }
ds_lop=bang_diem["Lớp A"]
# tính điểm trung bình các môn 
ds_lop_moi={}
for i,row in ds_lop.items():
    ds_lop_moi[i]=row
    dtb=0
    for k,rox in row.items():
        dtb+=row[k]
    ds_lop_moi[i].update({"dtb":f"{(dtb)/3:.2f}"})

print(ds_lop_moi)
# xếp loại học lực
ds_HL={"giỏi":[],"khá":[],"Trung Bình":[]}
for i,row in ds_lop_moi.items():
    if float(row["dtb"])>=8.0:
        ds_HL["giỏi"].append(i)  
    elif float(row["dtb"])>=6.5:
        ds_HL["khá"].append(i)   
    else:
        ds_HL["Trung Bình"].append(i)
print(ds_HL)   
# sắp xếp sinh viên theo điểm trung bình từ cao đến thấp
ds_sx_dtb=dict(sorted(ds_lop_moi.items(),key=lambda x:x[1]["dtb"],reverse=True))
print(ds_sx_dtb)
"""
#bài 5
"""
nhat_ky = [
    ("User_A", "login"),
    ("User_B", "login"),
    ("User_A", "click_buy"),
    ("User_C", "login"),
    ("User_B", "click_buy"),
    ("User_A", "logout"),
    ("User_D", "login"),
    ("User_B", "logout"),
    ("User_A", "login"),
]
ds_HD={}
ds_CDM={}
for i in nhat_ky:
    ds_HD[i[0]]= ds_HD.get(i[0],0)+1
        
print(ds_HD)  
# tin user nò hoạt động njieeuf nhất
max=-1
for i in ds_HD: 
    if ds_HD[i]>max:
        max=ds_HD[i]
        ds_CDM[i]=ds_HD[i]
    elif ds_HD[i]==max:
        max=ds_HD[i]
        ds_CDM.update({i:ds_HD[i]})
print("côn đồ mạng la :",ds_CDM)
# lọc hành động riêng lẽ
ds_loc={}


for i,row in nhat_ky:
    if row not in ds_loc:
        ds_loc[row]=[]

    ds_loc[row].append(i)
   

print(ds_loc)
"""
# bài 6
"""
# Kho hàng hệ thống: {Mã_SP: {"ten": Tên, "gia": Giá, "ton_kho": Số lượng}}
kho_hang = {
    "IP15": {"ten": "iPhone 15", "gia": 22000000, "ton_kho": 10},
    "SAM24": {"ten": "Samsung S24", "gia": 20000000, "ton_kho": 5},
    "airpod": {"ten": "AirPods Pro", "gia": 5000000, "ton_kho": 15},
    "chuot": {"ten": "Chuột Logitech", "gia": 800000, "ton_kho": 30},
}

# Giỏ hàng của khách: {Mã_SP: Số lượng muốn mua}
gio_hang = {"IP15": 2, "chuot": 3, "airpod": 1}

# Danh sách mã giảm giá hợp lệ: {Mã_code: Phần_trăm_giảm_giá}
ma_giam_gia = {"GIAM10": 10, "GIAM20": 20, "VIP50": 50}

# kiểm tra tồn kho và thanh toán sơ bộ
ds_sp_loi={}
Tong_Tien_tam_tinh=0
for ten_sp,so_luong in gio_hang.items():
    if ten_sp in kho_hang:
        if so_luong>kho_hang[ten_sp]["ton_kho"]:
            ds_sp_loi[ten_sp]= kho_hang[ten_sp]
        else:
            Tong_Tien_tam_tinh+=so_luong*kho_hang[ten_sp]["gia"]

print("Danh sách sản phẩm lỗi :",ds_sp_loi)
hoa_don={"Tong_SB":Tong_Tien_tam_tinh}
print("Hóa đơn của khách hàng sơ bộ :",hoa_don)
# cập nhật lại giỏ hàng
if not ds_sp_loi:
    for ten_sp,so_luong in gio_hang.items():
        kho_hang[ten_sp]["ton_kho"]-=so_luong
    print("kho hàng sau khi trừ đi số lượng mua :",kho_hang)
else:
    print("đơn hang vượt quá sp tồn kho")
# # áp dụng mã giảm giá
ma=input("Nhập mã giảm giá :").strip().upper()
if ma in ma_giam_gia:
    phan_tram=ma_giam_gia[ma]
    tien_giam=(hoa_don["Tong_SB"]*phan_tram)/100
    tien_cuoi=hoa_don["Tong_SB"]-tien_giam
    hoa_don["Tong_Tien_GG"]=int(tien_cuoi)
else:
  print("Mã giảm giá không hợp lệ hoặc không tồn tại!")
  hoa_don["Tong_Tien_GG"] = tong_tien_tam_tinh  

print("Hóa Đơn Sau Khi Hoàn Thành Là:", hoa_don)
"""
# bài 7
"""
rap_chieu_phim = {
      "Phim_A": {
          "the_loai": "Hành động",
          "ve_ban": {"VIP": 120, "Thuong": 350},
          "gia_ve": {"VIP": 150000, "Thuong": 80000},
      },
      "Phim_B": {
          "the_loai": "Hoạt hình",
          "ve_ban": {"VIP": 200, "Thuong": 500},
          "gia_ve": {"VIP": 120000, "Thuong": 60000},
      },
      "Phim_C": {
          "the_loai": "Hành động",
          "ve_ban": {"VIP": 80, "Thuong": 150},
          "gia_ve": {"VIP": 150000, "Thuong": 80000},
      },
      "Phim_D": {
          "the_loai": "Kinh dị",
          "ve_ban": {"VIP": 90, "Thuong": 200},
          "gia_ve": {"VIP": 140000, "Thuong": 70000},
      },
  }
rap_chieu_phim_moi=rap_chieu_phim

# tính tổng doanh thu cho từng bộ phim
for i,row in rap_chieu_phim.items():
    rap_chieu_phim_moi[i]["doanh_thu"]=(row["gia_ve"]["VIP"]*row["ve_ban"]["VIP"])+(row["gia_ve"]["Thuong"]*row["ve_ban"]["Thuong"])

# tìm phim cá kiếm nhất
max=-1
ds_max={}
for i,row in rap_chieu_phim_moi.items():
    if row["doanh_thu"]>max:
        max=row["doanh_thu"]
        ds_max={i:row}
    elif row["doanh_thu"]==max:
        max=row["doanh_thu"]
        ds_max.update({i:row})  

print(ds_max)
# sắp xếp bảng xếp hạng phim
ds_sap_xep=dict(sorted(rap_chieu_phim_moi.items(),key=lambda x:x[1]["doanh_thu"], reverse=True))
print(ds_sap_xep)
# thống kê doanh thu theo thể loại
ds_the_loai={}
for i,row in rap_chieu_phim_moi.items():
        ds_the_loai[row["the_loai"]]=ds_the_loai.get(row["the_loai"],0)+rap_chieu_phim_moi[i]["doanh_thu"]

print(ds_the_loai)        
"""
# bài 8
mang_xa_hoi = {
    "User_A": {"User_B", "User_C", "User_D"},
    "User_B": {"User_A", "User_C", "User_E"},
    "User_C": {"User_A", "User_B", "User_D", "User_E"},
    "User_D": {"User_A", "User_C"},
    "User_E": {"User_B", "User_C"},
}
# thống kê độ phổ biến
ds_SLBB={}
for i,row in mang_xa_hoi.items():
    tong=0
    for k in row:
        tong+=1
    ds_SLBB[i]=tong
print(ds_SLBB)
# tìm ngôi sao mạng xã hội
ds_max={}
max=-1
for i,row in ds_SLBB.items():
    if row>max:
        max=row
        ds_max={i:row}
    elif row==max:
        max=row
        ds_max.update({i:row})
print(ds_max)
# gợi ý kết bạn chung
user_1 = "User_A"
user_2 = "User_E"
# Lấy danh sách bạn bè hiện tại của 2 user dưới dạng Set
ban_cua_1 = mang_xa_hoi[user_1]
ban_cua_2 = mang_xa_hoi[user_2]
# Bước A: Kiểm tra xem 2 người này đã kết bạn trực tiếp với nhau chưa?
if user_2 in ban_cua_1:
  print(f"\n{user_1} và {user_2} đã là bạn bè của nhau rồi!")
else:
  print(f"\n{user_1} và {user_2} chưa kết bạn với nhau.")

  # Bước B: Tìm bạn chung bằng phép giao của Set (&)
  ban_chung = ban_cua_1 & ban_cua_2

  if ban_chung:
    print(
        f"🤝 Gợi ý kết bạn: {user_1} và {user_2} có các bạn chung là:"
        f" {ban_chung}"
    )
  else:
    print(f"Không có người bạn chung nào giữa {user_1} và {user_2}.")


