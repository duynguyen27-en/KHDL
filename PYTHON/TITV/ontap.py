# bài tập 1
"""
raw_logs = (
    "  R1:192.168.1.1:up ; SW1:192.168.1.2:down ; R1:192.168.1.1:up ;"
    " R2:10.0.0.1:up ; ERROR_LINE ; SW2:10.0.0.2:down "
)
p=raw_logs.split(";")
ds=[ i.strip() for i in p if len(i.strip().split(":"))==3]
print(ds)
ds_1={}
for i in ds:
    ten=i.split(":")
    ds_1[ten[0]]=ten[1]

print(ds_1)
ds_2=[]
for i in ds:
   pash=i.split(":")
   ten=pash[0]
   name=pash[2]
   if name=="up" and ten not in ds_2:
       ds_2.append(ten)
print(ds_2)
"""
#  baif 2
"""
inventory = {
    "SP01": {"name": "Router Wifi", "qty": 10, "price": 500},
    "SP02": {"name": "Switch 8 Port", "qty": 5, "price": 800},
    "SP03": {"name": "Cáp mạng CAT6", "qty": 20, "price": 100},
}

transactions = [
    ["IN", "SP01", 5],
    ["OUT", "SP02", 8],  # Lỗi: Xuất vượt quá tồn kho hiện có
    ["OUT", "SP03", 10],
    ["IN", "SP04", 12],  # Mã mới chưa có trong kho
    ["OUT", "SP99", 2],  # Lỗi: Xuất mã không tồn tại
]
for i in transactions:
    if "IN" in i:
        if i[1] not in inventory:
            inventory.update({i[1]:{"name":"Unknown","qty":i[2],"price":500}})
        else:
            inventory[i[1]]["qty"]+=i[2]
    else:
        if i[1] in inventory:
            if i[2]<inventory[i[1]]["qty"]:
                inventory[i[1]]["qty"]-=i[2]
            else:
                print(f"{i[1]} xuất vượt quá tồn kho!")
        else:
            print(f"{i[1]} xuất mã không tồn tại!")

print(inventory)    
ds_tong_tien={}
for i,row in inventory.items():
   if row["qty"]>0:
     ds_tong_tien[i]=row["qty"]*row["price"]

print(ds_tong_tien)
"""
# bài 3
"""
students_raw = [
    ("SV01", "  nguyen van an ", "8.5, 7.0, 9.0"),
    ("SV02", "TRAN THI BINH", "6.0, lỗi, 7.5"),
    ("SV03", "le van cuong  ", "9.5, 9.0, 10.0"),
    ("SV04", "pham minh dung", "4.0, 5.0, 4.5"),
]
ds=[]
for i in students_raw:
    agv=0
    try:
        toan=float(i[2].split(",")[0])
        van=float(i[2].split(",")[1])
        anh=float(i[2].split(",")[2])
        agv=(toan+van+anh)/len(i[2].split(","))
        
        if agv >=8.0:
             ds.append({"id":i[0],"name":i[1].strip().title(),"agv":f"{agv:.2f}","rank":"kha"})
        elif 6.5 <=agv<8.0:
             ds.append({"id":i[0],"name":i[1].strip().title(),"agv":f"{agv:.2f}","rank":"trung Bình"})
       
    except ValueError:
        print("loi!")

print(ds)
ds_sap_xep=list(sorted(ds,key=lambda x:x["agv"],reverse=True))
print(ds_sap_xep)
"""
# bài 4
"""
raw_orders = (
    " ORD01 - Ban phim co : 2 x 1200 | "
    " ORD02 - Chuot khong day : 1 x 450 | "
    " ORD01 - Ban phim co : 1 x 1200 | "
    " ORD03 - Man hinh 24inch : lỗi x 3500 | "
    " ORD04 - Tai nghe : 3 x 300 "
)
ds_1=[]
for i in raw_orders.split("|"):
    try:
       row=i.strip()
       ma=row.split("-")[0]
       chuoi=row.split("-")[1]
       Ten_SP=chuoi.split(":")[0]
       chuoi_1=chuoi.split(":")[1]
       sl=float(chuoi_1.split("x")[0])
       don_gia=float(chuoi_1.split("x")[1])
       ds_1.append({"madon":ma,"Ten_SP":Ten_SP,"soluong":sl,"dongia":don_gia})
    except ValueError:
        print("loi")
        
print(ds_1)
order_totals={}
for i in ds_1:
    order_totals[i["madon"]]=order_totals.get(i["madon"],0)+(i["soluong"]*i["dongia"])
print(order_totals)   
max=-1
ds_max={}
for i in order_totals:
    if  order_totals[i]>max:
        max=order_totals[i]
        ds_max={i:max}
    elif order_totals[i]==max:
        max=order_totals[i]
        ds_max.update({i:max})
print(ds_max)
"""
# bài 5

interfaces = ["Gi0/1", "Gi0/2", "Gi0/3", "Te0/1"]
speeds = [1000, 100, 1000, 10000]
statuses = ["up", "up", "down", "up"]
ds_tong=[{"name":name,"speed":speed,"status":status} for name,speed,status in zip(interfaces,speeds,statuses)]
print(ds_tong)
# kiểm tả trạng thái up
ds_TB={}
# for i in ds_tong:
#     if i["status"]=="up" and i["speed"]>=1000:
#         ds_TB[i["name"]]="Đạt chuẩn băng thông"
#     else:
#         ds_TB[i["name"]]="Có cổng UP tốc độ thấp!"

# print(ds_TB)
dat_chuan = all(i["speed"] >= 1000 for i in ds_tong if i["status"] == "up")
if dat_chuan:
  print("Đạt chuẩn băng thông")
else:
  print("Cảnh báo: Có cổng UP tốc độ thấp!")
# bị down hay k
# ds_down={}
# for i in ds_tong:
#     if "Te" in i["name"] and i["status"]=="down":
#         ds_down[i["name"]]="có down"
#     elif "Te" in i["name"] and i["status"]!="down":
#          ds_down[i["name"]]="khong có down"
# print(ds_down)
co_cong_te_down = any(
    i["name"].startswith("Te") and i["status"] == "down" for i in ds_tong
)
print("Có cổng 10G bị down không?:", co_cong_te_down)

# bài 6
"""
access_logs = [
    ("08:01", "admin", "10.0.0.5", "FAIL"),
    ("08:02", "admin", "10.0.0.5", "FAIL"),
    ("08:03", "guest", "192.168.1.10", "SUCCESS"),
    ("08:04", "admin", "10.0.0.5", "FAIL"),
    ("08:05", "user1", "10.0.0.8", "FAIL"),
    ("08:06", "user1", "10.0.0.8", "SUCCESS"),
]
# đếm số lần thất bại của từng ip
fail_counts={}
for i in access_logs:
    if i[3]=="FAIL":
        fail_counts[i[2]]=fail_counts.get(i[2],0)+1
print(fail_counts)
# danh sách k trùng lặp địa chỉ IP mà user đó sử dụng
user_ips={}
for i in access_logs:
    user=i[1]
    ip=i[2]
    user_ips.setdefault(user,set()).add(ip)
print(user_ips)
# các địa chỉ IP có số lần đăng nhập "FAIL" từ 3 lần trở lên, sắp xếp theo số lần thất bại giảm dần và in ra cảnh báo.
blocked_ips={}
for i in fail_counts:
    if fail_counts[i]>=3:
        blocked_ips.update({i:fail_counts[i]})
print(blocked_ips)
ds_giam=list(sorted(blocked_ips.items(),key=lambda x:x[1],reverse=True))
print(ds_giam)
"""