package pl.zzpj.solid.srp.book.solution;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int currentPage = 0;
    private final String title;
    private final String author;
    private final List<String> bookContent;
    private final int wordsLimitAtPage;

    public Book(String title, String author, int wordsLimitAtPage, String bookContent) {
        this.title = title;
        this.author = author;
        this.wordsLimitAtPage = wordsLimitAtPage;
        this.bookContent = divideContentIntoPages(bookContent);
    }

    public List<String> divideContentIntoPages(String bookContent) {
        List<String> pagedContent = new ArrayList<>();
        List<String> wordsList = List.of(bookContent.split(" "));

        for (int i = 0; i < wordsList.size(); i += wordsLimitAtPage) {
            List<String> wordsOnPage = wordsList.subList(i, Math.min(i + wordsLimitAtPage, wordsList.size()));
            String line = String.join(" ", wordsOnPage);
            pagedContent.add(line);
        }

        return pagedContent;
    }

    public void goToPage(int page) {
        if (page < bookContent.size())
            currentPage = page - 1;
    }

    public String getPageContent() {
        return bookContent.get(currentPage);
    }

    public List<String> getBookContent() {
        return bookContent;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
