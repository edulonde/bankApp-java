package bankapp;

// não será usado para criar objetos, mas para herdar para outras classes que criarão objetos
public abstract class Account  implements IBaseRate{

    // list common properties dor savings and checking accounts
    String name;
    String sSN;
    double balance;
    static int index = 10000;
    protected String accountNumber;
    protected double rate;



    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
        }

        public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random()* Math.pow(10,3));

        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // list common methods


    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
    }

    public void withdrawn(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere   );
    }
    public void printBalance(){
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: " + balance +
                        "\nRATE: " + rate + "%"
        );

    }


}
