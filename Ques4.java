import java.util.*;
public class Ques4 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter string: ");
        String a = ad.nextLine();
        a = a + " ";
        a = a.trim() + " ";
        System.out.println("Enter word to be counted: ");
        String b = ad.nextLine();
        String c = "";
        int i, j=-1, k=0;
        for(i = 0; i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                c = a.substring(j+1,i);
                j = i;
            }
            if(b.equalsIgnoreCase(c)==true)
                k++;
            c = "";
        }
        System.out.println(k);
    }
}