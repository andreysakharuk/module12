package by.epam.basic.library.view.print;

import by.epam.basic.library.entity.PrintedEdition;

import java.util.ArrayList;

public class PrintAsList implements Printable {

    public void print(ArrayList<PrintedEdition> list) {
        for (PrintedEdition pe : list) {
            System.out.println("Автор = " + pe.getAuthor() + ", Имя = " + pe.getName() + ", Цена = " + pe.getPrice());
        }
        System.out.println(" ");
    }
}
