package by.epam.basic.library.view;

import by.epam.basic.library.entity.PrintedEdition;
import by.epam.basic.library.view.print.Printable;

import java.util.ArrayList;

public class ViewAction {

    public void print(ArrayList<PrintedEdition> list, Printable matcher) {
        matcher.print(list);
    }
}
