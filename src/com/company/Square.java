package com.company;
import java.lang.*;

public class Square extends Rectangle {
    protected double side;

    public Square() {
        this.color = "none";
        this.filled = false;
    }

    public Square(double side, String color, Boolean filled) {
        this.side = side;
        super.color = color;
        super.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Rectangle: Square, lenght: " + this.side + ", wight: " + this.side;
    }
}
