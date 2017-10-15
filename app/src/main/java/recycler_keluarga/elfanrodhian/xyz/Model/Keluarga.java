package recycler_keluarga.elfanrodhian.xyz.Model;

/**
 * Created by Elfan Rodhian on 10/8/2017.
 */

public class Keluarga {
    String nama;
    String status;
    String ttl;
    String jk;
    String pekerjaan;
    int gambar;

    public Keluarga(String nama, String status, String ttl, String jk, String pekerjaan, int gambar) {
        this.nama = nama;
        this.status = status;
        this.ttl = ttl;
        this.jk = jk;
        this.pekerjaan = pekerjaan;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getTtl() {
        return ttl;
    }
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getJk() {
        return jk;
    }
    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}
