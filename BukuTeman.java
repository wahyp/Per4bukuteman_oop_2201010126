/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan401;

import java.util.Scanner;

public class BukuTeman {
    private final int baris = 10;
    private final int kolom = 3;
    private int recordaktif = 0;
    private final String[][] BT = new String[baris][kolom];

    Scanner dtIN = new Scanner(System.in);

    public void Storedata() {
        int idx = 0;
        recordaktif++;
        if (recordaktif > baris) {
            System.out.println("Data sudah penuh!");
            return;
        }
        if (recordaktif > 0) {
            idx = recordaktif - 1;
        }
        System.out.println("Menambahkan Data Teman");
        System.out.println("====================== ");
        System.out.print("Nama Teman: ");
        BT[idx][0] = dtIN.nextLine();

        System.out.print("Alamat: ");
        BT[idx][1] = dtIN.nextLine();

        System.out.print("No Telp: ");
        BT[idx][2] = dtIN.nextLine();
    }

    public void Update(int idx) {
        if (idx >= 0 && idx < recordaktif) {
            System.out.println("Update Data Teman");
            System.out.println("==================");
            System.out.print("Nama Teman: ");
            BT[idx][0] = dtIN.nextLine();
            System.out.print("Alamat: ");
            BT[idx][1] = dtIN.nextLine();
            System.out.print("No Telp: ");
            BT[idx][2] = dtIN.nextLine();
            System.out.println("Data berhasil diupdate!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    public void Destroy(int idx) {
        if (idx >= 0 && idx < recordaktif) {
            for (int i = idx; i < recordaktif - 1; i++) {
                BT[i] = BT[i + 1];
            }
            recordaktif--;
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    public void viewdata() {
        System.out.println("Daftar Teman");
        System.out.println("============");
        for (int i = 0; i < recordaktif; i++) {
            System.out.println("============");
            System.out.println("Record Number: " + i);
            System.out.println("Nama: " + BT[i][0]);
            System.out.println("Alamat: " + BT[i][1]);
            System.out.println("No Telp: " + BT[i][2]);
            System.out.println(" ");
        }
    }
}
