package LabAssignment1B;



public class Library {
    LibraryItem[] libraryItems = new LibraryItem[10];
    
    
    
    
    public LibraryItem addItem(LibraryItem item){
           return new LibraryItem("Mughal Empire", "Akbar",2000, true, LibraryItemType.MAGAZINE);
    }



    public LibraryItem borrowItem(LibraryItem item){
        if (item.isBorrowed() != false){
        }
        else{
            System.out.println("can be borrowed");
        }
        return item;
    }


        public void returnItem(LibraryItem item){  //mark item as returned
            if(item.isBorrowed() == false){
                System.out.println("Item is returned");
            }
            else{
                System.out.println("not returned");
            }
        }  
        
        public void displayAvailableItems() {
            for (LibraryItem libraryItem : libraryItems) {
                if (libraryItem != null && !libraryItem.isBorrowed()) {
                    System.out.println(libraryItem);
                }
            }
        }
       
        public void displayBorrowedItems() {
            for (LibraryItem libraryItem : libraryItems) {
                if (libraryItem != null && libraryItem.isBorrowed()) {
                    System.out.println(libraryItem);
                }
            }
        } 
                                                      
       


        //     }
        // }                                                  //List items that are currently borrowed
}
