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
/*    */ 
/*    */ 
/*    */ public class Static
/*    */ {
/*    */   static void yoi() {
/* 17 */     Scanner scan = new Scanner(System.in);
/*    */ 
/*    */     
/* 20 */     System.out.println("Selamat datang di perpustakaan desa pucanganom ");
/* 21 */     System.out.println("---------==============================--------");
/* 22 */     System.out.print("Masukkan nama          : ");
/* 23 */     String nama = scan.nextLine();
/* 24 */     System.out.print("Masukkan alamat        : ");
/* 25 */     String alamat = scan.nextLine();
/* 26 */     System.out.print("Masukkan nama buku     : ");
/* 27 */     String namabuku = scan.nextLine();
/* 28 */     System.out.print("Masukkan tanggal       : ");
/* 29 */     int tgl = scan.nextInt();
/* 30 */     System.out.print("Masukkan bulan         : ");
/* 31 */     String bulan = scan.nextLine();
/* 32 */     System.out.print("Masukkan tahun         : ");
/* 33 */     int tahun = scan.nextInt();
/* 34 */     System.out.println(" ");
/* 35 */     System.out.println("---------================--------");
/* 36 */     System.out.println("Nama               : " + nama);
/* 37 */     System.out.println("Alamat             : " + alamat);
/* 38 */     System.out.println("nama buku          : " + namabuku);
/* 39 */     System.out.println("tanggal di pinjam  : " + tgl + "-" + bulan + "-" + tahun);
/*    */   }
/*    */   static void oke() {
/* 42 */     Scanner scan = new Scanner(System.in);
/*    */     
/* 44 */     System.out.print("Masukkan nama                   : ");
/* 45 */     String nama = scan.nextLine();
/* 46 */     System.out.print("Masukkan nama buku              : ");
/* 47 */     String namabuku = scan.nextLine();
/* 48 */     System.out.print("Masukkan tanggal dikembalikan   : ");
/* 49 */     String tgl = scan.nextLine();
/*    */   }
/*    */ }


/* Location:              D:\NetBeansProjects\Belajar_Method\build\classes\!\belajar_method\Static.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */