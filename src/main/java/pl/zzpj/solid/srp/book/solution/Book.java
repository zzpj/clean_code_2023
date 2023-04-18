package pl.zzpj.solid.srp.book.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {

    private int currentPage = 0;
    private final Map<Integer, String> pages = new HashMap<>();
    private final String libraryRoomName;
    private final String rowLocator;
    private final int indexOnShelf;

    public Book(String libraryRoomName, String rowLocator, int indexOnShelf) {
        this.libraryRoomName = libraryRoomName;
        this.rowLocator = rowLocator;
        this.indexOnShelf = indexOnShelf;
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public void turnPage() {
        currentPage ++;
    }

    public String getTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "John Doe";
    }

    public String getCurrentPageContents() {
        return pages.get(currentPage);
    }

    /**
     * Gives the library name
     *
     * @return
     */
    public String libraryRoomName() {
        return libraryRoomName;
    }

    /**
     * Gives the row location of the book.
     * @return
     */
    public String getLocationRowLocator() {
        return rowLocator;
    }

    /**
     * Gives the number from shelf.
     * @return
     */
    public int getIndexOnShelf() {
        return indexOnShelf;
    }
}
