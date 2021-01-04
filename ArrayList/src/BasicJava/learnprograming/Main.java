package BasicJava.learnprograming;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Video> data = new ArrayList<Video>();
        data.add(new Video("v1", 4));
        data.add(new Video("v2", 5));
        data.add(new Video("v3", 6));
        data.add(new Video("v4", 7));
        data.add(new Video("v5", 8));
        data.add(new Video("v6", 9));
        data.add(new Video("v7", 10));
        int count = 0;
        for (Video datas : data) {
            System.out.println(datas.name + " GG " + datas.rating);
            if(datas.rating >= 6){
                count++;
            }
        }
        System.out.println(count);

    }

}
    class Video {
        Video(String name, int rating) {
            this.name = name;
            this.rating = rating;


        }
        String name;
        int rating;




    }

    


