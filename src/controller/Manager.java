package controller;

import model.Bill;
import model.User;

import java.util.ArrayList;

public class Manager {
    ArrayList<Bill> doneBill = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Bill> bills = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public void addNewBill(Bill bill) {
        bills.add(bill);
    }

    public void deleteBill(String numhouse) {
        bills.remove(getIndexByNumHouse(numhouse));
    }

    public void countBillByCodeHouse(String numhouse) {
        for (int i = 0; i < bills.size(); i++) {
            if (bills.get(i).getUser().getNumHouse().equals(numhouse)) {
                bills.get(i).getBill();
                bills.get(i).setStatus(true);
                doneBill.add(bills.remove(i));
            }
        }
    }

    public double getAllTotalBill() {                              //tính tổng bill
        double totalBill = 0;
        for (Bill b : doneBill) {
            totalBill += b.getBill();
        }
        return totalBill;
    }

    public void showAllBill() {                                 //hiển thị toàn bộ bill
        for (Bill b : bills) {
            System.out.println(b.toString());
        }
    }

    public void checkUser(String numHouse) {                       //check thông tin người dùng qua code
        for (Bill bill : bills) {
            if (bill.getUser().getNumHouse().equals(numHouse)) {
                System.out.println(bill.toString());
            } else System.out.println("không tìm thấy");
        }
    }

    public void checkDoneBill() {                             //check bil đã thanh toán
        for (Bill b : doneBill) {
            System.out.println(b.toString());
        }
    }

    public int getIndexByNumHouse(String numHouse) {
        int index = 0;
        for (int i = 0; i < bills.size(); i++) {
            if (bills.get(i).getUser().getNumHouse().equals(numHouse)) {
                index = i;
            }
        }
        return index;
    }

}
