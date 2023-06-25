package DependencyInversion;

public class MacBook {
    private final WiredKeyboard wiredKeyboard;

    public MacBook(WiredKeyboard wiredKeyboard) {
        this.wiredKeyboard = wiredKeyboard; //no
    }
    // private   Keyboard keyboard;//yes

//    public MacBook(Keyboard keyboard) {
//        this.keyboard = keyboard;
//    }
}
