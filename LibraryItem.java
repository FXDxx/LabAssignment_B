package LabAssignment1B;


public class LibraryItem {
        private String title; 
        private String author;
        private int year; 
        private boolean isBorrowed; //indicate item is currently borrowed or not.
        LibraryItemType itemType;

        //constructor
        public LibraryItem(String title, String author, int year, boolean isBorrowed, LibraryItemType itemType) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.isBorrowed = isBorrowed;
            this.itemType = itemType;
        }
        //getters and setters
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public boolean isBorrowed() {
            return isBorrowed;
        }
        public void setBorrowed(boolean isBorrowed) {
            this.isBorrowed = isBorrowed;
        }
        public LibraryItemType getItemType() {
            return itemType;
        }
        public void setItemType(LibraryItemType itemType) {
            this.itemType = itemType;
        }
        
        public String toString(){
            String itemDetail = String.format("%-10s%-20s%-10d%-10s",title,author,year,isBorrowed,itemType);
            return itemDetail;

        }
        public boolean equals(Object o){
            LibraryItem libr = (LibraryItem) o;
            if(this.getTitle().equals(libr.getTitle())){
                return true;
            }
            else{
                return false;
            }

        }
}
