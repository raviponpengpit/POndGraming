package PtestSpringboot261220;

import java.util.*;

public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException() {

    }

    public TodoNotFoundException(long id) {
        super("GGWP" + id); //- super ใช้เพื่อเรียก ตัวแปร หรือ method ของ Classแม่ที่เราสืบทอดมา
    }
}
