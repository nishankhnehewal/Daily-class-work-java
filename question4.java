class student{
    static int count=0;
    student(){
        count++;
    }

    static void displaycount(){
        System.out.println("student object created "+" - "+ count );

    }    

}




public class question4 {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        student s3=new student();
       
        student.displaycount();
    }
    
}
