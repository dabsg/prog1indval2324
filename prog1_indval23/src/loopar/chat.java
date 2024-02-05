package loopar;

import java.util.Scanner;

public class chat {
    public static void main(String[] args) {
        // Skapa en Scanner-objekt för att läsa inmatning från användaren
        Scanner scanner = new Scanner(System.in);
        
        // Be användaren mata in ett ord
        System.out.print("Ange ett ord: ");
        String word = scanner.nextLine();
        
        // Anropa metoden för att vända ordet och skriva ut det omvända ordet
        String reversedWord = reverseWord(word);
        System.out.println("Det omvända ordet är: " + reversedWord);
        
        // Stäng scanner-objektet
        scanner.close();
    }
    
    // Metod för att vända ett ord
    public static String reverseWord(String word) {
        // Skapa en StringBuilder-objekt för att lagra det omvända ordet
        StringBuilder reversed = new StringBuilder();
        
        // Loopa genom varje tecken i ordet, börja från sista tecknet och gå bakåt
        for (int i = word.length() - 1; i >= 0; i--) {
            // Lägg till tecknet i omvänd ordning till StringBuilder-objektet
            reversed.append(word.charAt(i));
        }
        
        // Returnera det omvända ordet som en sträng
        return reversed.toString();
    }
}
