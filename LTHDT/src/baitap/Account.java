package baitap;
public class Account {
    private String accountNumber;
    private String accountName;
    private double balance;

    public Account(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
   

     public void  deposit(double amount){
      balance+=amount;
        System.out.println("ban da nap "+amount+" thanh cong ");
        System.out.println("so du hien tai la "+balance);
        
     }
     public void withdraw(double amount){
        if(amount>balance){
            System.out.println("so du khong du");
        }else{
            balance-=amount;
            System.out.println("ban da rut "+amount+"thang cong ");
            System.out.println("so du hien tai la "+balance);
        }
     }
      public void displayBalance(){
        System.out.println("so tai khoan :"+accountNumber);
        System.out.println("ten tai khoan :"+accountName);
        System.out.println("so du :"+balance);
    }

}
