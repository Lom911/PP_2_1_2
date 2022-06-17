import java.util.*;
import java.lang.Exception;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите выражение: ");
        Scanner input = new Scanner(System.in);
        String exp1 = input.nextLine();
        input.close();
        String[] exp = exp1.split(" ");
        if (exp.length != 3) throw new Exception("Введено более 2х значений"); // проверка на количество символов
        int x = -1;
        int y = -1;
        int[] arab = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] rim = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean uslRim1 = false;
        boolean uslRim2 = false;
        for (int i = 0; i < rim.length; i++) {
            if (exp[0].equals(rim[i])) {
                x = arab[i];
                uslRim1 = true;
            }
            if (exp[2].equals(rim[i])) {
                y = arab[i];
                uslRim2 = true;
            }
        }
        String znak1 = exp[1];                                      // определяем математический знак
        if ((uslRim1) && (uslRim2)) {   // Римский Калькулятор
        RimGo resultr = new RimGo();
        resultr.x = x;
        resultr.y = y;
        resultr.znak1 = znak1;
        resultr.rim = rim;
        resultr.arab = arab;
            resultr.summ();
    } else if (((!uslRim1) && (!uslRim2)) || (x == 0) || (y == 0))  {                                        // Арабский калькулятор
            int x1 = Integer.parseInt(exp[0]);
            int y1 = Integer.parseInt(exp[2]);
            if ( x1 < -10 || x1 > 10 || y1 < -10 || y1 > 10)
                throw new Exception("Введите значение от -10 до 10");
            ArabGo resultr = new ArabGo();
            resultr.x1 = x1;
            resultr.y1 = y1;
            resultr.znak1 = znak1;
            resultr.summ();
        }
        else
             throw new Exception("Не корректное значение");
    }
}