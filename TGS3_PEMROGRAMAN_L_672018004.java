package tgs3_pemrograman_l_672018004;

import java.util.Scanner;

public class TGS3_PEMROGRAMAN_L_672018004 {

    public static void main(String[] args) {

        String kalimat,huruf;
        char kalimatubah ;
        int count = 0;
        
        Scanner scan = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        kalimat = inp.nextLine();
        System.out.println(" ");
        System.out.println("Kalimat Anda : "+kalimat);
        System.out.println(" ");
        System.out.print("Masukkan Huruf yang Ingin Diubah : ");
        huruf = scan.next();
        char huruf1 = huruf.charAt(0);
        huruf1 = Character.toLowerCase(huruf1);
        System.out.println(" ");
        System.out.print("Kalimat Setelah diubah : " );
        
        for (int p = 0; p < kalimat.length(); p++) 
        {
            if(kalimat.charAt(p)=='a')
            {
                kalimatubah='A';
            }else if(kalimat.charAt(p)=='i')
            {
                kalimatubah='I';
            }else if(kalimat.charAt(p)=='u')
            {
                kalimatubah='U';
            }else if(kalimat.charAt(p)=='e')
            {
                kalimatubah='E';
            }else if(kalimat.charAt(p)=='o')
            {
                kalimatubah='O';
            }else if(kalimat.charAt(p)==' ')
            {
                kalimatubah='_';
            }else if(kalimat.charAt(p)==huruf1)
            {
                kalimatubah='Z';
            }else
            {
                kalimatubah = kalimat.charAt(p);
            }
            System.out.print(kalimatubah);
        }
        scan.close();      
    }
    
}
    
    
