package com.zevo.driver;

import com.zevo.drinks.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
 Assumption : It is believed that the given input for hashmap will contain the keys as correct variable name
  ex: hotWater, hotMilk, teaLeavesSyrup, gingerSyrup, sugarSyrup, elaichiSyrup, coffeeSyrup
  to check with different values , advised to only manipulate the values , don't make the changes in the keys of the map.

  number of outlets will be taken by the user and should not be more than 5 and less than 0;
* */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number between 1 to 5 : ");
        String num = sc.nextLine();
        try {
            int n = Integer.parseInt(num);
            if(n > 0 && n <= 5){
                //driver related code
                Map<String, Integer> totalItemsQuantity = new HashMap<>();
                //to check with different values of quantity u can manipulate this Map's values.

                totalItemsQuantity.put("hotWater",500);
                totalItemsQuantity.put("hotMilk",500);
                totalItemsQuantity.put("teaLeavesSyrup",100);
                totalItemsQuantity.put("gingerSyrup",100);
                totalItemsQuantity.put("sugarSyrup",100);
                totalItemsQuantity.put("elaichiSyrup",100);
                totalItemsQuantity.put("coffeeSyrup",100);

                ElaichiTea elaichiTea = new ElaichiTea();
                GingerTea gingerTea = new GingerTea();
                Coffee coffee = new Coffee();
                HotMilk hotMilk = new HotMilk();
                HotWater hotWater = new HotWater();

                if(n > 0 && elaichiTea.canPrepareElaichiTea(totalItemsQuantity)) {
                    n -= 1;
                } else System.out.println("Outlets not available for Elaichi Tea!");

                if(n > 0 && gingerTea.canPrepareGingerTea(totalItemsQuantity)) {
                    n -= 1;
                } else System.out.println("Outlets not available for Ginger Tea!");

                if(n > 0 && coffee.canPrepareCoffee(totalItemsQuantity)) {
                    n -= 1;
                } else System.out.println("Outlets not available for Coffee!");

                if(n > 0 && hotMilk.canPrepareHotMilk(totalItemsQuantity)) {
                    n -= 1;
                } else System.out.println("Outlets not available for Hot Milk! ");

                if(n > 0 && hotWater.canPrepareHotWater(totalItemsQuantity)) {
                    n -= 1;
                } else System.out.println("Outlets not available for Hot Water!");

            } else {
                System.out.println("Outlets should not be more than 5 or less than 0.");
            }

        } catch (NumberFormatException ex) {
            System.out.println("Pass a number value!");
        }


    }
}
