/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali
 */
public class GuestsList {

    public static void main(String[] args) {

        //TODO Replace the ?? by the proper code to create an ArrayList of String
        List<String> guests = new ArrayList<>();

        //TODO Add Joey, Martin and Marie to the list
        guests.add("Joey");
        guests.add("Martin");
        guests.add("Marie");
        //TODO Complete the following statement by replacing the ?? to display the size of the list
        System.out.println("GuestsList size: " + guests.size());

        //TODO Replace Martin with John in the list
        guests.set(1, "John");

        //TODO Remove Joey from the list
        guests.remove(0);

        //Print the content of the list
        System.out.println("The guests are:");
        guests.stream().forEach((guest) -> {
            System.out.println(guest);
        });
    }

}
