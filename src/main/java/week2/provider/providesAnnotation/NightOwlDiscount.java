package week2.provider.providesAnnotation;


public class NightOwlDiscount implements Discountable{

    @Override
    public double getDiscount() {
        return 0.35D;
    }
    
}
