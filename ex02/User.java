package ex02;

public class User {
    private final int identifier;
    private String name;
    private int balance;

    public User(String name, int balance){
        this.identifier = UserIdsGenerator.getInstance().createNewId();
        if(name == null || balance < 0){
            System.err.println("Please add correct arguments");
        } else {
            this.name = name;
            this.balance = balance;
        }
    }

    public void printUserInfo(){
        System.out.println("ID: " + identifier + " Name: " + name + " Balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getIdentifier() {
        return identifier;
    }
}
