package CodestarDec;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mateo");
        names.add("GG");
        names.add("GGEZ");
        names.add("GGWP");
        System.out.println(names.size());
        System.out.println(names);

        for(String name : names){
            System.out.println(name);
        }

        int danyindex = names.indexOf("GG");
        System.out.println(danyindex);

        names.set(danyindex,"GG2");
        names.remove("Mateo");

        for(String name : names){
            System.out.println(name);
        }
        if(names.contains("GGEZ1")){
            System.out.println("No");
        }
        System.out.println("Index  is " + names.get(0));



    }
}
