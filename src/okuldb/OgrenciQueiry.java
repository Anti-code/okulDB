/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okuldb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author mehmet
 */
public class OgrenciQueiry extends DBConnection{
    public ObservableList<Ogrenci> OgrenciBul(){
        ObservableList<Ogrenci> OgrenciListesi= FXCollections.observableArrayList();
        try{
            baglan();
            PreparedStatement Getirici=baglanti.prepareStatement("select * from Ogrenci");
            ResultSet yap=Getirici.executeQuery();
            while(yap.next()){
                Ogrenci ogrenci=new Ogrenci(yap.getInt("OgrNo"),yap.getString("Ogradi"),yap.
                        getString("OgrSadi"),yap.getString("OgrAdres"),yap.getInt("BID"));
            
                        OgrenciListesi.add(ogrenci);
            }
            Getirici.close();
            yap.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            baglantiKes();
        }
        return OgrenciListesi;
    }
    }
