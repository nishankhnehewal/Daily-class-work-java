class student{
    private int roll_no;
    void setroll_no(int roll_no)
{
    this.roll_no = roll_no;
}
    
    int getroll_no()
{
    return roll_no;
}

}

public class access {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setroll_no(2);
        System.out.println("s1 student roll is -" +s1.getroll_no()); 
        
    }
    
}

