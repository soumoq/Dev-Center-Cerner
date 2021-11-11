package week1.googleGuice;

import javax.inject.Inject;

public class SquareRequest {
    private DrawShape drawShape;

    @Inject
    SquareRequest(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    public void makeRequest() {
        drawShape.draw();
    }
}