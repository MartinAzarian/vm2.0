package com.company;

import java.util.HashMap;

public class Comand {
    private ProductType productType;
    private int theProduct;

    public Comand(char[] array) {
        this.theProduct = (int) array[2];
        if(array[0] == 'A' || array[0] == 'a')
        {
            productType = ProductType.CANDY;
        }
        else if(array[0] == 'B' || array[0] == 'b')
        {
            productType = ProductType.DRINKS;
        }
        else if(array[0] == 'C' || array[0] == 'c')
        {
            productType = ProductType.CRIPS;
        }
        else throw new ComandExeption("Not valid comand");

        VendMachine vendMachine = new VendMachine(theProduct, productType);
    }
}

