class student{
    int roll_no;
    String name;
    int age;

    student()  //default construction
    {
        age =22;
    }
    student(int r , String n , int c)  //parameterized constructor
    {
        this.roll_no=r;
        this.name=n;
        this.age=c;
    }
    student( student s2)  //cpoy constructor
    {
        this.roll_no=s2.roll_no;
        this.name=s2.name;
        this.age=s2.age;
    } 
}
public class day1 {

    public static void main(String[] args) {
        
        student s1 = new student(); 
        s1.roll_no=1;
        s1.name= "aman";

        student s2 = new student (23,"chutiya",22);
        student s3 = new student(s2);
        
        System.out.println(s3.roll_no);
        System.out.println(s3.name);
        System.out.println(s3.age);
    

    }
    
}
