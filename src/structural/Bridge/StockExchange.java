package structural.Bridge;

public class StockExchange extends Program {

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development in progress..");
        developer.writeCode();
    }
}
