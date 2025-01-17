package interfaces;

public interface Accountable<T, S> {
    T getId();
    S getSum();
    void setSum(S sum);
}
