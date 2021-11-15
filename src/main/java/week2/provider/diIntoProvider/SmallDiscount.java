package week2.provider.diIntoProvider;

public class SmallDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.05D;
    }

}
