package com.citycard.mainmenu;

import com.citycard.clients.Base;
import com.citycard.clients.Clients;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

//Main menu in app

public class MainMenu {

    public static void choose() throws InputMismatchException, IOException{
        Base base = new Base();

        //Message in main menu

        System.out.println("Please enter an option: \n\n'1' for replenish account\n'2' for see yor balance\n'3' for exit");
        Scanner valueIn = new Scanner(System.in);
        boolean continueLoop = true;
        int switchCase = valueIn.nextInt();
        do {
            switch (switchCase) {
                case 1:
                    try {

                        //Deposit in a base

                        Formatter file = new Formatter("deposit.txt");
                        System.out.println("Please enter a value");
                        file.format("%s", valueIn.nextInt());
                        System.out.println("Thank you. Your deposit will be processed in ten (10) minutes.");
                        continueLoop = false;
                        file.close();
                        break;
                    } catch (InputMismatchException | IOException e) {
                        System.out.println("Exception" + e);
                        valueIn.nextLine();
                        System.out.println("You enter incorrect value. Try again.");
                        break;
                    }
                case 2:

                    //Looking for deposit in a base

                    System.out.println("Your deposit account is: ");
                    break;
                case 3:

                    //End of an app

                    System.out.println("Bye Bye");
                    valueIn.close();
                    break;
            }
        } while (continueLoop);
    }
}

