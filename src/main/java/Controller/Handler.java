/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import View.Menu;

/**
 *
 * @author tuanh
 */
public class Handler extends Menu<String> {

    static String[] mc = {"Check data format", "Exit"};

    private Library library;
    private Algorithm al;

    public Handler() {
        super("===== CHECK DATA FORMAT PROGRAM =====", mc);
        library = new Library();
        al = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                al.checkData();
                break;
            case 2: 
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Please input another choice");
        }
    }
    
}
