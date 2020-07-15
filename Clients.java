package com.citycard.clients;

import java.util.Objects;

public class Clients {
    private  int id;
    private  String firstName;
    private  String lastName;
    private  String cardNumber;
    private  int cardBalance;
    private  Status status;
    private  UserRole role;

    public Clients(int id, String firstName, String lastName, String cardNumber, int cardBalance, Status status, UserRole role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
        this.status = status;
        this.role = role;
    }



    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public Status getStatus() {
        return status;
    }

    public UserRole getRole() {
        return role;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clients clients = (Clients) o;
        return id == clients.id &&
                Double.compare(clients.cardBalance, cardBalance) == 0 &&
                Objects.equals(firstName, clients.firstName) &&
                Objects.equals(lastName, clients.lastName) &&
                Objects.equals(cardNumber, clients.cardNumber) &&
                status == clients.status &&
                role == clients.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, cardNumber, cardBalance, status, role);
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardBalance=" + cardBalance +
                ", status=" + status +
                ", role=" + role +
                '}';
    }
}
