import java.util.Scanner;

public class TextUI {
    private final Scanner scanner;
    private final SimpleDictionary dictionary;
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = this.scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye, bye!");
                break;
            }
            if (input.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                this.dictionary.add(word, translation);
                continue;
            }
            if (input.equals("search")) {
                System.out.println("To be translated:");
                String toTranslate = this.scanner.nextLine();
                String translation = this.dictionary.translate(toTranslate);
                if (translation == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                    continue;
                }
                System.out.println("Translation:");
                System.out.println(translation);
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
