package week2.provider.providedbyAnnotation;


public class NoDiscount implements Discountable{

    @Override
    public double getDiscount() {
           return 0.0D;
    }
    
}
