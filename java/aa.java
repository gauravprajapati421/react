import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
       String abbreviation = abbreviateName(fullName);
   System.out.println("Abbreviated name: " + abbreviation);
  }
public static String abbreviateName(String fullName) {
        String[] nameParts = fullName.split("\\s+"); 
 StringBuilder abbreviation = new StringBuilder();
 for (String part : nameParts) {
            if (!part.isEmpty()) {
                abbreviation.append(part.charAt(0)); 
                abbreviation.append('.');
            }
        }
 return abbreviation.toString();

}
}