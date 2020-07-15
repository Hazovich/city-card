package com.citycard.clients;

public class Admin extends Clients {
    public Admin(int id, String firstName, String lastName, String cardNumber, int cardBalance, Status status, UserRole role) {
        super(id, firstName, lastName, cardNumber, cardBalance, status, role);
    }
}
