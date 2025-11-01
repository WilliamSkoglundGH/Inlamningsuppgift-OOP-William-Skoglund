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
        for(Item item : clubItems){
            if(item.isAvailable()){
                item.showItemInfo();
            }
        }
    }

    public void showRentedItems(){
        for(Item item : clubItems){
            if(!item.isAvailable()){
                item.showItemInfo();
            }
        }
    }
}
