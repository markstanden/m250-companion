package C7.Quiz1.CustomerService;

public class Order {
    final private String accountName;
    final private double invoiceAmount;

    public Order(double invoiceAmount, String accountName){
        this.invoiceAmount = invoiceAmount;
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }
}
