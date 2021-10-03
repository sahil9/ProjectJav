package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    public ArrayList<String> groceryList = new ArrayList<String>();

    public void addToTheList(String item){
        groceryList.add(item);
    }
    public void showList(){
        int i=0;
        int position;
        if(groceryList.size()>0){
            for (String items: groceryList){
                position = i+1;
                System.out.println(position+": "+items);
                i++;
            }
        }else
            System.out.println("Grocery list is empty");

    }
    public void removeItem(int no){
        int position = no-1;
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(item+" removed from the list.");

    }
    public void searchItem(String item){
        if(groceryList.contains(item)){
            int no = groceryList.indexOf(item);
            int position = no+1;
            System.out.println("Item found and is at position: "+position);
        }else
            System.out.println("Item not found in the grocery list");
    }
    public void modifyItem(int no, String item){
        int position = no-1;
            groceryList.set(position,item);
            System.out.println("Item at "+no+" hsa been modified.");

    }


}
