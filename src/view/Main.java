package view;


import controller.Manager;
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
            System.out.println("---2.Hiển thị các nhà chưa thanh toán");
            System.out.println("---3.Sửa");
            System.out.println("---4.Xóa");
            System.out.println("---5.Tính tiền");
            System.out.println("---6.Hiển thị các nhà đã thanh toán");
            System.out.println("---7.Tìm kiếm");
            System.out.println("---8.Tính tổng số tiền đã thu được");
            System.out.println("---9.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ManagerMain.creatBill(duclap);
                    break;
                case 2:
                    duclap.showAllBill();
                    break;
                case 4:
                    ManagerMain.dellBill(duclap);
                    break;
                case 5:
                    ManagerMain.countMoney(duclap);
                    break;
                case 6:
                    duclap.checkDoneBill();
                    break;
                case 7:
                    ManagerMain.seachHouse(duclap);
                    break;
                case 8:
                    System.out.println(duclap.getAllTotalBill());
                    break;
                case 9:
                    check = false;
                    break;
            }
        }
    }
}
