package week2.assisted;

public interface PaymentFactory {
    Payment create(int hr, int amount);
}
