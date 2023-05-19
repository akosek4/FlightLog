package main.model;

import java.util.ArrayList;
import java.util.List;

public class Entries {
    private List<Entry> entries;

    public Entries() {
        entries = new ArrayList<>();
    }

    public void addEntry(Entry e) {
        entries.add(e);
    }

    public void removeEntry(Entry e) {
        entries.remove(e);
    }

    public List<Entry> getEntries() {
        return entries;
    }
}
