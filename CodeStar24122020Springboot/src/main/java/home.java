
import org.springframework.web.bind.ammotation.*;

@RestfulController
public class Home {
    @RequestMapping("/test");
    String showTest(); {
        return "I love you" ;
    }
    @getMapping("/demo")
    String showDemo() {
        return "I Hate you" ;
    }
    
    @getMapping("/area")
    double getArea(double width,double height) {
        return width * height ;
    } 
}


//localhost:8080/area?width=8.5$height=4.0