package CONTROLL;

import MODEL.Motocycle;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class MotocycleController extends Motocycle implements IVehicle {
    public MotocycleController(String model, String manufacturer, String color,
                               double price, String ABS, int power, String category){
        super(model, manufacturer, color, price, ABS, power, category);
    }

    public MotocycleController(){}

    @Override
    public void register(){
        Scanner get = new Scanner(System.in);

        System.out.println("===========Cadastrar Motocicleta============");
        System.out.println("Modelo: ");
        super.setModel(get.nextLine());

        System.out.println("Fabricante: ");
        super.setManufacturer(get.nextLine());

        System.out.println("Cor: ");
        super.setColor(get.nextLine());

        System.out.println("Tem ABS?");
        super.setABS(get.nextLine());

        get.nextLine();

        System.out.println("Categoria: ");
        super.setCategory(get.nextLine());

        System.out.println("Preço: ");
        super.setPrice(get.nextDouble());

        System.out.println("Cilindradas: ");
        super.setPower(get.nextInt());
    }

    @Override
    public void print(){
        DecimalFormat df = new DecimalFormat("#,###.00#");

        System.out.println("Modelo: " + super.getModel());
        System.out.println("Fabricante: " + super.getManufacturer());
        System.out.println("Cor: " + super.getColor());
        System.out.println("Preço: " + df.format(super.getPrice()));
        if (super.getABS().toUpperCase(Locale.ROOT)
                .toLowerCase(Locale.ROOT) == "sim")
            System.out.println("Tem ABS");
        else System.out.println("Não tem ABS");
        System.out.println("Categoria: " + super.getCategory());
        System.out.println("Cilindradas: " + super.getPower());
    }
}
