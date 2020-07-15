package com.citycard.clients;

import java.util.ArrayList;
import java.util.List;

public class Base {

    private List<Clients> client = new ArrayList<>();
    private List<ClientBase> base = new ArrayList<>();

    public <T extends Clients> void addBase(ClientBase<T> cliBase){
        base.add(cliBase);
    }

    public List<Clients> getClient() {
        return client;
    }

    public List<ClientBase> getBase() {
        return base;
    }
}
