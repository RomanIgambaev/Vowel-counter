import java.util.Scanner;

public class Main {
    static int vowelCounter(String word) {
        int vowelCount = 0;
        String vowels = "aeiou";
        for (char letter : word.toLowerCase().toCharArray()) {
            if (vowels.contains(String.valueOf(letter))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String userWord = scanner.nextLine();
        System.out.println("Количество гласных букв: " + vowelCounter(userWord));
    }
}