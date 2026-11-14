package buoi12;

public class MayTinh extends SanPham {
    private String chip;
    private double ram;
   
    public MayTinh(String maSp, double donGia, double soLuong, String chip, double ram) {
        super(maSp, donGia, soLuong);
        this.chip=chip;
        this.ram=ram;
       
    }
    

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    @Override
    public double tinhChietKhau() {
        double tong=0;
        if(soLuong>=100){
            tong+=soLuong*donGia*0.1;
        }else{
            tong+=0;
        }
        return Math.round(tong*100.0)/(100.0);
    }

    @Override
    public String toString() {
       return super.toString()+"\t"+chip+"\t"+ram+"\t"+tinhChietKhau();
    }


   
}
