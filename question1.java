class circle{

    double radius;
    void calculatearea()
    {
        double area = 3.14*radius*radius;
        System.out.println("area of  circle"+" = "+ area);

    }
    void circumference()
    {
        double circumference = 2*3.14*radius;
        System.out.println("circumference of circle" + " = "   +circumference);
    }


}



public class question1 {

    public static void main(String[] args) {

        circle c1 = new circle();
        c1.radius=7;
        c1.calculatearea();
        c1.circumference();
        

        
        
    }




    
}
