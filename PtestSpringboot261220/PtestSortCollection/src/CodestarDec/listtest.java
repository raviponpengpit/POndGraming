package CodestarDec;

public class listtest {
    private int id ;
    private String name ;


    public void setId(){
    this.id = id ;
    }
    public void setName(){
        this.name = name ;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name ;
    }

    public listtest (int id,String name) {
        this.id = id ;
        this.name = name ;
    }

}
