/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okuldb;

/**
 *
 * @author mehmet
 */
public class Ogrenci {
    private int OrgNo;
    private String Ogradi;
    private String OgrSadi;
    private String OgrAdres;
    private int BID;

    public Ogrenci(int OrgNo, String Ogradi, String OgrSadi, String OgrAdres, int BID) {
        this.OrgNo = OrgNo;
        this.Ogradi = Ogradi;
        this.OgrSadi = OgrSadi;
        this.OgrAdres = OgrAdres;
        this.BID = BID;
    }

    /**
     * @return the OrgNo
     */
    public int getOrgNo() {
        return OrgNo;
    }

    /**
     * @param OrgNo the OrgNo to set
     */
    public void setOrgNo(int OrgNo) {
        this.OrgNo = OrgNo;
    }

    /**
     * @return the Ogradi
     */
    public String getOgradi() {
        return Ogradi;
    }

    /**
     * @param Ogradi the Ogradi to set
     */
    public void setOgradi(String Ogradi) {
        this.Ogradi = Ogradi;
    }

    /**
     * @return the OgrSadi
     */
    public String getOgrSadi() {
        return OgrSadi;
    }

    /**
     * @param OgrSadi the OgrSadi to set
     */
    public void setOgrSadi(String OgrSadi) {
        this.OgrSadi = OgrSadi;
    }

    /**
     * @return the OgrAdres
     */
    public String getOgrAdres() {
        return OgrAdres;
    }

    /**
     * @param OgrAdres the OgrAdres to set
     */
    public void setOgrAdres(String OgrAdres) {
        this.OgrAdres = OgrAdres;
    }

    /**
     * @return the BID
     */
    public int getBID() {
        return BID;
    }

    /**
     * @param BID the BID to set
     */
    public void setBID(int BID) {
        this.BID = BID;
    }

    boolean getOgradi(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
