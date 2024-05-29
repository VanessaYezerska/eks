public class Three extends One{
    public Three(int a, int b, int c) {
        super(a, b, c);
    }
    public void method5() {
        System.out.println("Це метод: " + a);
    }
    public void method6() {
        System.out.println("Це метод: " + b);
    }
    double methodArifm(){
        return(a + b + c)/3;
    }
}
