package org.example;

class OldPaymentProcessorAdapter implements PaymentProcessor {
    private OldPaymentProcessor oldProcessor;

    public OldPaymentProcessorAdapter(OldPaymentProcessor oldProcessor) {
        this.oldProcessor = oldProcessor;
    }

    @Override
    public void processPayment(double amount) {
        oldProcessor.makeOldPayment(amount);
    }
}
