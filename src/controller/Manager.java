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

   public void addNewUser(User user){
        users.add(user);
   }
   public void addNewBill(Bill bill){
        addNewBill(bill);
   }        //thêm sửa xóa
   public void deleteUser(int index){
        users.remove(index);
   }
   public void deleteBill(int index){
        bills.remove(index);
   }
   public double getAllTotalBill(){                              //tính tổng bill
        double totalBill=0;
       for (Bill b:bills) {
           totalBill+=b.getBill();
       }
       return totalBill;
   }
   public void showAllBill(){                                 //hiển thị toàn bộ bill
       for (Bill b:bills) {
           System.out.println(b.toString());
       }
   }
   public void checkUser(String code){                       //check thông tin người dùng qua code
       for (User user:users) {
           if (user.getCode().equals(code)){
               System.out.println(user.toString());
           }
       }
   }
    public void checkDoneBill(){
        for (int i = 0; i < bills.size(); i++){
            if (!(bills.get(i).isStatus())){
                doneBill.add(bills.remove(i));     //xóa bill nào đã nộp tiền và add nó vào list bill đã nộp
            }
        }
        for (Bill b:doneBill) {
            System.out.println(b.getUser());
        }
    }
}
