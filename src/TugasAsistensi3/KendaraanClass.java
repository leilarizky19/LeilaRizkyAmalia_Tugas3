/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi3;

/**
 *
 * @author Lenovo
 */
public class KendaraanClass { //merupakan superclass
    int idKendaraan;
    private float bahanBakar;
    protected float jarakTempuhAwal;
    protected float jarakTempuh;
    
    public KendaraanClass(){ //konstruktor tak berparameter
    }
    
    public KendaraanClass (int idKendaraan, float jarakTempuhAwal, float jarakTempuh){ //konstruktor berparameter
        this.idKendaraan = idKendaraan;
        this.bahanBakar = bahanBakar;
        this.jarakTempuhAwal = jarakTempuhAwal;
        this.jarakTempuh = jarakTempuh;
    }
    
    public void setIdKendaraan(int idKendaraan){
        this.idKendaraan = idKendaraan;
    }
    
    public int getIdKendaraan (){
        return idKendaraan;
    }
    
    public void setBahanBakar(float BahanBakar){
        this.bahanBakar = BahanBakar;
    }
    
    public float getBahanBakar (){
        return bahanBakar;
    }
    
    public void setJarakTempuhAwal(float JarakTempuhAwal){
        this.jarakTempuhAwal = JarakTempuhAwal;
    }
    
    public float getJarakTempuhAwal (){
        return jarakTempuhAwal;
    }
    
    public void setJarakTempuh(float JarakTempuh){
        this.jarakTempuh = JarakTempuh;
    }
    
    public float getJarakTempuh (){
        return jarakTempuh;
    }
    
    public float totalJarak(){ //method menghitung total jarak yang ditempuh
        return getJarakTempuhAwal()+ getJarakTempuh();
    }
    
    public Boolean tesJarakTempuh(){
        if (getJarakTempuh() > 0 && getJarakTempuh() <= 500){
            return true;
        }
        else {
            return false;
        }
    }
    
    public Boolean tesBahanBakar(){
        if (getBahanBakar() > 0 && getBahanBakar() <= 500){
            return true;
        }
        else {
            return false;
        }  
    }
    
    public float efektivitas (){ //method menghitung efektivitas kendaraan
        float efektivitas;
        efektivitas =(float) ((Math.pow(Math.E, getJarakTempuh()/getBahanBakar())) * Math.log(2));
        
        if (tesJarakTempuh()==true && tesBahanBakar()==true){
        efektivitas = efektivitas;
        }
        else{
        efektivitas = 0;
        }
        return efektivitas;
    }
    
    public String tesEfektivitas(){ //method status keefektifan kendaraan
        String tesEfektivitas;
        
        if (efektivitas() >0 && efektivitas() <= 0.5)
            tesEfektivitas = "Mesin Efektif";
               
        else 
            tesEfektivitas = "Mesin Tidak Efektif";
        
        return tesEfektivitas;    
    }
        
    public void infoKendaraan(){
        System.out.println("Bahan Bakar Kendaraan \t\t:" + getBahanBakar());
        System.out.println("Jarak Tempuh Awal \t\t:" + getJarakTempuhAwal());
        System.out.println("JarakTempuh \t\t\t:" + getJarakTempuh());
        System.out.println("Total Jarak yang ditempuh \t:" + totalJarak());
        System.out.println("Efektivitasnya \t\t\t:" + efektivitas());
        System.out.println("Status Keefektifan \t\t:" + tesEfektivitas());
    }
}
    
class Mobil extends KendaraanClass{ //merupakan subclass
        private String namaKendaraanM;
        private String tipeKendaraanM;
        private float bahanBakarM;
        private int kapasitasMesinM;
        
        public Mobil(){ //konstruktor tak berparameter
        }
        
        public Mobil(String namaKendaraanM, String tipeKendaraanM, float bahanBakarM, int kapasitasMesinM, int idKendaraan, float jarakTempuhAwal, float jarakTempuh){ //konstruktor berparameter
            super (idKendaraan, jarakTempuhAwal, jarakTempuh);
            this.namaKendaraanM = namaKendaraanM;
            this.tipeKendaraanM = tipeKendaraanM;
            this.bahanBakarM = bahanBakarM;
            this.kapasitasMesinM = kapasitasMesinM;  
        }
        
        public void setNamaKendaraanM (String namaKendaraanM){
            this.namaKendaraanM = namaKendaraanM;
        }
        
        public String getNamaKendaraanM(){
            return namaKendaraanM;
        }
        
        public void setTipeKendaraanM(String tipeKendaraanM){
            this.tipeKendaraanM = tipeKendaraanM;
        }
        
        public String getTipeKendaraanM(){
            return tipeKendaraanM;
        }
        
        public void setBahanBakarM(float bahanBakarM){
            this.bahanBakarM = bahanBakarM;
        }
        
        public float getBahanBakarM(){
            return bahanBakarM;
        }
        
        public void setKapasitasMesinM(int kapasitasMesinM){
            this.kapasitasMesinM = kapasitasMesinM;
        }
        
        public int getKapasitasMesinM(){
            return kapasitasMesinM;
        }
        
        @Override
        public void infoKendaraan(){
        System.out.println("ID Kendaraan \t\t\t:" + getIdKendaraan());
        System.out.println("Nama Kendaraan \t\t\t:" + getNamaKendaraanM());
        System.out.println("Tipe Kendaraan \t\t\t:" + getTipeKendaraanM());
        System.out.println("Kapasitas Mesin \t\t:" + getKapasitasMesinM());
    }
}

class SepedaMotor extends KendaraanClass{ //merupakan subclass
        private String namaKendaraanSM;
        private String tipeKendaraanSM;
        private float bahanBakarSM;
        
        public SepedaMotor(){ //konstruktor tak berparameter
        }
        
        public SepedaMotor(String namaKendaraanSM, String tipeKendaraanSM, float bahanBakarSM, int kapasitasMesinSM, int idKendaraan, float jarakTempuhAwal, float jarakTempuh){ //konstruktor berparameter
            super (idKendaraan, jarakTempuhAwal, jarakTempuh);
            this.namaKendaraanSM = namaKendaraanSM;
            this.tipeKendaraanSM = tipeKendaraanSM;
            this.bahanBakarSM = bahanBakarSM;
        }
         
        public void setNamaKendaraanSM (String namaKendaraanSM){
            this.namaKendaraanSM = namaKendaraanSM;
        }
        
        public String getNamaKendaraanSM(){
            return namaKendaraanSM;
        }
        
        public void setTipeKendaraanSM(String tipeKendaraanSM){
            this.tipeKendaraanSM = tipeKendaraanSM;
        }
        
        public String getTipeKendaraanSM(){
            return tipeKendaraanSM;
        }
        
        public void setBahanBakarSM(float bahanBakarSM){
            this.bahanBakarSM = bahanBakarSM;
        }
        
        public float getBahanBakarSM(){
            return bahanBakarSM;
        }
        
        @Override
        public void infoKendaraan(){
        System.out.println("ID Kendaraan \t\t\t:" + getIdKendaraan());
        System.out.println("Nama Kendaraan \t\t\t:" + getNamaKendaraanSM());
        System.out.println("Tipe Kendaraan \t\t\t:" + getTipeKendaraanSM());
    }
}
