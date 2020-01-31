package com.company;

import java.util.HashMap;

public class ConvertToComand {

    private char[] comand = new char[3];

    public ConvertToComand(String userComand) {
        intilizationComand(userComand);
        Comand comand = new Comand(this.comand);
    }


    private char[] intilizationComand(String userComand)
    {
        for (int i = 0; i < comand.length; i++) {

            this.comand[i] = userComand.charAt(i);
        }

        return this.comand;
    }



   /* private VendMachine createComand(char[] comand) {

        HashMap<Character, Integer> comandVM = new HashMap<>();

        if (this.comand[0] == 'A' || this.comand[0] == 'B' || this.comand[0] == 'C') {

            switch (this.comand[2])
            {

                case 1:
                    comandVM.put(this.comand[0], 1);
                    break;

                case 2:
                    comandVM.put(this.comand[0], 2);
                    break;

                case 3:
                    comandVM.put(this.comand[0], 3);
                    break;

                default:
                    break;

            }
        }

        VendMachine vendMachine = new VendMachine(comandVM);

        vendMachine.getProductBoard(comandVM);
        return vendMachine;
    }*/
}