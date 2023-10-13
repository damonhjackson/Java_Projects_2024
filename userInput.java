import java.util.Scanner;
public class userInput {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("what is your name? ");
                String name = scanner.nextLine();

                System.out.println("How old are you?");
                int age = scanner.nextInt();

                scanner.nextLine(); //used to clear scanner to not skip over next scanner

                System.out.println("what is your favorite food?");
                String food = scanner.nextLine();

                System.out.println("Hello " + name );
                System.out.println("you are " + age + " years old");
                System.out.println("you like " + food);
        }
}
