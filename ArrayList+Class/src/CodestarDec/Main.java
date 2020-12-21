package CodestarDec;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        data.add(new City("Bangkok",50000));

    }
}



class City {
    City(String name , int population){
        this.name = name;
        this.population = population;
    }

    String name ;
    int population;
}



