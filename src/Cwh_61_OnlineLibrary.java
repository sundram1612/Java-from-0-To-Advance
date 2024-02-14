class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    
    /** 
     * @param book
     */
    void addBooks(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added.");
    }
    void showAvailableBooks(){
        System.out.println("-----Available books are-----");
        for (String book : this.books) {
            if(book == null){
                continue;
            }
            System.out.println("*"+book);
            
        }
    }
    
    
    /** 
     * @param issuingbook
     */
    void issueBook(String issuingbook){
        
        for(int i = 0; i<this.books.length; i++){
            if(this.books[i].equals(issuingbook)){
                System.out.println("The Book has been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This Book does not exist.");
    }
void returnBook(String returnbook){
    System.out.println("Following Book(s) has been returned.");
    addBooks(returnbook);
}

}


public class Cwh_61_OnlineLibrary{
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBooks("Think and Grow Rich");
        centralLibrary.addBooks("Algorithms");
        centralLibrary.addBooks("The reference book of C++");
        centralLibrary.showAvailableBooks();
        
        centralLibrary.issueBook("The reference book of C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("The reference book of C++");
        centralLibrary.showAvailableBooks();
       
    }
}