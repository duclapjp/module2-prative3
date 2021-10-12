package view;


import controller.Manager;
import model.Bill;
import model.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagerMain main = new ManagerMain();
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
                    main.creatBill(duclap);
                    break;
                case 2:
                    duclap.showAllBill();
                    break;
                case 4:
                    main.dellBill(duclap);
                    break;
                case 5:
                    main.countMoney(duclap);
                    break;
                case 6:
                    duclap.checkDoneBill();
                    break;
                case 7:
                    main.seachHouse(duclap);
                    break;
                case 8:
                    System.out.println(duclap.getAllTotalBill());
                    break;
            }
        }
    }
}
