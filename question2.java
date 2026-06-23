class Intrest{   
    double P , R , T;              
    void calculateSI(){
        double SI = P*R*T/100;
        System.out.println("Simple Intrest"+" - " + SI);
    }
}
public class question2 {
    public static void main(String[] args) {
        Intrest i1 = new Intrest();
        i1.P=5000; i1.R=10; i1.T=30;
        i1.calculateSI();

    }
    
}
