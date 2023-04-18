package pl.zzpj.solid.srp.book.solution;

public record BookPrinter(Book book) {

    public void printPageContent(int page) {
        book.goToPage(page);
        System.out.println(book.getPageContent());
    }

    public void printBookContent() {
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor() + "\n");

        book.getBookContent().forEach(System.out::println);
    }

}
