public class ArabGo {
    int x1;
    int y1;
    String znak1;
    String result;
    public String summ() throws Exception {
        switch (znak1) {
            case "+" -> result = String.valueOf(x1 + y1);
            case "-" -> result = String.valueOf(x1 - y1);
            case "/" -> {
                if (y1 == 0) {
                    throw new Exception("На 0 делить нельзя");
                } else
                    result = String.valueOf(x1/y1);
            }
            case "*" -> result = String.valueOf(x1*y1);
            default -> throw new Exception("Не верный знак");
        }
        return result;
    }
}


