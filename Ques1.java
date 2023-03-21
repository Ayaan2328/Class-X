public class Ques1 {
    public static void main(String[] args) {
        String a = "January 26 is celebrated as the Republic Day of India.";
        String b = a.replace("January 26","August 15");
        String c = b.replace("Republic Day","Independence Day");
        System.out.println("Old String: "+a);
        System.out.println("New String: "+c);
    }
}