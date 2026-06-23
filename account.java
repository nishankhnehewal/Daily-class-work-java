class bankaccount{
    private double accountsalary;

    public void settersalary(double salary)
    {
    if(salary>=0) 
        {
            this.accountsalary=salary;
        }
    }
    public double gettersalary()
    {
        return accountsalary;
    }

}

public class account {
    public static void main(String[] args) {
        bankaccount b1 = new bankaccount();
        b1.settersalary(3000);
        System.out.print("account salary is" + b1.gettersalary());
    }
    
}
