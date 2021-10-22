package APP;

import CONTROLL.CarsController;
import CONTROLL.MotocycleController;

import VIEW.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarsController> regCars = new ArrayList<>();
        ArrayList<MotocycleController> regMotocycle = new ArrayList<>();
        Menu.mainMenu(regCars, regMotocycle);

    }
}
