package Class11;

import javax.script.ScriptEngine;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    protected static BookStore bookStore = new BookStore();
    public static void main(String args[]){
        BookStore bookStore = new BookStore();
        createWindow(bookStore);
    }

    private static void createWindow(BookStore bookStore){
        JFrame jFrame = new JFrame();
        jFrame.setSize(600,80);
        jFrame.setTitle("Integrator Exercise");
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        jFrame.getContentPane().add(panel);
        JButton buttonAdd = new JButton("Add Book");
        JButton buttonGetAll = new JButton("List Books");
        JButton buttonSearch = new JButton("Search book");
        JButton buttonSell = new JButton("Sell Book");

        panel.add(buttonAdd);
        panel.add(buttonGetAll);
        panel.add(buttonSearch);
        panel.add(buttonSell);

        jFrame.setVisible(true);

        buttonAdd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                new AddBookWindow(bookStore).setVisible(true);
            }
        });

        buttonGetAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ListBookWindow(bookStore).setVisible(true);
            }
        });

        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SearchBookWindow(bookStore).setVisible(true);
            }
        });

        buttonSell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SellBookWindow(bookStore).setVisible(true);
            }
        });

    }
}
