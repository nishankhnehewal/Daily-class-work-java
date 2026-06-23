class student{

    private int age;     //step 1 make private varibles

    public void setterage(int age)   //step 2 provide public setter method
    {   
        this.age=age;

    }

    public int getterage()     //step3 provide public getter method
    {
        return age;
    }

}


public class enapsulation {
    public static void main(String[] args) {
        student s1 = new student();


        s1.setterage(22);
        System.out.println("student age is" + s1.getterage());
    }
    
}
