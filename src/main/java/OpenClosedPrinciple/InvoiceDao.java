package OpenClosedPrinciple;

public interface InvoiceDao {
    public void saveToDb(Invoice invoice);
    public void saveToFile(Invoice invoice);
}
