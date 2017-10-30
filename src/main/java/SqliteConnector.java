package main.java;

import main.java.Dao.Item;

import java.sql.*;
import java.util.ArrayList;

public class SqliteConnector {

    Connection c= null;
    Statement stmt= null;
    Item item;

    SqliteConnector(){
        try{
             Class.forName("org.sqlite.JDBC");
            c= DriverManager.getConnection( "jdbc:sqlite:C:\\Softwares\\MyInventeryManager\\MyInventeryManager.sqlite");
            System.out.print("db connected!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Item> getItemList(){
        ArrayList<Item> items =new ArrayList<Item>();
        try {
            this.stmt=c.createStatement();
            ResultSet resultSet=stmt.executeQuery("SELECT * FROM Item");

            while(resultSet.next()){
                Item item=new Item();
                item.setItem_id(resultSet.getInt("Item_id"));
                String Item_name =resultSet.getString("Item_name");
                item.setItem_name(Item_name);
                int unit=resultSet.getInt("Units");
                item.setUnits(unit);
                System.out.println("Item_id "+item.getItem_id() +" Item_name "+item.getItem_name()+" Units"+item.getUnits());
                items.add(item);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return items;
    }


    public void insertItem(int id,String Item_name,int units){
        try{
            System.out.println("id "+id+ " Item_name "+Item_name+ " units "+units);
            String sql = "INSERT INTO Item (Item_id,Item_name,Units) VALUES (?,?,?) ";
            PreparedStatement preparedStatement=c.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,Item_name);
            preparedStatement.setInt(3,units);
            preparedStatement.executeUpdate();
        }
        catch(Exception e){
            e.getMessage();
        }
    }
}