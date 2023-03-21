import java.util.Scanner;

public class ConstructorOverload {
    int str, max, min;
    ConstructorOverload()
    {
        str = 0;
        max = 0;
        min = 0;
    }
    public void input()
    {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter number: ");
        str = ad.nextInt();
    }
    public void calcmaxmin()
    {
        int a;
        min = str%10;
        while(str>0)
        {
            a = str%10;
            if(a>max)
                max = a;
            if(a<min)
                min = a;
            str/=10;
        }
    }
    public void display()
    {
        System.out.println(str+"\tHighest Digit = "+max+"\tLowest Digit = "+min);
    }

    public static void main(String[] args) {
       ConstructorOverload ob = new ConstructorOverload();
       ob.input();
       ob.calcmaxmin();
       ob.display();
    }
}
