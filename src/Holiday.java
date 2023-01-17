import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Holiday {
  Map<String, String> holidays = new HashMap<>();

  public Holiday() {
    createHolidays();
  }

  public void checkHoliday(String date) {
    String holiday = holidays.get(date);
    
    if(holiday == null) {
      Scanner value = new Scanner(System.in);
      System.out.println("Não existem feriados nesta data, gostaria de ver a lista de feriados? Sim ou Não");
      String response = value.nextLine();

      if(response.equals("Sim") || response.equals("Não")) {
        this.printHolidays();
      }
      
      return;
    }

    Scanner value = new Scanner(System.in);
    System.out.println("Esta data é " + holiday + ". Gostaria de ver a lista de feriados? Sim ou Não" );
    String response = value.nextLine();

    if(response.equals("Sim") || response.equals("Não")) {
      this.printHolidays();
    } else {
      return;
    }
  
  }

  public void printHolidays() {
    holidays.forEach((key, value) -> System.out.println("Date: " + key + " => " + value));
  }

  public void createHolidays() {
    holidays.put("01/01/2023", "Confraternização mundial");
    holidays.put("21/02/2023", "Carnaval");
    holidays.put("17/04/2023", "Páscoa");
    holidays.put("21/04/2023", "Tiradentes");
    holidays.put("01/05/2023", "Dia do Trabalho");
    holidays.put("08/06/2023", "Corpus Christi");
    holidays.put("07/092023", "Independência do Brasil");
    holidays.put("12/10/2023", "Nossa Senhora Aparecida");
    holidays.put("02/11/2023", "Finados");
    holidays.put("15/11/2023", "Proclamação da República");
    holidays.put("25/12/2023", "Natal");
  }
}