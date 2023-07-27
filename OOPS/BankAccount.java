public class BankAccount {
    public String username;
    private String password;
    BankAccount(){
        //default constructor or Non Parameterized
    }
    BankAccount(String username,String password){
        //parameterized Constructor
        this.username=username;
        this.password=password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    
}
