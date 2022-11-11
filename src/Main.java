public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.61;
        double m = 50;
        double Bmi = service.calculate(h, m);

        System.out.println("Индекс массы тела - " + Bmi);







    }
}
