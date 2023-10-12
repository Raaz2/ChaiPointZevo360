package com.zevo.drinks;

import java.util.Map;

public class ElaichiTea {
    private Integer hotWater;
    private Integer hotMilk;
    private Integer teaLeavesSyrup;
    private Integer elaichiSyrup;
    private Integer sugarSyrup;

    public ElaichiTea() {
        this.hotWater = 50;
        this.hotMilk = 10;
        this.teaLeavesSyrup = 10;
        this.elaichiSyrup = 5;
        this.sugarSyrup = 10;
    }
    public boolean canPrepareElaichiTea(Map<String,Integer> composition) {
        boolean hotWaterCheck = composition.containsKey("hotWater") && composition.get("hotWater") >= 50;
        boolean hotMilkCheck = composition.containsKey("hotMilk") && composition.get("hotMilk") >= 10;
        boolean teaLeavesSyrupCheck = composition.containsKey("teaLeavesSyrup") && composition.get("teaLeavesSyrup") >= 10;
        boolean elaichiSyrupCheck = composition.containsKey("elaichiSyrup") && composition.get("elaichiSyrup") >= 5;
        boolean sugarSyrupCheck = composition.containsKey("sugarSyrup") && composition.get("sugarSyrup") >= 10;

        if(hotWaterCheck && hotMilkCheck && teaLeavesSyrupCheck && elaichiSyrupCheck && sugarSyrupCheck) {
            composition.put("hotWater", composition.get("hotWater") - 50);
            composition.put("hotMilk", composition.get("hotMilk") - 10);
            composition.put("teaLeavesSyrup", composition.get("teaLeavesSyrup") - 10);
            composition.put("elaichiSyrup", composition.get("elaichiSyrup") - 5);
            composition.put("sugarSyrup", composition.get("sugarSyrup") - 10);
            System.out.println("Elaichi Tea is prepared.");
            return true;
        }
        else if(!elaichiSyrupCheck) {
            System.out.println("Elaichi Tea cannot be prepared because item Elaichi Syrup is not sufficient.");
        }
        else if(!sugarSyrupCheck) {
            System.out.println("Elaichi Tea cannot be prepared because item Sugar Syrup is not sufficient.");
        }
        else if(!teaLeavesSyrupCheck) {
            System.out.println("Elaichi Tea cannot be prepared because item Tea Leaves Syrup is not sufficient.");
        }
        else if(!hotMilkCheck) {
            System.out.println("Elaichi Tea cannot be prepared because item Hot Milk is not sufficient.");
        } else {
            System.out.println("Elaichi Tea cannot be prepared because item Hot Water is not sufficient.");
        }
        return false;
    }
}
