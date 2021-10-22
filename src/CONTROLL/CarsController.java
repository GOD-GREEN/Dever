package CONTROLL;

import MODEL.Cars;
import MODEL.Motocycle;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CarsController extends Cars implements IVehicle {
    public CarsController(String model, String manufacturer, String color, double price,
                          boolean ABS, int HP, int enginePower, int doors){
        super(model, manufacturer, color, price, ABS, enginePower, HP, doors);
    }

    public CarsController(){}

    @Override
    public void register() {
        Scanner get = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        boolean ABS = true;

        System.out.println("===========Cadastrar Carro============");
        System.out.println("Modelo: ");
        super.setModel(get.nextLine());

        System.out.println("Fabricante: ");
        super.setManufacturer(get.nextLine());

        System.out.println("Cor: ");
        super.setColor(get.nextLine());

        System.out.println("Tem ABS? \n'Sim' ou 'Não'");
        if (read.nextLine().toUpperCase(Locale.ROOT).toLowerCase(Locale.ROOT)
                == "sim"){
            ABS = true;
            return;
        }
        else{
            ABS = false;

        }

        super.setABS(read.nextBoolean());
        System.out.println(super.isABS());

        System.out.println("Potência: ");
        super.setEnginePower(get.nextInt());

        System.out.println("Cavalaria: ");
        super.setHP(get.nextInt());

        System.out.println("Preço: ");
        super.setPrice(get.nextDouble());

        System.out.println("Portas: ");
        super.setDoors(get.nextInt());

    }

    @Override
    public void print(){
        DecimalFormat df = new DecimalFormat("##,###.00");

        System.out.println("Modelo: " + super.getModel());
        System.out.println("Fabricante: " + super.getManufacturer());
        System.out.println("Cor: " + super.getColor());
        System.out.println("Preço: " + df.format(super.getPrice()));
        if (super.isABS())
            System.out.println("Tem ABS");
        else System.out.println("Não tem ABS");
        System.out.println("Cavalaria: " + super.getHP());
        System.out.println("Portas: " + super.getDoors());
        System.out.println("Cilindradas: " + super.getEnginePower());
    }
}

