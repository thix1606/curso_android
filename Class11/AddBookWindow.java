package Class11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookWindow extends JFrame {
    public AddBookWindow(BookStore bookStore){

        super.setSize(500, 400);
        super.setTitle("Add book");
        super.setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        super.getContentPane().add(mainPanel);

        //Author field
        JPanel bookAuthorPanel = new JPanel();
        bookAuthorPanel.setLayout(new GridLayout());
        JLabel bookAuthorLabel = new JLabel();
        bookAuthorLabel.setText("Book author: ");
        JTextField bookAuthorText = new JTextField();
        bookAuthorPanel.add(bookAuthorLabel);
        bookAuthorPanel.add(bookAuthorText);
        mainPanel.add(bookAuthorPanel);

        //Title field
        JPanel bookTitlePanel = new JPanel();
        bookTitlePanel.setLayout(new GridLayout());
        JLabel bookTitleLabel = new JLabel();
        bookTitleLabel.setText("Book title: ");
        JTextField bookTitleText = new JTextField();
        bookTitlePanel.add(bookTitleLabel);
        bookTitlePanel.add(bookTitleText);
        mainPanel.add(bookTitlePanel);

        //Release year
        JPanel bookReleaseYearPanel = new JPanel();
        bookReleaseYearPanel.setLayout(new GridLayout());
        JLabel bookReleaseYearLabel = new JLabel();
        bookReleaseYearLabel.setText("Book release year: ");
        JTextField bookReleaseYearText = new JTextField();
        bookReleaseYearPanel.add(bookReleaseYearLabel);
        bookReleaseYearPanel.add(bookReleaseYearText);
        mainPanel.add(bookReleaseYearPanel);

        //ISBN Code
        JPanel bookIsbnCodePanel = new JPanel();
        bookIsbnCodePanel.setLayout(new GridLayout());
        JLabel bookIsbnCodeLabel = new JLabel();
        bookIsbnCodeLabel.setText("Book ISBN code: ");
        JTextField bookIsbnCodeText = new JTextField();
        bookIsbnCodePanel.add(bookIsbnCodeLabel);
        bookIsbnCodePanel.add(bookIsbnCodeText);
        mainPanel.add(bookIsbnCodePanel);

        //Book price
        JPanel bookPricePanel = new JPanel();
        bookPricePanel.setLayout(new GridLayout());
        JLabel bookPriceLabel = new JLabel();
        bookPriceLabel.setText("Book price: ");
        JTextField bookPriceText = new JTextField();
        bookPricePanel.add(bookPriceLabel);
        bookPricePanel.add(bookPriceText);
        mainPanel.add(bookPricePanel);

        //Book quantity
        JPanel bookQuantityPanel = new JPanel();
        bookQuantityPanel.setLayout(new GridLayout());
        JLabel bookQuantityLabel = new JLabel();
        bookQuantityLabel.setText("Book quantity: ");
        JTextField bookQuantityText = new JTextField();
        bookQuantityPanel.add(bookQuantityLabel);
        bookQuantityPanel.add(bookQuantityText);
        mainPanel.add(bookQuantityPanel);

        JButton buttonAdd = new JButton("Add Book");

        mainPanel.add(buttonAdd);

        buttonAdd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String author = bookAuthorText.getText();
                    String title = bookTitleText.getText();
                    String isbnCode = bookIsbnCodeText.getText();
                    Double price = Double.parseDouble(bookPriceText.getText());
                    int releaseYear = Integer.parseInt(bookReleaseYearText.getText());
                    int inventoryQuantity = Integer.parseInt(bookQuantityText.getText());
                    Book book = new Book(author, title, isbnCode, price, releaseYear, inventoryQuantity);
                    bookStore.addBook(book);
                    JOptionPane.showMessageDialog(null, "BOOK ADDED SUCCESSFULLY","SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    dispose();
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(),"FAILED TO ADD BOOK", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        super.setVisible(true);
    }
}
