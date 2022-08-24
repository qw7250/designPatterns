package behavioral.chainofresposibility;

public interface DispanceChain {
    void setNextChain(DispanceChain nextChain);
    void dispance(Currency currency);
}
