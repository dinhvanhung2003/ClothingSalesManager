/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import GUI.GUI_HomeMain;
import GUI.Login;

/**
 *
 * @author TriHieu
 */
public class test {

    public static void main(String[] args) {
//        Login lg = new Login();
//        lg.setVisible(true);
//        GUI_HomeMain d = new GUI_HomeMain(lg.getUsername());
        GUI_HomeMain d = new GUI_HomeMain("nguyenvan");
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }

}
