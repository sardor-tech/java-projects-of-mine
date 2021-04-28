public class NewJavaM2Lesson2Hw4 {
    private String bookName;
    private String bookAuthor;
    private String bookAuthor2;
    private String bookAuthor3;
    private String bookAutho4;

    private Long bookISNB;
    private Integer cost;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Long getBookISNB() {
        return bookISNB;
    }

    public void setBookISNB(Long bookISNB) {
        this.bookISNB = bookISNB;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getBookAuthor2() {
        return bookAuthor2;
    }

    public void setBookAuthor2(String bookAuthor2) {
        this.bookAuthor2 = bookAuthor2;
    }

    public String getBookAuthor3() {
        return bookAuthor3;
    }

    public void setBookAuthor3(String bookAuthor3) {
        this.bookAuthor3 = bookAuthor3;
    }

    public String getBookAutho4() {
        return bookAutho4;
    }

    public void setBookAutho4(String bookAutho4) {
        this.bookAutho4 = bookAutho4;
    }

    public static void main(String[] args) {
        NewJavaM2Lesson2Hw4 Book = new NewJavaM2Lesson2Hw4();
        Book.setBookName("Nimaga Java Pythondan ustun");
        Book.setBookAuthor("Palonchi");
//        Book.setBookAuthor2("");
//        Book.setBookAuthor3("");
        Book.setBookISNB(23454564423L);
        Book.setCost(20);
        System.out.println(Book.getBookName());
        System.out.println(Book.getBookAuthor());
        System.out.println(Book.getBookISNB());
        System.out.println(Book.getCost());
    }
}
