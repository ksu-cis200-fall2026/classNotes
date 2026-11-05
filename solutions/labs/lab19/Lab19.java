import java.util.*;

public class Lab19 {
    public static void main(String[] args) {
        //Want to store 5 shirt orders
        Shirt[] shirts = new Shirt[5];

        //1) regular shirt, lavender, 3
        shirts[0] = new Shirt(ShirtColor.Lavender);
        shirts[0].setCount(3);

        //2) polo shirt, purple, 5
        shirts[1] = new PoloShirt();
        shirts[1].setColor(ShirtColor.Purple);
        shirts[1].setCount(5);

        //3) button-up shirt, white, 4, long-sleeved
        ButtonUpShirt b = new ButtonUpShirt(ShirtColor.White);
        b.setCount(4);
        b.makeLongSleeved();
        shirts[2] = b;

        //4) button-up shirt, gray, 2, short-sleeved
        shirts[3] = new ButtonUpShirt(ShirtColor.Gray);
        shirts[3].setCount(2);

        //5) regular shirt, black, 10
        shirts[4] = new Shirt(ShirtColor.Black);
        shirts[4].setCount(10);

        //Want to print information (customization + order cost)
        for (int i = 0; i < shirts.length; i++) {
            System.out.println(shirts[i]);
        }
    }
}