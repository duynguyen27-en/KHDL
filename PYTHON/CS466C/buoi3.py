#bài 1
"""
hoten = str(input("Nhập Họ Tên :"))
if hoten=="":
    print("Khoang trang khong hop le!")
    hoten = str(input("Nhap lai ho ten "))
    
else:
    hoten= hoten.strip()
    hoten = hoten.split(" ")
    hoten= " ".join(hoten)
    hoten = hoten.title()
    print("Ten sau khi sua :",hoten)
"""


# bài 2

email = input("nhap email :").strip()

if email.count("@")==1 :
    i=email.find("@")
    ten=email[0:i]
    mien=email[i:]
    if len(ten)>0 and len(mien)>1 and " " not in email :
        if mien[1:].count(".")==1 and not mien[1:].startswith(".") and not mien[1:].endswith("."):
            if len(ten)>=3 :
                email_moi= ten[0]+"*"*(len(ten)-2)+ten[-1]+mien
               
            else :
                email_moi="*"*len(ten)+mien
            
            print("email sau khi sua:",email_moi)
        else :
            print("email khong hop le !")
    else :
        print("email khong hop le !")
else:
    print("email khong hop le !")
    
       


    
