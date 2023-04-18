package pl.zzpj.solid.srp.book.solution;

public record BookPrinter(Book book) {

    public void printCurrentPage() {
        System.out.println(book.getCurrentPageContents());
    }

    public void printAllPages() {
        book.getPages().values().forEach(System.out::println);
    }

}
