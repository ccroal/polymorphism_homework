package Interfaces;

import Attractions.Visitor;

public interface ISecurity {

    public boolean isAllowedTo(Visitor visitor);
}
