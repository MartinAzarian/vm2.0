package com.company;

import com.company.candy.KitKat;
import com.company.candy.Snickers;
import com.company.candy.Twix;
import com.company.crips.Doritos;
import com.company.crips.Lays;
import com.company.crips.Pringles;
import com.company.drinks.Cola;
import com.company.drinks.Fanta;
import com.company.drinks.Pepsi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class VendMachine {
    private HashMap<ProductType, Queue<Product>> productBoard = new HashMap<>();



    public VendMachine(int theProduct, ProductType productType ) {

        quantityProductInitilizeBoard();

    }

    private void quantityProductInitilizeBoard()
    {
        for (int i = 0; i < 10; i++) {
            initilizeBoard();
        }
    }

    private void initilizeBoard() {
        Cola cola = new Cola();
        Pepsi pepsi = new Pepsi();
        Fanta fanta = new Fanta();
        ArrayList<Product> drinks = new ArrayList<>();
        drinks.add(cola);
        drinks.add(fanta);
        drinks.add(pepsi);


        KitKat kitkat = new KitKat();
        Snickers snickers = new Snickers();
        Twix twix = new Twix();
        ArrayList<Product> candys = new ArrayList<>();
        candys.add(kitkat);
        candys.add(snickers);
        candys.add(twix);

        Doritos doritos = new Doritos();
        Lays lays = new Lays();
        Pringles pringles = new Pringles();
        ArrayList<Product> crisps = new ArrayList<>();
        crisps.add(doritos);
        crisps.add(lays);
        crisps.add(pringles);


        productBoard.put(ProductType.CANDY, candys);
        productBoard.put(ProductType.DRINKS, drinks);
        productBoard.put(ProductType.CRIPS,  crisps);

    }
    public void getProduct(ProductType productType, int theProduct)
    {
        productBoard.get(productType);
    }
}