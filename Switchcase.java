// Java Program to check the size
// using the switch...case statement

class Switchcase {
    public static void main(String[] args) {

        int number = 29;
        String size = "";

        // switch statement to check size
        switch (number) {

            case 29:
                size = "Small";

            case 42:
                size = "Medium";

            // match the value of week
            case 44:
                size = "Large";

            case 48:
                size = "Extra Large";
                

        }
        System.out.println("Size: " + size);
    }
}