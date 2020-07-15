package com.citycard;

import com.citycard.clients.*;
import com.citycard.mainmenu.MainMenu;
import com.citycard.mainmenu.MaskCard;

import java.io.IOException;

public class CityCard implements MaskCard {

    public static void main(String[] args) throws IOException {
        Base base = new Base();
        ClientBase<VIP> vipClientBase = new ClientBase<>("VIP Base", 10);
        ClientBase<Admin> adminClientBase = new ClientBase<>("Admin Base", 15000);
        ClientBase<Clients> clientBase = new ClientBase<>("Clients", 250000);

        Clients clients = new Clients(1, "Denis", "Drannikov", MaskCard.maskCardNumber("1234-1234-1234-1234", "##xx-xxxx-xx##-####"),1000, Status.ONLINE,UserRole.ADMIN);
        System.out.println(clients);
        MainMenu.choose();



    }
}

