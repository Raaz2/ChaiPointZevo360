package com.zevo.drinks;

import java.util.Map;

public class HotWater {
    private Integer hotWater;

    public HotWater() {
        this.hotWater = 50;
    }
    public boolean canPrepareHotWater(Map<String,Integer> composition) {
        boolean hotMilkCheck = composition.containsKey("hotWater") && composition.get("hotWater") >= 50;
        if(hotMilkCheck) {
            composition.put("hotWater", composition.get("hotWater") - 50);
            System.out.println("Hot Water is prepared.");
            return true;
        }
        System.out.println("Hot Water cannot be prepared because item Hot Water is not sufficient.");
        return false;
    }
    public Integer getHotWater() {
        return hotWater;
    }

    public void setHotWater(Integer hotWater) {
        this.hotWater = hotWater;
    }
}
