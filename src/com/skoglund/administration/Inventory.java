package com.skoglund.administration;

import com.skoglund.entity.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Item> clubItems;

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
    public void showAvailableItems(){
        if(amountOfAvailableItems() == 0){
            System.out.println("All utrustning är uthyrd!");
        }
        else{
            for(Item item : clubItems){
                if(item.isAvailable()){
                    item.showItemInfo();
                }
            }
        }
    }

    public void showRentedItems(){
        if(amountOfAvailableItems() == clubItems.size()){
            System.out.println("Ingen utrustning är uthyrd!");
        }
        else{
            for(Item item : clubItems){
                if(!item.isAvailable()){
                    item.showItemInfo();
                }
            }
        }
    }
    public int amountOfAvailableItems(){
        int amount = 0;
        for(Item item : clubItems){
            if(item.isAvailable()){
                amount++;
            }
        }
        return amount;
    }
}
