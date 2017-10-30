package main.java.Dao;

public class Item {

    int id;
    String item_name;
    int units;

    public int getItem_id() {
        return id;
    }

    public void setItem_id(int id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}
