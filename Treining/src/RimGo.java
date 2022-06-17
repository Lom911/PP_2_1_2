public class RimGo {
    int[] arab;
            String[] rim;
                    int x = 0;
                 int t = 0;
                int y = 0;
                int summ = 0;
                String znak1;
    public void summ() throws Exception {
             switch (znak1) {
                 case "+" -> summ = x + y;
                 case "-" -> summ = x - y;
                 case "/" -> {
                     if (y == 0) {
                         throw new Exception("На 0 делить нельзя");
                     } else
                         summ = (x / y);
                 }
                 case "*" -> summ = x * y;
                 default -> throw new Exception("Не верный знак");
             }
             if (summ < 0) throw new Exception("Сумма меньше 0");
        if (summ == 0) {
            System.out.println("0");
            System.exit(1);
        }
             if (summ == 100) {
                 System.out.println("C");
                 System.exit(1);
             }
             if (summ <= 10)
                 for (int i = 0; i < arab.length; i++)
                     if (summ == (arab[i])) {
                         System.out.println(rim[i]);
                         System.exit(1);
                     }
             t = summ / 50;
             if (t > 0) {
                 System.out.print("L");
                 summ = summ - (50 * t);
             }
             for (int j = 0; j < 4; j++) {
                 t = summ / 10;
                 if (t > 0) {
                     System.out.print("X");
                     summ = summ - 10;
                 }
             }
             for (int i = 1; i < arab.length; i++)
                 if (summ == (arab[i])) {
                     System.out.print(rim[i]);
                 }
         }
}