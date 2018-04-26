package by.epam.basic.library.service.find;

import by.epam.basic.library.entity.PrintedEdition;

import java.util.ArrayList;

public class FindAction {

    public ArrayList<PrintedEdition> find(ArrayList<PrintedEdition> list, Findable matcher) {
        return matcher.find(list);
    }
}
