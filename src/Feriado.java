import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.midi.VoiceStatus;

public class Feriado {
  Boolean holiday = false;

  private String name;
  private String date;

  public Feriado(String name, String date) {
    this.name = name;
    this.date = date;
  }

  public Feriado(List<Feriado> feriados) {
    this.checkHoliday(date, feriados);
  }

  public void checkHoliday(String date, List<Feriado> feriados) {

    for (int i = 0; i < feriados.size(); i++) {
      if (feriados.get(i).getDate().equals(date)) {
        holiday = true;
        System.out.println("Feriado: " + feriados.get(i).getName() + " => " + feriados.get(i).getDate());

        Scanner input = new Scanner(System.in);
        System.out.println("Gostaria de ver nossa lista de feriados? Sim ou Não");
        String answer = input.nextLine();

        if (answer.equals("Sim") || answer.equals("sim")) {
          for (int j = 0; j < feriados.size(); j++) {
            System.out.println(feriados.get(j).name + " => " + feriados.get(j).date);
          }
        }
      }
    }

    new Timer().schedule(new TimerTask() {
      @Override
      public void run() {
        if (!holiday) {
          System.out.println("Não existe feriado nesta data!");

          Scanner input = new Scanner(System.in);
          System.out.println("Gostaria de ver nossa lista de feriados? Sim ou Não");
          String answer = input.nextLine();

          if (answer.equals("Sim") || answer.equals("sim")) {
            for (int i = 0; i < feriados.size(); i++) {
              System.out.println(feriados.get(i).name + " => " + feriados.get(i).date);
            }
          }
        }
      }
    }, 500);

  }

  public String getName() {
    return this.name;
  }

  public String getDate() {
    return this.date;
  }
}