package behavioral.chainofresposibility;

import java.util.Scanner;

public class Main {
    private DispanceChain c1;
    public Main(){
        this.c1 = new Dollar50Dispenser();
        DispanceChain c2 = new Dollar20Dispenser();
        DispanceChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
    public static void main(String[] args) {
        Main main = new Main();
        while (true){
            System.out.println("Enter amount two distance: ");
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            if(amount % 10 != 0){
                System.out.println("Amount should be in multiple of 10 DOllar: ");
                return;
            }
            main.c1.dispance(new Currency(amount));
        }
    }
}
