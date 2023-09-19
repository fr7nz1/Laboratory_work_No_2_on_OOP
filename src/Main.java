import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static <b> void main(String[] args) {
        String regex = "#([a-fA-F_0-9]{6})";
        String str = "";

        while (true)
        {
            System.out.print("Введите цвет HEX (Например: #FFFFFF): ");
            Scanner sc = new Scanner(System.in);
            try {
                str = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.print("Ошибка!\n");
            }
        }

        Pattern p1 = Pattern. compile (regex);
        Matcher m1 = p1.matcher(str);
        while (m1.find()){
            System.out.println("HEX: " + m1.group());
        }
    }
}