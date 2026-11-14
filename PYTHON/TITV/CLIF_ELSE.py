# câu lệnh if else trong python
# Bằng nhau: a == b
# Không bằng nhau: a != b
# Nhỏ hơn: a < b
# Nhỏ hơn hoặc bằng: a <= b
# Lớn hơn: a > b
# Lớn hơn hoặc bằng: a >= b

# pythoy elif
# python else
# viết tắt nêu
"""
a=4
b=5
if b>a : print("đúng")
# câu lệnh if/else trên một dòng
print("A") if b>a else print("B")
# gán giá trị bằng câu lệnh if/else
bigger= a if b>a else b
print("giá trị :",bigger)
# nhiều điều kiện trên một dong
print("A") if b>a else print("=") if b==a else print("B")
# các toán tử logic : and,or,not
c=6
if b>a and c>a : print("đúng")
# nếu lồng nhau
"""
#                        bài tập
"""
khach_hang = {
    "KH01": {"ten": "Nguyễn Văn An", "chi_tieu": 15000000, "nam_thanh_vien": 3},
    "KH02": {"ten": "Trần Thị Bình", "chi_tieu": 4000000, "nam_thanh_vien": 1},
    "KH03": {"ten": "Lê Hoàng Châu", "chi_tieu": 25000000, "nam_thanh_vien": 5},
    "KH04": {"ten": "Phạm Văn Dũng", "chi_tieu": 8000000, "nam_thanh_vien": 2},
}
# hạng kim cương
khach_hang_moi=khach_hang

for i,row in khach_hang.items():
    if row["chi_tieu"]>=20000000 or row["nam_thanh_vien"]>=5:
        khach_hang_moi[i]["chi_tieu"]=row["chi_tieu"]-row["chi_tieu"]*0.2
        khach_hang_moi[i]["hang_the_vien"]="Kim Cương"
        khach_hang_moi[i]["chinh_sach_giam"]=20
    elif (row["chi_tieu"]>=10000000 or row["chi_tieu"]<20000000) and (row["nam_thanh_vien"]>=2 or row["nam_thanh_vien"]<4):
        khach_hang_moi[i]["chi_tieu"]=row["chi_tieu"]-row["chi_tieu"]*0.1
        khach_hang_moi[i]["hang_the_vien"]="Hạng Vàng"
        khach_hang_moi[i]["chinh_sach_giam"]=10
    else:
        khach_hang_moi[i]["chi_tieu"]=row["chi_tieu"]-row["chi_tieu"]*0
        khach_hang_moi[i]["hang_the_vien"]="Hạng Bạc"
        khach_hang_moi[i]["chinh_sach_giam"]=0

print(khach_hang_moi)
"""
#bài 2
he_thong_users = {
    "admin_boss": {"password": "123", "role": "Admin", "trang_thai": True},
    "staff_sale": {"password": "abc", "role": "Staff", "trang_thai": True},
    "user_guest": {
        "password": "456",
        "role": "Guest",
        "trang_thai": False,
    },  # Tài khoản bị khóa
}
nhap_ten=input("Nhập tên người dùng :").strip()
if nhap_ten in he_thong_users:
    nhap_MK=input("Nhập mật khẩu :").strip().upper()
    if nhap_MK == he_thong_users[nhap_ten]["password"]:
        if he_thong_users[nhap_ten]["trang_thai"]:
            if he_thong_users[nhap_ten]["role"]=="Admin":print("chào xếp tổng Admin hệ thống !")
            else:print("chào nhân viên kinh doanh !")
        else:print("tài khoản của bạn bị khóa tạm thời !")
    else:print("mật khẩu không chính xác")
else:print("Tài khoản không tồn tại!")
