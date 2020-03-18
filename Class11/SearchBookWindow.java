package Class11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookWindow extends JFrame {
    public SearchBookWindow(BookStore bookStore){
        super.setSize(500, 100);
        super.setTitle("Search book");
        super.setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        super.getContentPane().add(mainPanel);

        //Author field
        JPanel bookIsbnCodePanel = new JPanel();
        bookIsbnCodePanel.setLayout(new GridLayout());
        JLabel bookIsbnCodeLabel = new JLabel();
        bookIsbnCodeLabel.setText("Insert ISBN Code: ");
        JTextField bookIsbnCodeText = new JTextField();
        bookIsbnCodePanel.add(bookIsbnCodeLabel);
        bookIsbnCodePanel.add(bookIsbnCodeText);
        mainPanel.add(bookIsbnCodePanel);

        JButton buttonSearch = new JButton("Search book");

        mainPanel.add(buttonSearch);

        this.setVisible(true);

        buttonSearch.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Book book = bookStore.getBook(bookIsbnCodeText.getText());
                    if(book == null){
                        JOptionPane.showMessageDialog(null, "BOOK WAS NOT FOUND\nTRY A DIFFERENT CODE","OOPS...", JOptionPane.PLAIN_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, book.toString(),"BOOK FOUND", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(),"FAILED TO LIST BOOKS", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


    }
}
