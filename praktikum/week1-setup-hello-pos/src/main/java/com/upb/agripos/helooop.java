class mahasiswa {
    String nama;
    int nim;
    mahasiswa(String nm, int ni){
        nama = nm;
        nim = ni;
    }
    void panggil(){
        System.out.println("hallow, " + nama + " - " + nim);
    }
}
public class helooop {
    public static void main(String[] args) {
        mahasiswa m = new mahasiswa("Ahmad Sultoni", 240202850);
        m.panggil();
    }
}
