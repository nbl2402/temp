package com.qa.learning.chapter2_method;

public class IntroduceMethod {
//    static String OWNER = "Long";
//    static boolean IS_FEMALE = false;

//    static String PET = "Dog";
//    static String SOUND = "Gau Gau";

    static String OTHER_OWNER = "GonL";
    static int AGE = 18;

    public static void main(String[] args) {
        Add();
        //System.out.println("Ket qua: 1 + 1 = 2");
    }

    public static void Nha(String owner, boolean isFemale, String pet, String sound) {
        System.out.println("Nha so 1: ");
        System.out.println("Chu Nha: " + owner);
        System.out.println("Gioi Tinh: " + isFemale);
        System.out.println("Thu Nuoi: " + pet);
        System.out.println("Dac Diem: " + sound);
    }

    public static void NhaSo1() {
        String OWNER = "Long";
        boolean IS_FEMALE = false;
        String PET = "Dog";
        String SOUND = "Gau Gau";

        System.out.println("Nha so 1: ");
        System.out.println("Chu Nha: " + OWNER);
        System.out.println("Gioi Tinh: " + IS_FEMALE);
        System.out.println("Thu Nuoi: " + PET);
        System.out.println("Dac Diem: " + SOUND);
    }

    public static void NhaSo2() {
        String OTHER_OWNER = "Long";
        boolean AGE = false;
        String PET = "Dog";
        String SOUND = "Gau Gau";

        System.out.println("Nha so 2: ");
        System.out.println("Chu Nha: " + OTHER_OWNER);
        System.out.println("Gioi Tinh: " + AGE);
        System.out.println("Thu Nuoi: " + PET);
        System.out.println("Dac Diem: " + SOUND);
    }

    public static void Add() {
        String result = "Ket qua: 1 + 1 = 2";
    }

    public static void Add2(int a, int b) {
        int c = a + b;
        System.out.println("Ket qua: " + a + "+" + b + "=" + c);
    }
}

    // Tao 1 ham ten Add()
    // Print: Ket qua: 1 + 1 = 2
//===================================//


//===================================//

    //Bai tap so 2:
    // Tao 1 ham ten Add2(int a, int b)
    // Print: Ket qua: <a> + <b>

    // Yeu cau nang cao:
        //  Print: Ket qua: <a> + <b> = <c> - voi c la tong cua a va b



