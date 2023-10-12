package com.zevo.drinks;

import java.util.Map;

public class Coffee {
    private Integer hotWater;
    private Integer hotMilk;
    private Integer coffeeSyrup;
    private Integer sugarSyrup;

    public Coffee() {
        this.hotWater = 50;
        this.hotMilk = 10;
        this.coffeeSyrup = 10;
        this.sugarSyrup = 10;
    }

    public boolean canPrepareCoffee(Map<String,Integer> composition) {
        //checking for sufficient material or not
        boolean hotWaterCheck = composition.containsKey("hotWater") && composition.get("hotWater") >= 50;
        boolean hotMilkCheck = composition.containsKey("hotMilk") && composition.get("hotMilk") >= 10;
        boolean coffeeSyrupCheck = composition.containsKey("coffeeSyrup") && composition.get("coffeeSyrup") >= 10;
        boolean sugarSyrupCheck = composition.containsKey("sugarSyrup") && composition.get("sugarSyrup") >= 10;

        if(hotWaterCheck && hotMilkCheck && coffeeSyrupCheck && sugarSyrupCheck) {
            composition.put("hotWater", composition.get("hotWater") - 50);
            composition.put("hotMilk", composition.get("hotMilk") - 10);
            composition.put("coffeeSyrup", composition.get("coffeeSyrup") - 10);
            composition.put("sugarSyrup", composition.get("sugarSyrup") - 10);
            System.out.println("Coffee is prepared.");
            return true;
        }
        else if(!coffeeSyrupCheck) {
            System.out.println("Coffee cannot be prepared because item Coffee Syrup is not sufficient.");
        }
        else if(!sugarSyrupCheck) {
            System.out.println("Coffee cannot be prepared because item Sugar Syrup is not sufficient.");
        }
        else if(!hotMilkCheck) {
            System.out.println("Coffee cannot be prepared because item Hot Milk is not sufficient.");
        } else {
            System.out.println("Coffee cannot be prepared because item Hot Water is not sufficient.");
        }
        return false;
    }
    public Integer getHotWater() {
        return hotWater;
    }

    public void setHotWater(Integer hotWater) {
        this.hotWater = hotWater;
    }

    public Integer getHotMilk() {
        return hotMilk;
    }

    public void setHotMilk(Integer hotMilk) {
        this.hotMilk = hotMilk;
    }

    public Integer getCoffeeSyrup() {
        return coffeeSyrup;
    }

    public void setCoffeeSyrup(Integer coffeeSyrup) {
        this.coffeeSyrup = coffeeSyrup;
    }

    public Integer getSugarSyrup() {
        return sugarSyrup;
    }

    public void setSugarSyrup(Integer sugarSyrup) {
        this.sugarSyrup = sugarSyrup;
    }
}
