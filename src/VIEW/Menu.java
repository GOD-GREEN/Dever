package VIEW;

import CONTROLL.CarsController;
import CONTROLL.MotocycleController;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void mainMenu(ArrayList<CarsController> cars,
                                ArrayList<MotocycleController> motocycles) {
        Scanner get = new Scanner(System.in);

        while (0 == 0) {
            System.out.println("\n===========================" +
                    "\n====Zeca Urubu Veiculos====" +
                    "\n===========================");

            System.out.println("(1)Cadastrar");
            System.out.println("(2)Consultar");
            System.out.println("(0)Sair");
            System.out.println("Digite a Opção desejada: ");
            int selected = get.nextInt();

            switch (selected) {
                case 1:
                    registerMenu(cars, motocycles);
                    break;
                case 2:
                    queryMenu(cars, motocycles);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("\nOpção Inválida\n");

            }
        }
    }

    public static void registerMenu(ArrayList<CarsController> cars,
                                    ArrayList<MotocycleController> motocycle) {
        Scanner get = new Scanner(System.in);
        int back = 0;

        while (back == 0) {
            System.out.println("====Zeca Urubu Veiculos====");
            System.out.println("(1)Carros");
            System.out.println("(2)Motocicleta");
            System.out.println("(0)Voltar");
            System.out.println("Digite a Opção desejada");
            int selected = get.nextInt();

            switch (selected) {
                case 1:
                    CarsController car = new CarsController();
                    car.register();
                    cars.add(car);
                    break;
                case 2:
                    MotocycleController moto = new MotocycleController();
                    moto.register();
                    motocycle.add(moto);
                    break;
                case 0:
                    back = 1;
                    break;
                default:
                    System.out.println("\nOpção Inválida\n");
            }
        }
    }

    public static void queryMenu(ArrayList<CarsController> cars,
                                 ArrayList<MotocycleController> motocycle) {
        Scanner get = new Scanner(System.in);
        int back = 0;

        while (back == 0) {
            System.out.println("====Zeca Urubu Veiculos====");
            System.out.println("(1)Carros");
            System.out.println("(2)Motocicleta");
            System.out.println("(0)Voltar");
            System.out.println("Digite a Opção desejada");
            int selected = get.nextInt();

            switch (selected) {
                case 1:
                    System.out.println("==Carros Cadastrados==");
                    if(cars.isEmpty())
                        System.out.println("\nLista Vazia\n");
                    else
                        for(CarsController i : cars){
                            i.print();
                            System.out.println("_______________________________________");
                        }
                        break;

                case 2:
                    System.out.println("==Motos Cadastradas==");
                    if(motocycle.isEmpty())
                        System.out.println("\nLista Vazia\n");
                    else
                        for(MotocycleController i : motocycle){
                            i.print();
                            System.out.println("_______________________________________");
                        }
                    break;
                case 0:
                    back = 1;
                    break;
                default:
                    System.out.println("\nOpção Invalida\n");
            }
        }
    }
}
