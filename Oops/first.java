package Oops;

public class first {
    public static void main(String args[]) {
        Pen p1 = new Pen();  //Constructor
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "PushpakKumar";
        myAcc.setPassword("abdefghi");

    }  
}

class BankAccount {
    public String username;
    @SuppressWarnings("unused")
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    } 
    
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;  //CGPA

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}