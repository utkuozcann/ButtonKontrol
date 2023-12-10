package com.myapp;


import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;

public class MyButton1 extends JButton {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color activeColor = Color.GREEN;
    private Color passiveColor = Color.RED;
    private String activeIcon = "[Aktif Simge]";
    private static String passiveIcon = "[Pasif Simge]";
    private boolean isActive = false;

    public MyButton1(String text, ActionListener actionListener) {
        super(text + " " + passiveIcon);
        this.setBackground(passiveColor);
        this.addActionListener(actionListener);
    }

    public void MyButton(String text, ActionListener actionListener) {
	}

	public void setActive(boolean active) {
        this.isActive = active;
        if (active) {
            this.setBackground(activeColor);
            this.setText(this.getText().split(" ")[0] + " " + activeIcon);
        } else {
            this.setBackground(passiveColor);
            this.setText(this.getText().split(" ")[0] + " " + passiveIcon);
        }
    }

    public boolean isActive() {
        return this.isActive;
    }

    public Color getActiveColor() {
        return activeColor;
    }

    public void setActiveColor(Color activeColor) {
        this.activeColor = activeColor;
    }

    public Color getPassiveColor() {
        return passiveColor;
    }

    public void setPassiveColor(Color passiveColor) {
        this.passiveColor = passiveColor;
    }

    public String getActiveIcon() {
        return activeIcon;
    }

    public void setActiveIcon(String activeIcon) {
        this.activeIcon = activeIcon;
        if (isActive) {
            this.setText(this.getText().split(" ")[0] + " " + activeIcon);
        }
    }

    public String getPassiveIcon() {
        return passiveIcon;
    }

    public void setPassiveIcon(String passiveIcon) {
        MyButton1.passiveIcon = passiveIcon;
        if (!isActive) {
            this.setText(this.getText().split(" ")[0] + " " + passiveIcon);
        }
    }
}
