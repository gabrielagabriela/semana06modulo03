package org.example;

class NewPaymentProcessorAdapter implements PaymentProcessor {
    private NewPaymentProcessor newProcessor;

    public NewPaymentProcessorAdapter(NewPaymentProcessor newProcessor) {
        this.newProcessor = newProcessor;
    }

    @Override
    public void processPayment(double amount) {
        newProcessor.processNewPayment(amount);
    }
}