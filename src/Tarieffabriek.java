public class Tarieffabriek {
    public static void main(String[] args) throws ArithmeticException {
        Belastingtarief bt = new Belastingtarief();
        boolean success = false;
        while (!success) {
            try {
                bt.produceerBelastingTarieven();
                success = true;
            } catch (ArithmeticException e) {
                System.out.println("Mislukt: " + e.getMessage());
            }
        }
    }
}
