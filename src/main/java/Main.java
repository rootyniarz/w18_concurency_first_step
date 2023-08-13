public class Main {
    public static void main(String[] args) {
        InvoiceNameGenerator invoiceNameGenerator = new InvoiceNameGenerator();
        InvoiceNameGenerator invoiceNameGenerator2 = new InvoiceNameGenerator();
        Thread firstThread = new InvoiceThread(invoiceNameGenerator);
        Thread secondThread = new InvoiceThread(invoiceNameGenerator2);
        firstThread.start();
        secondThread.start();
    }
}
