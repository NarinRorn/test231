// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

        import java.util.Scanner;

        public class StringManipulator {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("\nEnter a sentence:");
                    String sentence = scanner.nextLine();

                    System.out.println("\nMenu:");
                    System.out.println("1. Count the number of characters");
                    System.out.println("2. Count the number of words");
                    System.out.println("3. Convert to uppercase");
                    System.out.println("4. Convert to lowercase");
                    System.out.println("5. Exit");

                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            int charCount = sentence.length();
                            System.out.println("Number of characters: " + charCount);
                            break;
                        case 2:
                            int wordCount = sentence.split("\\s+").length;
                            System.out.println("Number of words: " + wordCount);
                            break;
                        case 3:
                            String uppercase = sentence.toUpperCase();
                            System.out.println("Uppercase: " + uppercase);
                            break;
                        case 4:
                            String lowercase = sentence.toLowerCase();
                            System.out.println("Lowercase: " + lowercase);
                            break;
                        case 5:
                            System.out.println("Exiting program...");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            }

        }




