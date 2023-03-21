import java.util.Scanner;

public class Sandhya_VST13_6 {
    public static void main(String[] args) {
        int i, j, t; String s;
        String name[] = new String[5];
        int mark[] = new int[5];
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter name and mark: ");
        for(i = 0; i<5; i++)
        {
            System.out.print("Name: ");
            name[i] = ad.next();
            System.out.print("Marks: ");
            mark[i] = ad.nextInt();
        }
        for(i = 0; i<5; i++)
        {
            for(j = 0; j<4; j++)
            {
                if(mark[j]>mark[j+1])
                {
                    t = mark[j];
                    mark[j] = mark[j+1];
                    mark[j+1] = t;

                    s = name[j];
                    name[j] = name[j+1];
                    name[j+1] = s;
                }
            }
        }
        System.out.println("NAME \t MARKS");
        for(j = 0; j<5; j++)
        {
            System.out.println(name[j]+" \t "+mark[j]);
        }
    }
}
