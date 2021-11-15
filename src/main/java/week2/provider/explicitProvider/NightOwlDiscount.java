package week2.provider.explicitProvider;

public class NightOwlDiscount implements Discountable{

    @Override
    public double getDiscount() {
        return 0.35D;
    }
    
}
