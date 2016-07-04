package id.or.codelabs.beelajar.model;

import java.util.Date;

/**
 * Created by Rizal Y on 7/3/2016.
 */
public class ModelJadwal {
    private String subject;
    private String tanggal;
    private String nama;
    private String jam;

    public ModelJadwal(String subject, String tanggal, String nama, String jam) {
        this.subject = subject;
        this.tanggal = tanggal;
        this.nama = nama;
        this.jam = jam;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}
