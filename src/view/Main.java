package view;


import controller.Manager;
import model.Bill;
import model.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Manager duclap = new Manager();
        boolean check = true;
        while (check) {
            System.out.println("Nhập vào chức năng");
            System.out.println("---------MENU--------");
            System.out.println("---1.Tạo bill");
            System.out.println("---2.Hiển thị");
            System.out.println("---3.Sửa");
            System.out.println("---4.Xóa");
            System.out.println("---5.Tính tiền");
            System.out.println("---6.Hiển thị các nhà đã thanh toán");
            System.out.println("---7.Tìm kiếm");
            System.out.println("---8.Tính tổng số tiền đã thu được");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    creatBill(duclap);
                    break;
                case 2:
                    duclap.showAllBill();
                    break;
                case 4:
                    dellBill(duclap);
                    break;
                case 5:
                    countMoney(duclap);
                    break;
                case 6:
                    duclap.checkDoneBill();
                    break;
                case 7:
                    seachHouse(duclap);
                    break;
                case 8:
                    System.out.println(duclap.getAllTotalBill());
                    break;
            }
        }
    }

    private static void dellBill(Manager duclap) {
        System.out.println("nhập vào số nhà");
        String numH = scanner.nextLine();
        duclap.deleteBill(numH);
    }

    private static void creatBill(Manager duclap) {
        Bill bill = creatBill();
        duclap.addNewBill(bill);
        duclap.showAllBill();
    }

    private static void seachHouse(Manager duclap) {
        System.out.println("nhập vào số nhà muốn tìm");
        scanner.nextLine();
        String num = scanner.nextLine();
        duclap.checkUser(num);
    }

    private static void countMoney(Manager duclap) {
        System.out.println("nhập vào số nhà");
        scanner.nextLine();
        String numHouse = scanner.nextLine();
        duclap.countBillByCodeHouse(numHouse);
        duclap.showAllBill();
    }

    public static User creatPeople() {
        try {
            System.out.println("nhập vào tên");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("nhập vào số nhà");
            String numHouse = scanner.nextLine();
            System.out.println("nhập vào mã code");
            String code = scanner.nextLine();
            User user = new User(name, numHouse, code);
            return user;
        } catch (InputMismatchException e) {
            System.out.println("nhập sai rồi");
        }
        return null;
    }

    public static Bill creatBill() {
        try {
            System.out.println("nhập vào số cũ");
            int oldNum = scanner.nextInt();
            System.out.println("nhập vào số mới");
            int newNum = scanner.nextInt();
            Bill newBill = new Bill(creatPeople(), oldNum, newNum);
            return newBill;
        } catch (InputMismatchException e) {
            System.out.println("nhập sai rồi");
        }
        return null;
    }
}
