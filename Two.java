public class Two extends One{
    public Two(int a, int b, int c) {
        super(a, b, c);
    }
    public void method3() {
        System.out.println("Це метод: " + a);
    }
    public void method4() {
        System.out.println("Це метод: " + b);
    }
    double methodArifm(){
        return(a + b)/2;
    }
}
