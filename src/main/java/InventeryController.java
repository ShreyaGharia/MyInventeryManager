package main.java;

import main.java.Dao.Item;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class InventeryController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String ADD = "/add.jsp";
    //private static String LIST="/view.jsp";
    private static String HOME="/index.jsp";
    private SqliteConnector sqliteConnector;

    public InventeryController(){
        super();
        sqliteConnector=new SqliteConnector();
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Item item=new Item();
        String id = request.getParameter("id");
        item.setItem_id(Integer.parseInt(id));
        String itemName = request.getParameter("itemName");
        item.setItem_name(request.getParameter("itemName"));
        String units = request.getParameter("units");
        item.setUnits(Integer.parseInt(units));
        sqliteConnector.insertItem(item.getItem_id(),item.getItem_name(),item.getUnits());
        response.sendRedirect(HOME);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*Item item1=new Item();
        ArrayList<Item> itemArrayList=new ArrayList<Item>();
     itemArrayList= sqliteConnector.getItemList();
        int j = 0;
        while (itemArrayList.size() > j) {
            itemArrayList.get(j);
            j++;
        }*/
    }
    }

