package com.citycard.clients;

import java.util.*;

public class ClientBase <T extends Clients> {

    private String name;
    private int clientNumber;
    private List<T> clients = new ArrayList<>();

    public ClientBase(String name, int clientNumber) {
        this.name = name;
        this.clientNumber = clientNumber;
    }

    public String getName() {
        return name;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public List<T> getClients() {
        return clients;
    }

    public boolean addClient (T client){
        return clients.add(client);
    }

}
