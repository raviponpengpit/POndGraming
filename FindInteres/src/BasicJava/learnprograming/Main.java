package BasicJava.learnprograming;

public class Main {

    public static void main(String[] args) {
	double money = 50000;
	double interes = (1.25/100) * money ;
	int year = 0 ;
	while(year <= 5){
        System.out.println("Year" + year + " = " + money);
        money = money+interes ;
        year++;
    }
    }
}
