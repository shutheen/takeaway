package persons.clients;

import persons.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client extends Person {

    private static int localID = 0;
    private int id;
    private boolean premium;
    private int ordersAmount;
    private List<Order> orders = new ArrayList();

    public Client() {
        super.setRegisteredDate(LocalDate.now());
        newID();
    }

    public Client(boolean active, String name, String phone, String email, String address, boolean premium) {
        super.setActive(active);
        super.setName(name);
        super.setPhone(phone);
        super.setEmail(email);
        super.setAddress(address);
        super.setRegisteredDate(LocalDate.now());
        newID();

        this.premium = premium;
    }

    //region GET/SET

    public int getId() {
        return id;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;

        Client client = (Client) o;

        return super.getPhone() == client.getPhone() &&
                super.getAddress() == client.getAddress();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime + result * Integer.valueOf(super.getPhone());
        result = prime + result * Integer.valueOf(super.getAddress());
        return result;
    }

    @Override
    public void newID() {
        this.id = localID + 2000;
        localID += 1;
    }

    @Override
    public String toString() {
        return
                "ID: " + id +
                        "\nName: " + super.getName() +
                        "\nPhone: " + super.getPhone() +
                        "\nE-mail: " + super.getEmail() +
                        "\nAddress: " + super.getAddress() +
                        "\nRegistered date: " + super.getRegisteredDate() +
                        "\nPremium: " + premium +
                        "\nOrders amount: " + ordersAmount;
    }
}
