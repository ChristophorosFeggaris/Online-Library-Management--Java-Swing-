import javax.swing.JButton;
import javax.swing.JFrame;


public class library extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 3941113360510951988L;

    public static void main(final String[] args) {
        Start();
        
    }

    public static void Start() { /* this will be a class */
        JFrame frame1 = new JFrame("Online Library"); 
        JButton see = new JButton("See all books");
        JButton search = new JButton("Search a book");
        JButton insert = new JButton("Insert new book");
        JButton exit = new JButton("Exit");
        see.setBounds(140, 60, 180, 50); //size of see button
        search.setBounds(140, 140, 180, 50); //size of search button
        insert.setBounds(140, 220, 180, 50); //size of insert button
        exit.setBounds(140, 300, 180, 50); //size of exit button
        frame1.add(see);
        frame1.add(search);
        frame1.add(insert);
        frame1.add(exit);
        frame1.setSize(500, 600); //define size of Frame
        frame1.setLayout(null);
        frame1.setVisible(true); //Set it true if we want to see the Frame open
        Books.Exit(exit);
        Books.See(see,frame1);
        SearchB.Search(search, frame1);
        AddBook.Insert(insert, frame1);
    }

}