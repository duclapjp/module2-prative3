package view;

import controller.Manager;
import model.Bill;
import model.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagerMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    static void dellBill(Manager duclap) {
        System.out.println("nhập vào số nhà");
        String numH = scanner.nextLine();
        duclap.deleteBill(numH);
    }

    static void creatBill(Manager duclap) {
        Bill bill = creatBill();
        duclap.addNewBill(bill);
        duclap.showAllBill();
    }

    static void seachHouse(Manager duclap) {
        System.out.println("nhập vào số nhà muốn tìm");
        String num = scanner.nextLine();
        duclap.checkUser(num);
    }

    static void countMoney(Manager duclap) {
        System.out.println("nhập vào số nhà");
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
