package week2.googleGuice;

public class NightOwlDiscount implements Discountable {
    @Override
    public double getDiscount() {
        return 0.35;
    }
}
