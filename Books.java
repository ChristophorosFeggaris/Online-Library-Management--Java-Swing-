import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Books extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 5932379055760156876L;

    public static void Exit(final JButton exit) {
        exit.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void See(final JButton see, final JFrame frame1) {
        see.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                JFrame frame2 = new JFrame("See all books");
                frame2.setSize(500, 600);
                frame2.setVisible(true);
                frame1.dispose();
                JTextArea ta = new JTextArea(100, 200);
                JScrollPane jp = new JScrollPane(ta);
                frame2.add(jp);
                try {
                    FileReader reader = new FileReader("Books.txt");
                    BufferedReader bf = new BufferedReader(reader);
                    ta.read(bf, null);
                    ta.setEditable(false);
                    bf.close();
                    ta.requestFocus();
                } catch (IOException ioe) {
                    JOptionPane.showMessageDialog(null, ioe);
                }
            }
        });
    }

}

class AddBook {
    static JButton insert;
    static JFrame frame4;
    static JTextField type, author, title, isbn, year, category;

    public static void Insert(JButton insert, JFrame frame1) {
        insert.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame4 = new JFrame("Add a book");
                frame4.setSize(400, 400);
                frame4.setVisible(true);
                frame1.dispose();
                JPanel p = new JPanel();
                JLabel typel = new JLabel("Type: ");
                type = new JTextField(15);
                JLabel titlel = new JLabel("Title: ");
                title = new JTextField(15);
                JLabel authorl = new JLabel("Author: ");
                author = new JTextField(15);
                JLabel categoryl = new JLabel("Category: ");
                category = new JTextField(15);
                JButton add = new JButton("Add the book");
                p.add(typel);
                p.add(type);
                p.add(authorl);
                p.add(author);
                p.add(titlel);
                p.add(title);
                p.add(categoryl);
                p.add(category);
                p.add(add);
                frame4.add(p);

            }
        });
    }
}

class SearchB {
    static JButton sea;
    static JFrame frame3;
    static JTextField tf;

    public static void Search(JButton search, JFrame frame1) {
        search.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frame3 = new JFrame("Search the book");
                frame3.setSize(400, 400);
                frame3.setVisible(true);
                frame1.dispose();
                tf = new JTextField(15);
                JPanel p = new JPanel();
                sea = new JButton("Search");
                p.add(tf);
                p.add(sea);
                frame3.add(p);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        JButton click = (JButton) e.getSource();
        if (click == sea)
            JOptionPane.showMessageDialog(null, e);

    }

}