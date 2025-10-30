package com.skoglund.administration;

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

    public void showItemInfo(){
        for(Item item : clubItems){
            item.showItemInfo();
        }
    }
    public Item getItemFromInventory(String itemType){
        for(Item item : clubItems){
            if(item.getType().equalsIgnoreCase(itemType)){
                return item;
            }
        }
        return null;
    }
}
