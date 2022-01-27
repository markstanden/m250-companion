public class CustomerService
{
    private Order[] orders;

    public CustomerService(int n)
    {
        orders = new Order[n];
        orders[0] = new Order(21.50,"Lindsey");
        orders[1] = new Order(34.27,"Anton");
        orders[2] = new Order(12.32,"Mustafa");
    }

    // Write your method below

    /**
     * prints out the names, one per line,
     * of any account holders who have an
     * invoice amount of more than amount provided
     * @param amount lower invoice amount limit
     */
    public void printNamesInvoicesMoreThan(double amount){
        System.out.println("No invoices over " + amount);
    }
}