public class ArabGo {
    int x1;
    int y1;
    String znak1;
    public void summ() throws Exception {
                 switch (znak1) {
                     case "+" -> System.out.print(String.valueOf(x1 + y1));
                     case "-" -> System.out.print(String.valueOf(x1 - y1));
                     case "/" -> {
                         if (y1 == 0) {
                             throw new Exception("На 0 делить нельзя");
                         } else
                             System.out.print(String.valueOf(x1 / y1));
                     }
                     case "*" -> System.out.print(String.valueOf(x1 * y1));
                     default -> throw new Exception("Не верный знак");
                 }
                 }
}


