import java.util.ArrayList;

public class Order{
    private String name;
    private ArrayList<Item> items;

    public Order(String name){
        this.name = name;
        this.items = new ArrayList<>();
    }



    public void display(){
        System.out.printf("Order for %s \n", this.name);
        for(Item item : this.items){
            System.out.printf("%s - %.2f \n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: %.2f", this.getTotal());
    }

    public float getTotal(){
        float sum = (float) 0.0;
        for(Item item : this.items){
            sum += item.getPrice();
        }
        return sum; 
    }

    public void addToOrder(String id){
        int counter = 0; 
        try{
            int intId = Integer.parseInt(id);
            for(Item item : Item.fullmenu){
                if(counter == intId){
                    this.items.add(item);
                }
                counter++;
            }
        }
        catch(ClassCastException e){
            System.out.println("Please only use a Number value");
        }
    }

    public void clear(){
        this.items.clear();
        System.out.println("Order has been cleared!");
    }
}