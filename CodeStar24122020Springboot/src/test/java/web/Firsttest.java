public class Firsttest {
    public void test001() {
        home h = new home();
        double a = h.getArea(8.5,4.0);
        assert a == 34.0; //assert is order to confirm
    }
    public void test002() {
        home h = new home ();
        double a = h.getArea( -5.0,4.0 );
        assert a == 20;
    }
}
