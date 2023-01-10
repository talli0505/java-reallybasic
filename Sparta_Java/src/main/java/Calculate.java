class Calculation {
    int add(int x, int y) {
        return x + y;
    }

    int subtract(int x, int y) {
        return x - y;
    }

}

class Calculate {
    String adding(String x, String y) {
        return x + y;
    }
}

public class practice {
    public static void main(String[] args) {
        Calculation calculation =new Calculation();
        Calculate calculate = new Calculate();
        int addResult = calculation.add(5,3);
        int subtractResult = calculation.subtract(5,3);
        String addResult2 = calculate.adding("고구마", "감자");
    }
}
