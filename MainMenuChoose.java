package com.citycard.mainmenu;

public enum MainMenuChoose {
    ONE("Replenish Account"), TWO("Get Balance"), THREE("Exit");

    String mainMenu;
     MainMenuChoose(String mainMenu){
        this.mainMenu = mainMenu;
    }
}
