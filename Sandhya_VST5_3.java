import java.util.Scanner;

public class Sandhya_VST5_3 {
    int year, month, week, days; int sum;
    Sandhya_VST5_3(int y, int m, int w, int d)
    {
        year = y;
        month = m;
        week = w;
        days = d;
    }
    void calculate()
    {
        sum = (365*year)+(30*month)+(7*week)+days;
    }
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
    }
}
