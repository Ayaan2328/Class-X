public class TechNumber {
    public static void main(String[] args) {
        int i, j, a, b;
        for(i = 1000; i<=9999; i++)
        {
            a = i/100;
            b = i%100;
            if(Math.pow((a+b),2)==i)
            {
                System.out.println(i);
                a=0;
                b=0;
        }
        }
    }
}
