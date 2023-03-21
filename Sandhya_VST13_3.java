import java.util.Scanner;

public class Sandhya_VST13_3 {
    String name; int roll; int scl; int math; int comp; int eng; int oriya; int ss; int total; double average; double percent; String grade;
    Sandhya_VST13_3()
    {
        name = "";
        roll = 0;
        scl = 0;
        math = 0;
        comp = 0;
        eng = 0;
        oriya = 0;
        ss = 0;
    }
    void input()
    {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter name and roll no: ");
        name = ad.nextLine();
        roll = ad.nextInt();
        System.out.println("Enter marks: ");
        scl = ad.nextInt();
        math = ad.nextInt();
        comp = ad.nextInt();
        eng = ad.nextInt();
        oriya = ad.nextInt();
        ss = ad.nextInt();
    }
    void calculate()
    {
        total = scl + math + comp + eng + oriya + ss;
        average = total/6.0;
        percent = (total/600.0)*100.0;
        if(percent>=85.0)
            grade = "A";
        else if (percent>=70.0&&percent<=84.0)
                grade = "B";
        else if(percent>=60.0&&percent<=69.0)
            grade = "C";
        else grade = "FAIL";
    }
    void display()
    {
        System.out.println("  NAME \t    ROLL \t    TOTAL \t PERCENTAGE \t GRADE");
        System.out.println(name+"\t "+roll+" \t "+total+" \t"+percent+"\t "+grade);
    }
    public static void main(String[] args) {
        Sandhya_VST13_3 ob = new Sandhya_VST13_3();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
