package com.example.prac_14;
import java.util.Objects;
public class Item {
    String name, creationDate;int price ;
    public Item() {
    }

    public Item(String name, String creationDate,int price) {
        this.name = name;
        this.creationDate = creationDate;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDater() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) && Objects.equals(creationDate, item.creationDate) && Objects.equals(price, item.price);
    }

}
