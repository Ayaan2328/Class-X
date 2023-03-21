import java.util.*;
public class MockQues3 {
    String name;
    long adh;
    int day, fine;
    MockQues3()
    {
        name = "";
        adh = 0;
        day = 0;
        fine = 0;
    }
    public void accept()
    {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = ad.nextLine();
        System.out.print("Enter Aadhaar number : ");
        adh = ad.nextLong();
        System.out.print("Enter number of day taken to read the book : ");
        day = ad.nextInt();
    }
    public void compute()
    {
        int a = day-7;
        if(day<=7)
            fine = 0;
        else if (day > 7) {
            if((day-7)<=5)
                fine = (day-7)*2;
            else if(a>5&&a<=12)
                fine = 10+((12-a)*3);
            else if(a>12&&a<=21)
                fine = 10+21+((21-a)*4);
        }
    }
}
