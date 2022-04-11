package com.project;

public class Account {
    private int id;
    private Customer customer;
    private float balance = 0;

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Account(int id, Customer customer, float balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
