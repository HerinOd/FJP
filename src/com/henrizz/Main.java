package com.henrizz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        byte sốLượngThuNhập = 0;
        byte sốLượngChiTiêu = 0;
        String[] tênThuNhập = new String[0];
        long[] tiềnThuNhập = new long[0];
        String[] tênChiTiêu = new String[0];
        long[] tiềnChiTiêu = new long[0];

        while (true) {
            inMenuChinh();
            byte choice = scanner.nextByte();
            scanner.nextLine();

            switch (choice) {
                case 1: //Thêm thu nhập:
                    System.out.print("Thêm số khoản thu nhập: " );
                    sốLượngThuNhập = scanner.nextByte();
                    scanner.nextLine();
                    tênThuNhập = lưuTên("Nhập tiêu đề: ", sốLượngThuNhập);
                    tiềnThuNhập = lưuSốTiền("Nhập số tiền: ", sốLượngThuNhập);
                    continue;

                case 2: //Thêm chi tiêu:
                    System.out.print("Thêm số khoản chi tiêu: ");
                    sốLượngChiTiêu = scanner.nextByte();
                    scanner.nextLine();
                    tênChiTiêu = lưuTên("Nhập tiêu đề: ", sốLượngChiTiêu);
                    tiềnChiTiêu = lưuSốTiền("Nhập số tiền: ", sốLượngChiTiêu);
                    continue;

                case 3: //Xem tổng thu nhập, chi tiêu, số dư:
                    long tổngThuNhập = tổngTiền(tiềnThuNhập, sốLượngThuNhập);
                    long tổngChiTiêu =tổngTiền(tiềnChiTiêu, sốLượngChiTiêu);
                    long sốDư = tổngThuNhập - tổngChiTiêu;
                    System.out.println("====== Tóm Tắt ======");
                    System.out.println("- Tổng Thu Nhập " + Arrays.toString(tênThuNhập) + ": " + tổngThuNhập);
                    System.out.println("- Tổng Chi Tiêu: " + Arrays.toString(tênChiTiêu) + ": " + tổngChiTiêu);
                    System.out.println("Số dư: " + sốDư);
                    continue;

                case 4: //Cảnh báo quá hạn mức:
                    System.out.print("Bạn muốn đặt % hạn mức là: ");
                    short hạnMức = scanner.nextShort();
                    short phầnTrămHạnMức = phầnTrămChiTiêuThuNhập(tiềnThuNhập, tiềnChiTiêu, sốLượngThuNhập, sốLượngChiTiêu);
                    if (phầnTrămHạnMức >= hạnMức)
                        System.out.println("Bạn đã vượt quá hạn mức chi tiêu!");
                    else
                        System.out.println("Còn nhiều tiền lắm, tiêu xả láng đi!");
                    continue;

                case 5:
                    break;
            }
            System.out.println("Goodbye!!");
            break;
        }
    }

    public static long tổngTiền(long[] tiền, byte sốLượng) {
        int tổng = 0;
        for (int i = 0; i < sốLượng; i++) {
            tổng += tiền[i];
        }
        return tổng;
    }

    public static String[] lưuTên(String prompt, byte sốLượng) {
        String[] tên = new String[sốLượng];
        System.out.println(prompt);
        for (int i = 0; i < sốLượng; i++) {
            System.out.print("-, ");
            tên[i] = scanner.nextLine();
        }
        return tên;
    }

    public static long[] lưuSốTiền(String prompt, byte sốLượng) {
        long[] tiền = new long[sốLượng];
        System.out.println(prompt);
        for (int i = 0; i < sốLượng; i++) {
            System.out.print("-, ");
            tiền[i] = scanner.nextLong();
        }
        return tiền;
    }

    public static short phầnTrămChiTiêuThuNhập(long[] tiềnThuNhập, long[] tiềnChiTiêu, byte sốLượngThuNhập, byte sốLượngChiTiêu) {
        long tổngThuNhập = tổngTiền(tiềnThuNhập, sốLượngThuNhập);
        long tổngChiTiêu =tổngTiền(tiềnChiTiêu, sốLượngChiTiêu);
        double phầnTrăm = ((double) tổngChiTiêu
                               / tổngThuNhập
                               * 100);
        return (short) phầnTrăm;
    }

    private static void inMenuChinh() {
        System.out.println(" ");
        System.out.println("====== Menu ======");
        System.out.println("1. Thêm khoản thu nhập\n" +
                "2. Thêm khoản chi tiêu\n" +
                "3. Xem tổng thu nhập, chi tiêu, số dư\n" +
                "4. Xem cảnh báo nếu chi tiêu vượt quá X%\n" +
                "5. Thoát chương trình\n");
        System.out.print("Chọn mục: ");
    }

}