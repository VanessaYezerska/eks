public class Main {
    public static void main(String[] args) {
     One one = new One(1,2,3);
     Two two = new Two(4,5,6);
     Three three = new Three(7,8,9);

     one.method1();
     one.method2();
     two.method3();
     two.method4();
     three.method5();
     three.method6();
     System.out.println(one.methodArifm());
     System.out.println(two.methodArifm());
     System.out.println(three.methodArifm());

    }

}
