package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.filter.SearchFilter;

public class Store {
    private List<Item> items;

    public Store(List<Item> items) {
        this.items = items;
    }

    public List<Item> searchItems(SearchFilter searchFilter) {
        List<Item> search_items = new ArrayList<Item>();
        for (Item item : this.items) {
            if (searchFilter.match(item))
                search_items.add(item);
        }
        return search_items;
    }
}
