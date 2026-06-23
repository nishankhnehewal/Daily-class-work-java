class Student{
    int s1,s2,s3,s4,s5;

    void calculatepercentage()
    {
        double percentage= (s1+s2+s3+s4+s5)*100/500;
        
        System.out.println("percentage" +" - "+ percentage);

    }
}

public class question3 {
    public static void main(String[] args) {
        Student S1 = new Student();

        S1.s1=80;
        S1.s2=55;
        S1.s3=88;
        S1.s4=77;
        S1.s5=97;
        S1.calculatepercentage();
    }
    
}
