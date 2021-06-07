/*    */ package belajar_method;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Mobil
/*    */ {
/*    */   String Merk;
/*    */   String warna;
/*    */   int plat;
/*    */   
/*    */   void isi() {
/* 19 */     Scanner scan = new Scanner(System.in);
/*    */     
/* 21 */     System.out.print("Masukan merk mobil :");
/* 22 */     this.Merk = scan.nextLine();
/* 23 */     System.out.print("Masukan Warna mobil :");
/* 24 */     this.warna = scan.nextLine();
/* 25 */     System.out.print("Masukan plat nomor mobil :");
/* 26 */     this.plat = scan.nextInt();
/*    */   }
/*    */   void tampil() {
/* 29 */     System.out.println(" ");
/* 30 */     System.out.println("================================");
/* 31 */     System.out.println("Merk mobil: " + this.Merk);
/* 32 */     System.out.println("Warna mobil: " + this.warna);
/* 33 */     System.out.println("plat nomor: " + this.plat);
/*    */   }
/*    */ }


/* Location:              D:\NetBeansProjects\Belajar_Method\build\classes\!\belajar_method\Mobil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */