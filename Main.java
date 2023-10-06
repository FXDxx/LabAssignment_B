package LabAssignment1B;

public class Main {
 public static void main(String[] args) {
    //LibraryItem item1,item2,item3;
    Library lib = new Library();

    LibraryItem item1 = new LibraryItem("Forty Rules of Love", "Elif Shafak", 2017, true, LibraryItemType.BOOK);
    LibraryItem item2 = new LibraryItem("Wimpy Kid", "Englishmen", 2010, true, LibraryItemType.MAGAZINE);
    LibraryItem item3 = new LibraryItem("Deital Deital", "Robert", 2020, false, LibraryItemType.MAGAZINE);

    
    
    System.out.println(lib.addItem(item3));
    System.out.println(lib.borrowItem(item1));
    lib.returnItem(item2);

    
    System.out.println("Display available items");
    lib.displayAvailableItems();
    System.out.println("Display borrowed items");
    lib.displayBorrowedItems();
    
    
 }
}
