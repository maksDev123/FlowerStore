package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.filter.SearchFilter;

public class Store {
    List<Item> items;

    public List<Item> search(SearchFilter searchFilter) {
        List<Item> search_items = new ArrayList<Item>();
        for (Item item : this.items) {
            if (searchFilter.match(item))
                search_items.add(item);
        }
        return search_items;
    }
}
