/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okuldb;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mehmet
 */
public class DBConnection {
    protected static final String SERVER="jdbc:mysql://localhost:3306/Okul";
    protected static final String KULLANICIADI="root";
    protected static final String SIFRE=null;
    protected Connection baglanti=null;
    
    protected void baglan(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//İlgili dosyanın belleğe yüklenmesini sağlar
            baglanti=DriverManager.getConnection(SERVER,KULLANICIADI,SIFRE);//veri tabanına bağlanmayı sağlar
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    protected void baglantiKes(){
        try{
            baglanti.close();//açık olan bağlantıyı kapatır
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
