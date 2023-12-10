package com.myapp;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Java GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel(new GridLayout(4, 4));
        MyButton1[] buttons = new MyButton1[16]; // MyButton1 dizisi

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyButton1 clickedButton = (MyButton1) e.getSource();
                int clickedIndex = Integer.parseInt(clickedButton.getText().split(" ")[1]) - 1;

                if (clickedIndex == 0) { // Eğer ilk butona basıldıysa
                    for (MyButton1 button : buttons) {
                        button.setActive(false); // Tüm butonları pasif hale getir
                    }
                } else {
                    clickedButton.setActive(!clickedButton.isActive()); // Diğer butonların durumunu değiştir
                }
            }
        };

        for (int i = 0; i < buttons.length; i++) {
            MyButton1 button = new MyButton1("Button " + (i + 1), actionListener);
            buttons[i] = button;
            panel.add(button);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}
