import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner input =  new Scanner(System.in);
      System.out.println("Digite uma data e checaremos se é feriado ou não");
      String date = input.nextLine();

      Holiday holiday = new Holiday();
      holiday.checkHoliday(date);
    }
}
