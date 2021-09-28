import java.util.ArrayList;

public class Item{
    private String name;
    private float price; 
    public static ArrayList<Item> fullmenu = new ArrayList<>(); 

    public Item(String name, float price){
        this.name = name;
        this.price = price;
        this.addToMenu(this);
    }

    private void addToMenu(Item item){
        fullmenu.add(item);
    }

    public static void printMenu(){
        System.out.printf("==============Menu===========\n");
        int counter = 0; 
        for(Item item : fullmenu){
            System.out.printf("%s %s -- $%.2f \n", counter, item.getName(), item.getPrice());
            counter++;
        }
    }

    public String getName(){
        return this.name;
    }

    public float getPrice(){
        return this.price;
    }
    
}