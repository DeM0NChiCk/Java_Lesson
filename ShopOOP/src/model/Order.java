package model;

public final class Order {
    // TODO: дополнить
    private String address;
    private Buyer buyer;
    private String username;

    public Order(String address, Buyer buyer) {
        this.address = address;
        this.buyer = buyer;
        this.username = buyer.getUsername();
    }
}
