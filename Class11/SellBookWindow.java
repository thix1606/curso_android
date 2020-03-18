package Class11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellBookWindow extends JFrame {
    public SellBookWindow(BookStore bookStore){
        super.setSize(500, 100);
        super.setTitle("Sell book");
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

        JButton buttonSell = new JButton("Sell book");

        mainPanel.add(buttonSell);

        this.setVisible(true);

        buttonSell.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(bookStore.sellBook(bookIsbnCodeText.getText())){
                        Book book = bookStore.getBook(bookIsbnCodeText.getText());
                        JOptionPane.showMessageDialog(null, book.toString(),"BOOK SOLD SUCCESSFULLY", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "FAILED TO SELL BOOK\nCHECK CODE AND AVAILABILITY", "OOPS...", JOptionPane.WARNING_MESSAGE);
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(),"FAILED TO SELL BOOK", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
