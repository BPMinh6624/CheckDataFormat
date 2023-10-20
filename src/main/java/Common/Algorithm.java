/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Algorithm {
    protected Library library;
    
     public Algorithm() {
        library = new Library();
    }
    public String checkPhoneNumberFormat(String phoneNumber){
        if (!phoneNumber.matches("^[0-9]+$")){
            return "Phone number must be number";
        }
        if (!phoneNumber.matches("^\\d{10}$")){
            return "Phone number must be 10 digits";
        }
        return "";
    }

    public String checkEmailFormat(String email) {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return "Email must be correct format";
        }
        return "";
    }

    public String checkDateFormat(String date) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        f.setLenient(false);
        try {
            f.parse(date);
            return "";
        } catch (ParseException e) {
            return "Date to correct format(dd/MM/yyyy)";
        }
    }
    
    public void checkData(){
        String phone;
        do {
            phone = library.getString("Phone: ");
            if (!checkPhoneNumberFormat(phone).equals("")) {
                System.out.println(checkPhoneNumberFormat(phone));
            } else {
                break;
            }
        } while (true);

        String email;
        do {
            email = library.getString("Email: ");
            if (!checkEmailFormat(email).equals("")) {
                System.out.println(checkEmailFormat(email));
            } else {
                break;
            }
        } while (true);

        String date;
        do {
            date = library.getString("Date: ");
            if (!checkDateFormat(date).equals("")) {
                System.out.println(checkDateFormat(date));
            } else {
                break;
            }
        } while (true);
    }
}
