
#   bài 1
"""
with open("devices.txt","r",encoding="utf-8") as f:
    ds_moi=[]
    ds=f.readlines()
    for i in ds:
        pasr=i.split(",")
        if len(pasr)>=4:
            try:
                tai_CPU=int(pasr[3])
                ds_moi.append(i)
            except ValueError:
                print("loi cpu")

# cho phép người dùng nập thông tin
with open("devices.txt","a",encoding="utf_8") as f_nhap:
    nhap=input("Người Dùng Nhập :").strip()
    f_nhap.write(nhap+"\n")           

# cachr báo cpu
with open("canh_bao_cpu.txt","w",encoding="utf-8") as f_out:
    for i in ds_moi:
        pars=i.split(",")
        CPU=int(pars[3])
        if pars[2]=="UP" and CPU>=80:
            f_out.write(f"{pars[0]} - {pars[1]} : {pars[3]}%"+"\n")
            
"""
#  bài 2
"""
with open("sales.txt","r",encoding="utf-8") as h:
    ds_1=h.readlines()
    ds_moi=[]
    for i in ds_1:
        pars=i.strip().split("|")
        if len(pars)>=4:
            try:
                sl=int(pars[2])
                dg=int(pars[3])
                ds_moi.append(i)
            except ValueError:
                print("loi định dạng!")
       
    
# tính tổng từng hóa đơn
    ds_Tong_HD={}
    tong=0
    for i in ds_moi:
        pars=i.strip().split("|")
        sl=int(pars[2])
        DG=int(pars[3])
        tong+=sl*DG
        ds_Tong_HD[pars[0]]=ds_Tong_HD.get(pars[0],0)+(sl*DG)
    
    print(ds_Tong_HD)
    print("Tổng Doanh Thu Cả Ngày :",tong)

# tong_ket_doanh_thu.txt
with open("tong_ket_doanh_thu.txt","w",encoding="utf-8") as h_out:
    max_DT=-1
    ds_max_DT={}
    for i in ds_Tong_HD:
        if ds_Tong_HD[i]>max_DT:
            max_DT=ds_Tong_HD[i]
            ds_max_DT={i:ds_Tong_HD[i]}
        elif ds_Tong_HD[i]==max_DT:
             max_DT=ds_Tong_HD[i]
             ds_max_DT.update({i:ds_Tong_HD[i]})

    h_out.write("======= Doanh Thu ======\n")
    for i in ds_Tong_HD:
        h_out.write(f"{i} : {ds_Tong_HD[i]}\n")  
         
    h_out.write("======= Doanh Thu Max ======\n")
    for i in ds_max_DT:
        h_out.write(f"{i} : {ds_max_DT[i]}\n")

"""
# bài 3
"""
with open("diem_thi.txt","r",encoding="utf-8") as l:
    ds_2=l.readlines()
    ds_moi={}
    for i in ds_2:
        pars=i.strip().split(";")
        ma=pars[0].strip()
        hoten=pars[1].strip().title()
        
        ds_moi[ma]={"Ten":hoten,"Toan":pars[2].strip(),"Van":pars[3].strip(),"Anh":pars[4].strip()}


# tính điểm trung bình các mỗi sinh viên
    ds_dat_truot={}
    for i,row in ds_moi.items():
        
        ds_diem_HL=[]
        ma=i
        ten=row["Ten"]
        for mon in ["Toan","Van","Anh"]:
            try:
                diem=float(row[mon].strip())
                ds_diem_HL.append(diem)
            except ValueError:
                pass

        if len(ds_diem_HL)>0:
            DTB=sum(ds_diem_HL)/len(ds_diem_HL)
            if DTB>=5.0:
                 ds_dat_truot[i]={"Ten":row["Ten"],"DTB":f"{DTB:.2f}","HK":"Đạt"}
            else:
                 ds_dat_truot[i]={"Ten":row["Ten"],"DTB":f"{DTB:.2f}","HK":"trược"}
                             
        else:
            DTB=0.0
        print(f"{i} - {ten} | Điểm hợp lệ {ds_diem_HL} | Trung bình {DTB:.2f}")
    print(ds_moi)
    print(ds_dat_truot)

#ghi đạt vào ds_dat.txt và ds_truot.txt
with open("ds_dat.txt","w",encoding="utf-8") as h_out:
    for i,row in ds_dat_truot.items():
        if float(row["DTB"])>=5.0:
          ten=row["Ten"]
          dtb=row["DTB"]
          h_out.write(f"{i} - {ten} - {dtb}"+"\n")

with open("ds_truot.txt","w",encoding="utf-8") as h_1_out:
    for i,row in ds_dat_truot.items():
        if float(row["DTB"])<5.0:
          ten=row["Ten"]
          dtb=row["DTB"]
          h_1_out.write(f"{i} - {ten} - {dtb}"+"\n")

"""







