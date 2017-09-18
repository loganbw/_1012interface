package com.logan;

import com.logan.models.Army;
import com.logan.models.Marines;
import com.logan.models.Navy;

public class Main {

    public static void main(String[] args) {
        Army solider1 = new Army("Luther", "Private", 21005);
        solider1.speak();
        solider1.fight();
        solider1.Shooting();

        Navy solder2 = new Navy("sammul", "Sergeant", 31854);
        solder2.fight();
        solder2.Shooting();
        solder2.speak();

        Marines solder3 = new Marines("jackson", "Corporal", 789123);
        solder3.Shooting();
        solder3.speak();
        solder3.fight();

    }


}

