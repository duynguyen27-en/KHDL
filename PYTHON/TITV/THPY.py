# truy cập các mục
"""
ds={"apple","banana","kiwi"}
print(ds)# không được sắp xếp theo thứ tự
for i in ds:
    print(i,end=",")
 
print("banana" in ds,end="\n")
# =>Sau khi tạo một bộ sưu tập, bạn không thể thay đổi các thành phần trong đó, nhưng bạn có thể thêm các thành phần mới.
"""
# thêm mục vào bộ bằng add()
"""
ds={"apple","banana","kiwi"}
ds.add("caca")
print(ds,end=",")
# thêm tập hợp khách vào tập hợp khác 
ds_1={1,2,3,4}
ds.update(ds_1)
print(ds_1,end="\n")
# thêm bất kì đói tượng nào
ds_2=["luca","mari"]
ds_1.update(ds_2)
print(ds_1,end="\n")
"""
# xóa các mục 
"""
ds={"apple","banana","kiwi"}
ds.remove("apple")
print(ds,end="\n")
# xoa ngẩu nhiên một mục
x=ds.pop()
print(x,end="\n")
print(ds,end="\n")
# clear(): làm trống tập hợp
# del(): xóa hoàm toàm tập hợp
"""
# tham gia các tập hợp
"""
ds={"apple","banana","kiwi"}
ds_1={1,2,3}
# trả về tập hợp chứa 2 tập hợp
ds_3= ds.union(ds_1)
print(ds_3,end="\n")
# dùng cái này | tương đương cái này union()
# cái này có thể kết hợp nhiều bộ ds_3= ds.union(ds_1,ds_2,ds_4)
# Phương thức này intersection()sẽ trả về một tập hợp mới, chỉ chứa các mục có mặt trong cả hai tập hợp.
# sử dụng & tương tự intersection()
# Phương thức này sẽ trả về một tập hợp mới chỉ chứa các mục từ tập hợp đầu tiên mà không có trong tập hợp kia.difference()
# sử dụng - tương ướng với difference()
# Phương pháp này symmetric_difference()sẽ chỉ giữ lại những phần tử KHÔNG có mặt trong cả hai tập hợp.
# sử dụng ^ tương ứng cái này symmetric_difference()
"""
# bộ đông lạnh

# tạo hàm frozenset()
x=frozenset({"apple","banana","chery"})
print(x)
print(type(x))