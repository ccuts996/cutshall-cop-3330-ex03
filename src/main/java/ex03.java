import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char singleQuotesChar = '"';

        String quote;
        System.out.print(" What is the quote:");

        quote = input.next();

        String name;
        System.out.print("Who said it?");

        name= input.next();

        System.out.print(name+ " says," + singleQuotesChar + quote + singleQuotesChar );
    }
}

