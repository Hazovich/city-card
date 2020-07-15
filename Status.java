package com.citycard.clients;

public enum Status {
    ONLINE("ON"), OFFLINE("OFF");

    String status;

    Status(String status) {
        this.status = status;
    }
}
