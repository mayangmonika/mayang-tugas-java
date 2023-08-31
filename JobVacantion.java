import java.util.Scanner;

public class JOBVacantion {
     public static void main(String{[] args){
	     //Deklarasi variable yang diperlukan.
		 int umur, pengalaman;
		 double penampilan;
		 String lulusan, nama, jenisKelamin;
		 boolean reqKoorl, reqKoor2, reqAdmin1, reqAdmin2;
		 boolean isPassingKoor, isPassingAdmin;
		 Scanner input = new Scanner(Ssystem.in);
		 
		 //Buat output Text yang dibutuhkan
		 System.out.println("Selamat datang di PT. Secret Semut 79");
		 System.out.println("=====================================\n");
         System.out.println("Silahkan input Data Anda");
         System.out.println("Nama : ");
         nama = input.nextInt();
		 
		 System.out.println("Umur : ");
		 umur = input.nextInt();
		 
         System.out.println("Jenis Kelamin (Pria/Wanita) : ");
		 jenisKelamin = input.next();
         
         System.out.println("Lulusan (SMK/D3/S1) : ");
		 lulusan =input.next();
		 
         System.out.println("Pengalaman : ");
		 pengalaman = input.nextInt();
		 
         System.out.println("Penampilan : ");	
		 penampilan = input.nextDouble();
		 
	  //pengecekan data untuk persyaratan Koordinator
      /*
		  1. Persyaratan Coordinator:
		  
		  Pria
		  Umur minimal 21 tahun dan maksimal 30 Tahun.
		  Lulusan SMK\D3/S1
		  Memiliki pengalaman minimal 2 Tahun
		  
		  Atau
		  
		  Pria
		  Umur 30 tahun keatas
		  Lulusan S1
		  Memiliki pengalaman minimal 5 Tahun.
	  */
	}
}
