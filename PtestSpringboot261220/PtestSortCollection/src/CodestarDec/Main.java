package CodestarDec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<listtest>Abc= new ArrayList<>();
        Abc.add(new listtest(1,"BPtest"));
        Abc.add(new listtest(3,"APtest2"));
        Abc.add(new listtest(2,"CPtest3"));
        Collections.sort( Abc ,(u,v) -> u.getId() - v.getId());

        Collections.sort(Abc, new Comparator<listtest>() {
            @Override
            public int compare(listtest o1, listtest o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


        for(listtest a : Abc){
            System.out.println("ID : " + a.getId() + "\n" + "Name : " + a.getName());
        }


    }



        }







