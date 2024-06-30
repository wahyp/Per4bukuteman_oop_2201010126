/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan401;

public class Pertemuan401 {

    public static void main(String[] args) {
        BukuTeman BTeman = new BukuTeman();
        String ulang = "Iya!";

        do {
            System.out.println("A. Lihat Data");
            System.out.println("B. Tambah Data");
            System.out.println("C. Edit Data");
            System.out.println("D. Hapus Data");
            System.out.println("E. Keluar");
            System.out.print("Pilih Menu (A/B/C/D/E): ");
            String MenuPilihan = BTeman.dtIN.nextLine();
             switch (MenuPilihan) {
                case "A" -> BTeman.viewdata();

                case "B" -> BTeman.Storedata();

                case "C" -> BTeman.Update(0);

                case "D" -> BTeman.Destroy(0);

                case "E" -> ulang = "Tidak";

                default -> System.out.println("Ketik A/B/C/D/E");
            } 
        } while (ulang.equals("Iya!"));
    }
}
