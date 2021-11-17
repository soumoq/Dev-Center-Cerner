package week2.assisted;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class RealPayment implements Payment {

    private boolean creditService;
    private boolean authService;
    private int hr;
    private int amount;

    @Inject
    public RealPayment(
            boolean creditService,
            boolean authService,
            @Assisted int hr,
            @Assisted int amount) {
        this.creditService = creditService;
        this.authService = authService;
        this.hr = hr;
        this.amount = amount;
    }


    @Override
    public void pay() {
        System.out.println(creditService + "\n" + authService + "\n" + hr + "\n" + amount);
    }
}
