package main;

import Builder.ManagerBuilder;
import Builder.Worker;
import Client.Client;
import sort.SortBySpecies;
import tariff.Species;
import tariff.Tariff;
import tariff.TariffBonus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Pleshevich on 15.10.2016.
 */
public class Main {

    public static void main(String[] args) {

         TariffBonus smart = ManagerBuilder.getTariffBonus(100,100,10,10,100, Species.SMART,1024,30);
        TariffBonus smartLite = ManagerBuilder.getTariffBonus(24,23,14,10,100, Species.SMARTLITE,2048,360);
        TariffBonus smartMini = ManagerBuilder.getTariffBonus(30,23,16,15,100, Species.SMARTMINI,1024,60);
        TariffBonus absolute = ManagerBuilder.getTariffBonus(20,45,18,15,100, Species.ABSOLUTE,1024,100);

        List<Tariff> list = new ArrayList<Tariff>();
        List<Client> list1 = new ArrayList<Client>();
        list.add(smart);
        list.add(smartLite);
        list.add(smartMini);
        list.add(absolute);

        Client client1 = new Client("Lena","80291237645",Species.SMART);
        Client client2 = new Client("Mary","80299067845",Species.SMARTMINI);
        Client client3 = new Client("Nina","80294005645",Species.ABSOLUTE);
        Client client4 = new Client("Lera","80299876645",Species.SMARTLITE);
        list1.add(client1);
        list1.add(client2);
        list1.add(client3);
        list1.add(client4);


        Collections.sort(list, new SortBySpecies());
        System.out.println(Worker.searchTariffForCostMinuteInNet(list, 1));
        System.out.println("Number  clients = " + list1.size());
        for (Tariff tariffBonus : list) {
            System.out.println(tariffBonus);
        }
    };
}