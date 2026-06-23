// class animal{
//     void eating()
//     {
//         System.out.println("hii nishankh");
//     }
// }
// class dog extends animal{
//     void barking()
//     {
//         System.out.println("how are you ");
//     }                                                 //multilevel inheritance
// }
// class cat extends dog{
//     void meow(){
//         System.out.println("meowww karo");
//     }

// }
// public class inheritance {
//     public static void main(String[] args) {
//         dog d1 = new dog();
//         cat c1 = new cat();
//         c1.barking();
//         d1.eating();
//         d1.barking();
//     }
// }








class animal{
    void eating()
    {
        System.out.println("hii nishankh");
    }
}
class dog extends animal{
    void barking()
    {
        System.out.println("how are you ");
    }                                                 //hierarchical inheritance
}
class cat extends animal{
    void meow(){
        System.out.println("meowww karo");
    }

}
public class inheritance {
    public static void main(String[] args) {
        dog d1 = new dog();
        cat c1 = new cat();
        c1.eating();
        c1.meow();
        d1.barking();
        d1.barking();
    }
}

