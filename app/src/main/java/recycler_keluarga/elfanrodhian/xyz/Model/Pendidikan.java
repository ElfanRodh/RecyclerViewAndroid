package recycler_keluarga.elfanrodhian.xyz.Model;

/**
 * Created by Elfan Rodhian on 10/9/2017.
 */

public class Pendidikan {
    String jenjang, nama_sekolah, alamat;
    int gambar;
    int tahun;
    public Pendidikan(String jenjang, String nama_sekolah, String alamat, int tahun, int gambar) {
        this.jenjang = jenjang;
        this.nama_sekolah = nama_sekolah;
        this.alamat = alamat;
        this.tahun = tahun;
        this.gambar = gambar;
    }

    public String getJenjang() {
        return jenjang;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    public String getNama_sekolah() {
        return nama_sekolah;
    }

    public void setNama_sekolah(String nama_sekolah) {
        this.nama_sekolah = nama_sekolah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
