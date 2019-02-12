package Interfaces;

import Attractions.Visitor;

public interface ITicketed {

    public double defaultPrice();

    public double doublePrice(Visitor visitor);
}
