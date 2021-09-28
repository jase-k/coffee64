public class TestApp{
    public static void main(String args[]){

        Item item1 = new Item("banana", (float) 2);
        Item item2 = new Item("coffee", (float) 1.5);
        Item item3 = new Item("latte", (float) 4.5);
        Item item4 = new Item("capuccino", (float) 3);
        Item item5 = new Item("muffin", (float) 4);

        
        System.out.println("Please Enter Your Customer Name for a New Order: ");
        String orderName = System.console().readLine();
        Order order1 = new Order(orderName);

        Item.printMenu();
        System.out.println("Type the number of the item, you'd like to add to your order. ('c' to confirm order)('q' to quit order)('r' to restart Order)");
        String id = "";
        while(id != "c" && id != "c" && id != "r"){
            id = System.console().readLine();

            if(!id.equals("c") && !id.equals("q") && !id.equals("r")){
                order1.addToOrder(id);
            }
            else if(id.equals("c")){
                order1.display();
                break;
            }
            else if( id.equals("q")){
                System.out.println("Order Not Saved");
                break;
            }
            else if( id.equals("r")){
                order1.clear();
            }
        }
        

    }
}