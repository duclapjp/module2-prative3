package model;

public class Bill {
    private User user;
    private int oldNum;
    private int newNum;
    private boolean status = false;

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

    public Bill(User user) {
    }

    public Bill(User user, int oldNum, int newNum) {
        this.user = user;
        this.oldNum = oldNum;
        this.newNum = newNum;
        this.status = false;
    }

    public double getBill() {                             //tính tiền điện
        this.status = true;
        double result;
        return result = (newNum - oldNum) * 750;
    }

    @Override
    public String toString() {
        return "Bill{" +
                user + isStatus() +
                ", oldNum=" + oldNum +
                ", newNum=" + newNum + "số tiền điện là:" + getBill() +
                '}';
    }
}
