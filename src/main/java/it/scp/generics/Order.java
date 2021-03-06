package it.scp.generics;

public class Order {
    private Customer customer;
    private Address billingAddress;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return customer.getName().getFirstName() + " " + customer.getName().getLastName() + " " +
                billingAddress.getCity() + " " + billingAddress.getStreet();
    }
}
