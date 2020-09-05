
package pertemuan2;

public class barang {

    public String getKd_barang() {
        return kd_barang;
    }

    public void setKd_barang(String kd_barang) {
        this.kd_barang = kd_barang;
    }

    public String getNm_barang() {
        return nm_barang;
    }

    public void setNm_barang(String nm_barang) {
        this.nm_barang = nm_barang;
    }

    public int getHrg_barang() {
        return hrg_barang;
    }

    public void setHrg_barang(int hrg_barang) {
        this.hrg_barang = hrg_barang;
    }

    public int getJml_beli() {
        return jml_beli;
    }

    public void setJml_beli(int jml_beli) {
        this.jml_beli = jml_beli;
    }

    public int getJml_bayar() {
        jml_bayar = hrg_barang * jml_beli;      
        return jml_bayar;
    }

    public void setJml_bayar(int jml_bayar) {
        this.jml_bayar = jml_bayar;
    }

    private String kd_barang,nm_barang;
    private int hrg_barang,jml_beli,jml_bayar;
    
    
}
