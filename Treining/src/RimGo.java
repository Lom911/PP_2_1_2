public class RimGo {
    int[] arab;
            String[] rim;
                    int x = 0;
                 int t = 0;
                int y = 0;
                int summ = 0;
                int k = 0;
                String znak1;
                String resul;
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
             if (summ <= 0) {
                 throw new Exception("В Римских числах нет 0");
             }

             if (summ == 100) {
                 System.out.println("C");
                 System.exit(1);
             }
             if (summ <= 10)
                 for (int i = 0; i < arab.length; i++)
                     if (summ == (arab[i])) {
                         System.out.println(String.join("", rim[i]));
                         System.exit(1);
                     }
             k = summ / 50;
             if (k > 0) {
                 resul = "L";
                 summ = summ - (50 * k);
             }
             for (int j = 0; j < 4; j++) {
                 t = summ / 10;
                 if ((t > 0) && (j == 0) && (k == 0)) {
                      resul = "X";
                     summ = summ - 10;
                 }
                 if ((t > 0) && (j > 0)){
                     resul = resul + "X";
                     summ = summ - 10;
                 }
             }
             for (int i = 0; i < arab.length; i++)
                 if (summ == (arab[i])) {
                     resul = resul + String.join ("", rim[i]);
                        }
        System.out.println(resul);
         }
}