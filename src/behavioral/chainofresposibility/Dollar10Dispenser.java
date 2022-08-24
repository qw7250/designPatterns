package behavioral.chainofresposibility;

public class Dollar10Dispenser implements DispanceChain{
    private DispanceChain chain;

    @Override
    public void setNextChain(DispanceChain nextChain){
        this.chain = nextChain;
    }
    @Override
    public void dispance(Currency currency){
        if(currency.getAmount() >=10){
            int num = currency.getAmount()/10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispansing" + num + "10$ note");
            if(remainder != 0){
                this.chain.dispance(new Currency(remainder));
            }
            else{
                this.chain.dispance(currency);
            }
        }
    }
}
