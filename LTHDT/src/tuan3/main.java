package tuan3;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    ArrayList<person> a = new ArrayList<>(); // danh sach cac doi tuong person
    public void docfile(String tenfile ){
        try {
            File f = new File(tenfile); // tạo đối tượng file
            if(f.exists()){
                System.out.println("doc File thanh cong");
                Scanner sc  = new Scanner(f); // tạo đối tượng scanner để đọc file
                while(sc.hasNext()){
                    String line = sc.nextLine();// đọc từng dòng 
                    String s[] = line.split(","); // tách chuỗi thành mảng
                    if(s[0].trim().equals("sv")){  // nếu s[0].trim().equals("sv") thì là học sinh
                        String id = s[1].trim();
                        String hoten = s[2].trim();
                        int namsinh = Integer.parseInt(s[3].trim());
                        double dtb = Double.parseDouble(s[4].trim());
                        student sv = new student(id,hoten,namsinh,dtb);// tạo đối tượng student
                        a.add(sv); // thêm đối tượng student vào danh sách
                    } else if(s[0].trim().equals("gv")){ // nếu s[0].trim().equals("gv") thì là giáo viên
                         String id = s[1].trim();
                        String hoten = s[2].trim();
                        int namsinh = Integer.parseInt(s[3].trim());
                        long luong = Long.parseLong(s[4].trim());
                        teacher gv = new teacher(id,hoten,namsinh,luong);// tạo đối tượng teacher
                        a.add(gv);// thêm đối tượng teacher vào danh sách
                    }
                }
            }else{
                System.out.println("khong tim thay file");
            }
            
        } catch (Exception e) {
            e.printStackTrace();// in ra thong tin lỗi
        }
    }
    public void output(){
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i).toString());// in ra thong tin cua doi tuong
        }
    }
    public static void main(String[] args) {
        main dd = new main();
        dd.docfile("D:\\CS311F1_NguyenDuyNguyen\\CS311SC\\src\\tuan3\\danhsach.txt"); // gọi phương thức docfile để đọc file
        dd.output(); // gọi phương thức output để in ra thong tin cua doi tuong
    }

}
