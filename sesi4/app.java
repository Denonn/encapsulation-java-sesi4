package sesi4;

import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> alamat = new ArrayList<>();
        ArrayList<String> siswa = new ArrayList<>();
        ArrayList<String> dosen = new ArrayList<>();
        ArrayList<String> matKul = new ArrayList<>();
        ArrayList<String> matKulDosen = new ArrayList<>();
        ArrayList<Integer> nilai = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.println("\nMENU");
                System.out.println("1. Mahasiswa");
                System.out.println("2. Dosen");
                System.out.println("3. Tampilkan semua data");
                System.out.println("4. Keluar\n");
                System.out.print("Masukan plihan : ");
                Integer Status = input.nextInt();
                // main siswa
                if (Status == 1) {
                    System.out.print("Nama anda : ");
                    String NAMA = input.next();
                    nama.add(NAMA);
                    siswa.add(NAMA);

                    System.out.print("Alamat anda : ");
                    String ALAMAT = input.next();
                    alamat.add(ALAMAT);

                    Student s1 = new Student(NAMA, ALAMAT);
                    s1.add(siswa);

                    do {
                        System.out.println("\nMenu Mahasiswa : ");
                        System.out.println("1. Masukan data matkul dan nilai");
                        System.out.println("2. Tampilkan data");
                        System.out.println("3. keluar");
                        System.out.print("Pilih menu : ");
                        Integer pilih = input.nextInt();
                        if (pilih == 3) {
                            break;
                        } else if (pilih == 1) {
                            System.out.print("\nMasukan matkul : ");
                            String MATKUL = input.next();
                            matKul.add(MATKUL);

                            System.out.print("Masukan nilai : ");
                            Integer NILAI = input.nextInt();
                            nilai.add(NILAI);
                            
                            System.out.println("Data berhasil di masukan\n");
                            s1.addCourseGrade(MATKUL, NILAI);
                        } else if (pilih == 2) {
                            System.out.println("\n Data mahasiswa");
                            s1.printGrades();
                            System.out.println("Rata-rata nilai : " + s1.getAverageGrade() + "\n");
                        } 

                    } while (true);

                } else if (Status == 2) {
                    // menu dosen
                    System.out.print("Nama anda : ");
                    String NAMA = input.next();
                    nama.add(NAMA);
                    dosen.add(NAMA);

                    System.out.print("Alamat anda : ");
                    String ALAMAT = input.next();
                    alamat.add(ALAMAT);

                    Teacher t1 = new Teacher(NAMA, ALAMAT);
                    
                    do {
                        System.out.println("\nMenu dosen");
                        System.out.println("1. Tambahkan matkul");
                        System.out.println("2. Hapus Semua matkul");
                        System.out.println("3. Tampilkan Data Dosen");
                        System.out.println("4. keluar");

                        System.out.print("Pilih menu : ");
                        Integer menu = input.nextInt();

                        if (menu == 1) {
                            System.out.print("\nMasukan matkul : ");
                            String MATKUL = input.next();
                            if (t1.addCourse(MATKUL)) {
                                System.out.println(MATKUL + " Berhasil di tambahkan");
                                matKulDosen.add(MATKUL);
                            } else {
                                System.out.println("Matkul sudah ada");
                            }

                        } else if (menu == 2) {
                            System.out.println("Daftar matkul : " + matKulDosen);
                            for (String i : matKulDosen) {
                                if (t1.removeCourse(i)) {
                                    System.out.println(i + " berhasil di hapus");

                                } else {
                                    System.out.println("Matkul belum ditambahkan / sudah di hapus");
                                }
                            }
                            matKulDosen.removeAll(matKulDosen);
                        } else if (menu == 3) {
                            System.out.println("Menu dosen");
                            System.out.println("\n" + t1);
                            System.out.print("Matkul yang di ambil (Dosen): ");

                            for (String i : matKulDosen) {
                                System.out.print(i + ",");
                            }

                        } else if (menu == 4) {
                            System.out.println("berhasil keluar dari menu dosen\n");
                            break;
                        }

                    } while (true);

                } else if (Status == 3) {
                    System.out.println("\nData mahasiswa" );
                    System.out.println(siswa);
                    System.out.println("Daftar matkul : " + matKul);
                    System.out.println("Nilai matkul : " + nilai);

                    System.out.println("\nData Dosen");
                    System.out.println(dosen);
                    System.out.println("Daftar Matkul Dosen" + matKulDosen + "\n");

                }else if(Status == 4) {
                    break;
                }
            } while (true);
        }
    }
}
