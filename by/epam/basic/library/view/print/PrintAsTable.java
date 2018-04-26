package by.epam.basic.library.view.print;

import by.epam.basic.library.entity.PrintedEdition;

import java.util.ArrayList;

public class PrintAsTable implements Printable {

    public void print(ArrayList<PrintedEdition> list) {
        for (PrintedEdition pe : list) {
            System.out.printf("| Автор - %-20s | Название - %-20s | Цена - %-20d\n", pe.getAuthor(), pe.getName(),
                              pe.getPrice());
        }
        System.out.println(" ");
    }
}
