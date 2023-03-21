public class Array {
    public void display() {
        int a[] = {10, 20, 30, 40, 50, 60};
        int i;
        for (i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Array ob = new Array();
        ob.display();
    }
}