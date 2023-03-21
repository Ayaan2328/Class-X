import java.util.Scanner;

public class String_SmallestLargestChar {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = ad.nextLine();
        int i, j; char ch;
        char max = a.charAt(0), min = a.charAt(0);
        for(i = 0; i<a.length(); i++) {
            if(a.charAt(i)>max)
                max = a.charAt(i);
            if(a.charAt(i)<min)
                min = a.charAt(i);
        }
        System.out.println("SMALLEST CHARACTER: "+min);
        System.out.println("LARGEST CHARACTER: "+max);
    }
}
