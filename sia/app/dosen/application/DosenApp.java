package sia.app.dosen.application;

import sia.app.dosen.data.Dosen;

public class DosenApp {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.nama=("Kiko");
        dosen.gender=("Perempuan");
        dosen.setUmur(30);

        System.out.println(dosen.nama);        
        System.out.println(dosen.gender);
        System.out.println(dosen.getUmur());        
    }

    
}
