import java.util.Scanner;

class calc{
    public static int Add(int a,int b){
        return a+b;
    }
    public static int mul(int a,int b){
        return a*b;

    }

    public static int div(int a, int b){
        return a/b;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println(Add(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));
    }
}
