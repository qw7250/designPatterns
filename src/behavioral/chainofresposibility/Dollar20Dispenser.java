package behavioral.chainofresposibility;

public class Dollar20Dispenser implements DispanceChain{
        private DispanceChain chain;

        @Override
        public void setNextChain(DispanceChain nextChain){
        this.chain = nextChain;
    }
        @Override
        public void dispance(Currency currency){
        if(currency.getAmount() >=20){
            int num = currency.getAmount()/20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispansing" + num + "20$ note");
            if(remainder != 0){
                this.chain.dispance(new Currency(remainder));
            }
            else{
                this.chain.dispance(currency);
            }
        }
    }
}

