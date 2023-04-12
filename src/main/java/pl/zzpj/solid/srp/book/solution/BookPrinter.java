package pl.zzpj.solid.srp.book.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BookPrinter {
    private Book book;

    public void printCurrentPage() {
        System.out.println(book.getCurrentPageContents());
    }

    public void printAllPages() {
        book.getPages().values().forEach(System.out::println);
    }
}
