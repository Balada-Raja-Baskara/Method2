/*    */ package belajar_method;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class KTP
/*    */ {
/*    */   String nama;
/*    */   String kelamin;
/*    */   String alamat;
/*    */   String agama;
/*    */   String goldar;
/* 15 */   Scanner scan = new Scanner(System.in);
/*    */   
/*    */   int umur;
/*    */   
/*    */   String nama() {
/* 20 */     System.out.print("Nama : ");
/* 21 */     return this.nama = this.scan.nextLine();
/*    */   }
/*    */   String kelamin() {
/* 24 */     System.out.print("Jenis kelamin : ");
/* 25 */     return this.kelamin = this.scan.nextLine();
/*    */   }
/*    */   String alamat() {
/* 28 */     System.out.print("Alamat(dusun-desa-kec) : ");
/* 29 */     return this.alamat = this.scan.nextLine();
/*    */   }
/*    */   String agama() {
/* 32 */     System.out.print("Agama : ");
/* 33 */     return this.agama = this.scan.nextLine();
/*    */   }
/*    */   String goldar() {
/* 36 */     System.out.print("Golongan darah : ");
/* 37 */     return this.goldar = this.scan.nextLine();
/*    */   }
/*    */   int umur() {
/* 40 */     System.out.print("Umur : ");
/* 41 */     return this.umur = this.scan.nextInt();
/*    */   }
/*    */ }


/* Location:              D:\NetBeansProjects\Belajar_Method\build\classes\!\belajar_method\KTP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */