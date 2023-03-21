import java.util.Arrays;

public class Array_Sum {
    public void loop() {
        int i, s=0;
        int a[] = {10, 20, 30, 40, 50, 60};
        for(i = 0; i<6; i++) {
            s = s+a[i];
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Array_Sum ob = new Array_Sum();
        ob.loop();
    }
}