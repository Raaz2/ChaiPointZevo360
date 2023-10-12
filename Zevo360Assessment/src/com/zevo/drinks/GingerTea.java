package com.zevo.drinks;

import java.util.Map;

public class GingerTea {
    private Integer hotWater;
    private Integer hotMilk;
    private Integer teaLeavesSyrup;
    private Integer gingerSyrup;
    private Integer sugarSyrup;

    public GingerTea() {
        this.hotWater = 50;
        this.hotMilk = 10;
        this.teaLeavesSyrup = 10;
        this.gingerSyrup = 5;
        this.sugarSyrup = 10;
    }

    public boolean canPrepareGingerTea(Map<String,Integer> composition) {
        boolean hotWaterCheck = composition.containsKey("hotWater") && composition.get("hotWater") >= 50;
        boolean hotMilkCheck = composition.containsKey("hotMilk") && composition.get("hotMilk") >= 10;
        boolean teaLeavesSyrupCheck = composition.containsKey("teaLeavesSyrup") && composition.get("teaLeavesSyrup") >= 10;
        boolean gingerSyrupCheck = composition.containsKey("gingerSyrup") && composition.get("gingerSyrup") >= 5;
        boolean sugarSyrupCheck = composition.containsKey("sugarSyrup") && composition.get("sugarSyrup") >= 10;

        if(hotWaterCheck && hotMilkCheck && teaLeavesSyrupCheck && gingerSyrupCheck && sugarSyrupCheck) {
            composition.put("hotWater", composition.get("hotWater") - 50);
            composition.put("hotMilk", composition.get("hotMilk") - 10);
            composition.put("teaLeavesSyrup", composition.get("teaLeavesSyrup") - 10);
            composition.put("gingerSyrup", composition.get("gingerSyrup") - 5);
            composition.put("sugarSyrup", composition.get("sugarSyrup") - 10);
            System.out.println("Ginger Tea is prepared.");
            return true;
        }
        else if(!gingerSyrupCheck) {
            System.out.println("Ginger Tea cannot be prepared because item Ginger Syrup is not sufficient.");
        }
        else if(!sugarSyrupCheck) {
            System.out.println("Ginger Tea cannot be prepared because item Sugar Syrup is not sufficient.");
        }
        else if(!teaLeavesSyrupCheck) {
            System.out.println("Ginger Tea cannot be prepared because item Tea Leaves Syrup is not sufficient.");
        }
        else if(!hotMilkCheck) {
            System.out.println("Ginger Tea cannot be prepared because item Hot Milk is not sufficient.");
        } else {
            System.out.println("Ginger Tea cannot be prepared because item Hot Water is not sufficient.");
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

    public Integer getTeaLeavesSyrup() {
        return teaLeavesSyrup;
    }

    public void setTeaLeavesSyrup(Integer teaLeavesSyrup) {
        this.teaLeavesSyrup = teaLeavesSyrup;
    }

    public Integer getGingerSyrup() {
        return gingerSyrup;
    }

    public void setGingerSyrup(Integer gingerSyrup) {
        this.gingerSyrup = gingerSyrup;
    }

    public Integer getSugarSyrup() {
        return sugarSyrup;
    }

    public void setSugarSyrup(Integer sugarSyrup) {
        this.sugarSyrup = sugarSyrup;
    }
}
