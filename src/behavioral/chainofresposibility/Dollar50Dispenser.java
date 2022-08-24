package behavioral.chainofresposibility;

public class Dollar50Dispenser implements DispanceChain{
        private DispanceChain chain;

        @Override
        public void setNextChain(DispanceChain nextChain){
        this.chain = nextChain;
    }
        @Override
        public void dispance(Currency currency){
        if(currency.getAmount() >=50){
            int num = currency.getAmount()/50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispansing" + num + "50$ note");
            if(remainder != 0){
                this.chain.dispance(new Currency(remainder));
            }
            else{
                this.chain.dispance(currency);
            }
        }
    }
    }
