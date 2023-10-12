package com.zevo.drinks;

import java.util.Map;

public class HotMilk {
    private Integer hotMilk;

    public HotMilk() {
        this.hotMilk = 50;
    }

    public boolean canPrepareHotMilk(Map<String,Integer> composition) {
        boolean hotMilkCheck = composition.containsKey("hotMilk") && composition.get("hotMilk") >= 50;
        if(hotMilkCheck) {
            composition.put("hotMilk", composition.get("hotMilk") - 50);
            System.out.println("Hot Milk is prepared.");
            return true;
        }
        System.out.println("Hot Milk cannot be prepared because item Hot Milk is not sufficient.");
        return false;
    }
    public Integer getHotMilk() {
        return hotMilk;
    }

    public void setHotMilk(Integer hotMilk) {
        this.hotMilk = hotMilk;
    }
}
