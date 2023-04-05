public class Fibonacci {
    static int n=21;
    // intilize the first two number of sequance
    static int a=1;
    static int b=1;
    // print first two no
    public static void main(String[] args) {
        System.out.println(a +""+ b +"");
        for (int i = 3; i <=n ; i++)
        {
              int c = a+b;
            System.out.println("fibonacci number:-" + c);
            a=b;
            b=c;
        }
    }
}
