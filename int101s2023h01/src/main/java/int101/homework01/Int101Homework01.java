package int101.homework01;

import static work03.MyUtil.average;
import static work03.MyUtil.calculateBMI;

import work04.BankAccount;
import work04.Person;

public class Int101Homework01 {

    public static void main(String[] args) {
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
        work03UseOfUtilityClass();
        work04UseOfObjectClass();

    }
    static void work01Question(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6); 
       System.out.println("Work01:Question: b = " + b);
    }
    static void work01Answer(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
        boolean b = b1 ^ (b2 | b3) && b4 || (b5 & b6);
        System.out.println("Work01:Answer: b = " + b);

    }
    static void work02Question(int v1, int v2, int v3, int v4, int v5, int v6) {
        boolean b = (v1 << v2) < v3 != (v3 > ((v4 ^ v5) | v6));
       System.out.println("Work02:Question: b = " + b);
    }
    static void work02Answer(int v1, int v2, int v3, int v4, int v5, int v6) {
        boolean b = v1 << v2 < v3 != (v3 > (v4 ^ v5 | v6));
        System.out.println("Work02: Question: b = " + b);
    }

   static void work03UseOfUtilityClass() {
       System.out.println(calculateBMI(45, 155));
       System.out.println(average(9,7,10));
   }

   static void work04UseOfObjectClass() {

        Person dow = new Person(1);
        BankAccount account1 = new BankAccount(001, dow);

        account1.deposit(500);
        account1.withdraw(60);

        Person sevan = new Person(2);
        BankAccount account2 = new BankAccount(123, sevan);

        account1.transfer(60, account2);

        Person bas = new Person(109);
        BankAccount billionar = new BankAccount(89, bas);

        account1.transfer(10000, billionar);
        account2.transfer(50, account1);

       System.out.println(account1);
       System.out.println(account2);
       System.out.println(billionar);


   }
}
