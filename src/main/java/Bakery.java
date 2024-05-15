import java.util.ArrayList;

public class Bakery {

    //the abstract class

    //properties
    public String name;
    public ArrayList<Cakes>stock;


    //constructor
    public Bakery(String name){
       this.name = name;
       this.stock = stock;
    }


    //methods
    public String buyCake(){
        return "You have bought a cake";
    }

    public String hasStock(){
        return "This cake is available";
    }


}
