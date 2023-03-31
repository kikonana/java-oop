public class SIAApp {
    public static void main(String[] args) {
        Mahasiswa  mahasiswa = new Mahasiswa();
        System.out.println(mahasiswa.family);
        mahasiswa.NIM("41821120032");
        mahasiswa.Nama("Lisna Budi Safitri");
        mahasiswa.Address("East Jakarta");
        mahasiswa.Contact("081381521011");

        Dosen dosen = new Dosen();
        System.out.println(dosen.family);
        dosen.NID("021378");
        dosen.Nama("Zico");
        dosen.Address("Jakarta");
        dosen.Contact("0218392735");
        dosen.educationBackground("S2 IT");
    }
}