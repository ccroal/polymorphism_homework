package Attractions;

import Attractions.Attraction;
import Interfaces.ISecurity;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() <= 15){
            return true;
        }
        return false;
    }
}
