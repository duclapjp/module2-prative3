package view;

import controller.Manager;
import model.Bill;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User thai = new User("thái google","14","41");
        User an = new User("an","10","69");
        User xuanAnh = new User("không gần","301","96");
        ArrayList<User> usersList = new ArrayList<>();
        usersList.add(thai);
        usersList.add(an);
        usersList.add(xuanAnh);
        Bill b1 = new Bill(thai,10,500,true);
        Bill b2 = new Bill(an,20,600,true);
        Bill b3 = new Bill(xuanAnh,33,700,true);
        ArrayList<Bill> billsList = new ArrayList<>();
        billsList.add(b1);
        billsList.add(b2);
        billsList.add(b3);
        Manager ducLap = new Manager();
        ducLap.setBills(billsList);
        ducLap.setUsers(usersList);
        ducLap.showAllBill();
        ducLap.checkUser("41");           //kiểm tra người dùng mã số 41
        System.out.println("những người đã nộp tiền điện là:");
        ducLap.checkDoneBill();
        System.out.println("------------------");
        System.out.println("tổng số tiền điện là:"+ducLap.getAllTotalBill());
    }
}
