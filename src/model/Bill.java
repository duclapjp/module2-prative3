package model;

public class Bill {
    private User user;
    private int oldNum;
    private int newNum;
    private boolean status=true;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getOldNum() {
        return oldNum;
    }

    public void setOldNum(int oldNum) {
        this.oldNum = oldNum;
    }

    public int getNewNum() {
        return newNum;
    }

    public void setNewNum(int newNum) {
        this.newNum = newNum;
    }

    public Bill() {
    }

    public Bill(User user, int oldNum, int newNum,boolean status) {
        this.user = user;
        this.oldNum = oldNum;
        this.newNum = newNum;
        this.status=status;
    }
    public double getBill(){                             //tính tiền điện
        this.status = false;
        double result;
        return result= (newNum-oldNum)*750;
    }
    @Override
    public String toString() {
        return "Bill{" +"chưa thanh toán "+
                "user=" + user +
                ", oldNum=" + oldNum +
                ", newNum=" + newNum +"số tiền điện là:"+getBill()+
                '}';
    }
}
