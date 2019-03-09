package com.ChadBoswell;

/**Chad Boswell 215254589*/
public class Vehicle implements Brand
{
    public static void main( String[] args )
    {
        Brand model = new Brand();
        model.Brand("bmw m3");
        model.Brand("Volkswagen mk1");
        model.Brand("Nissan GTR");
    }

    @Override
    public String brand(String vehicle){
        return vehicle;
    }


    public double price (Double value)
    {
        return value;
    }
}
