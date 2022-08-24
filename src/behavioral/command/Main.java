package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Brocker brocker = new Brocker();
        brocker.takeOrder(buyStock);
        brocker.takeOrder(sellStock);

        brocker.placeOrders();
    }
}
