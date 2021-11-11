package week1.googleGuice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import week1.googleGuice.module.AppModule;

public class GoogleGuiceDemo {
    private static final String SQU_REQ = "SQUARE";

    public static void main(String[] args) {
        sendRequest(SQU_REQ);
    }

    public static void sendRequest(String req) {
        if (req.equals("SQUARE")) {
            DrawShape drawShape = new DrawSquare();
            SquareRequest request = new SquareRequest(drawShape);
            request.makeRequest();

            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest squareRequest = injector.getInstance(SquareRequest.class);
            squareRequest.makeRequest();

        }
    }
}


