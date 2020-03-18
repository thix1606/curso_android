package Class11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListBookWindow extends JFrame {

    public ListBookWindow(BookStore bookStore){
        super.setSize(800, 400);
        super.setTitle("List books");
        super.setResizable(true);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        super.getContentPane().add(mainPanel);

        //Author field
        JTextArea bookList = new JTextArea();
        mainPanel.add(bookList);

        JButton buttonList = new JButton("List books");

        mainPanel.add(buttonList);

        this.setVisible(true);

        buttonList.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    bookList.setText(bookStore.toString());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(),"FAILED TO LIST BOOKS", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buttonList.doClick();
    }

}
