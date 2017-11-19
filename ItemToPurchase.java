
/**
 * Created by JeffreyYang on 11/6/17.
 */
public class ItemToPurchase {
    private int itemPrice = 0;
    private int itemQuantity = 0;
    private String itemName = "none";


    public void setName(String s){
        itemName = s;
    }

    public String getName(){
        return itemName;
    }
    public void setPrice(int p){
        itemPrice = p;
    }

    public int getPrice(){
        return itemPrice;
    }

    public void setQuantity(int q){
        itemQuantity = q;
    }

    public int getQuantity(){
        return itemQuantity;
    }

}
