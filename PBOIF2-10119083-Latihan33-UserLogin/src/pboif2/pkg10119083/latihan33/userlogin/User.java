/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan33.userlogin;

/**
 *
 * Nama : Rafsan Zen Mustaofa 
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Program user
 */
public class User {
    
    private final String username = "MUSTAFI";
    private final String password = "UHUY";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        return (username.equals(parUserName) && parPassword.equals(password));
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        System.out.println("");
        
        if(status) {
            System.out.println("******HALLO "+parUserName+"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else
            System.out.println("Ooops, Username atau Password anda salah");
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun ,parUserName);
    }
    
}
