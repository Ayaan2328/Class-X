import java.util.Scanner;

public class Pronic {
    public int pro()
    {
       int num;
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = ad.nextInt();
        return(num);
    }

    public static void main(String[] args) {
        Pronic ob = new Pronic();
        int i, check=0,a=0,b=0;
        int z = ob.pro();
        for(i = 1; i<=z; i++)
        {
            if((i*(i+1))==z)
            {
                a = i;
                b = (i+1);
                check = 1;
            }
        }
        if(check==1)
        {
            System.out.println("NUMBER IS PRONIC");
            System.out.println(z+" = "+a+" * "+b);
        }
        else
            System.out.println("NOT A PRONIC NUMBER");
    }
}
