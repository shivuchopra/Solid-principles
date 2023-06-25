package SingleResponsibility;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    //three reasons to change
    public int calculateTotal(){
        int price = ((marker.getPrice()) * this.quantity);
        return price;
    }

//    public void printInvoice(){
//
//    }
//
//    public void saveToDB(){
//
//    }
}
