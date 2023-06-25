package SingleResponsibility;

public class InvoiceDao {
    private  Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        Invoice invoice = this.invoice;
    }
}
