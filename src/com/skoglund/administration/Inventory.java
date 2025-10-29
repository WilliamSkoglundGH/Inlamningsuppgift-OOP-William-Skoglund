package com.skoglund.administration;

import com.skoglund.entity.Member;
import com.skoglund.entity.Rental;
import com.skoglund.entity.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Item> clubItems;
    //Lista med alla items i klubben, oavsett uthyrning, vad har klubben för items
    //Lista med alla pågående uthyrningar
    //Historik av alla uthyrningar(någonsin) uthyrningar + återlämningar + datum för de

    public Inventory(){
        clubItems = new ArrayList<>();
    }

    public void addItem(Item item){
        clubItems.add(item);
    }

    public void removeItem(Item item){
        clubItems.remove(item);
    }
}
