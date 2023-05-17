package main.model;

import java.util.ArrayList;
import java.util.List;

public class Entries {
    private List<Entry> entries;

    public Entries() {
        entries = new ArrayList<>();
    }

    public List<Entry> getEntries() {
        return entries;
    }
}
