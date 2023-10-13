public class main {
    public static void main(String[] args) {
        String x = "water";
        String y = "sugar";

        String temp; //used to temporarly store variable to swap values

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);


    }
}
