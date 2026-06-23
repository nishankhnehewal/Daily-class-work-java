class employe{
    int emp_id;
    String emp_name;
    void setempdetails(int empid,String empname)
    {
        this.emp_id=empid;
        this.emp_name=empname;
    }
    void displayempdetails()
    {
        System.out.println(" employe id is " + " - "+ emp_id);
        System.out.println(" employe name is " + " - "+ emp_name);
    }
}   

class devloper extends employe{
    String programinglanguage;
    void setdevloperdetails(String programinglang)
    {
        this.programinglanguage=programinglang;
    }
    void displaydevloperdetails()
    {
        System.out.println("employe programing language is" + " - " + programinglanguage);
    }
}    

public class employesalarysystem {
    public static void main(String[] args)
    {
        devloper d = new devloper();
        d.setempdetails(7,"Nishankh Nehewal");
        d.setdevloperdetails("java");
        d.displayempdetails();
        d.displaydevloperdetails();
    }   
}
