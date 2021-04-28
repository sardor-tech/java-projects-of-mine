public class NewJavaM2Lesson2Hw2 {
    private Integer accountNumber;
    private String nameSurname;
    private Integer balance;

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        NewJavaM2Lesson2Hw2 account = new NewJavaM2Lesson2Hw2();
        account.setAccountNumber(2343545);
        account.setBalance(4793532);
        account.setNameSurname("Azizov Elmurod");
        System.out.println(account.getAccountNumber() +" Hisob raqami");
        System.out.println("$"+account.getBalance()+" Balansi");
        System.out.println(account.getNameSurname()+" hisob raqam egasi");

    }
}
