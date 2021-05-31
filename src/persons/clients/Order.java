package persons.clients;

import persons.clients.Client;

import java.time.LocalDate;

public class Order {
    private static int localID = 1;

    private int id;
    private Client client;
    private Cart cart;
    private LocalDate date;
    private float totalPaid;

    public Order() {
        this.id = localID;
        localID += 1;
    }

    public Order(Client client, Cart cart, float totalPaid) {
        this.id = localID;
        localID += 1;

        this.client = client;
        this.cart = cart;
        this.totalPaid = totalPaid;
    }

    //region GET/SET

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(float totalPaid) {
        this.totalPaid = totalPaid;
    }

    //endregion

    @Override
    public String toString() {
        return "ORDER: #" + this.id +
                "\nClient: " + this.client.getId() + this.client.getName() +
                "\nCart: " + this.cart +
                "\nDate: " + this.date +
                "\n----------------------------------------" +
                "\nTOTAL  =  " + this.totalPaid + "$";
    }
}
