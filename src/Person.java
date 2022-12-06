import java.util.*;
public abstract class Person implements Comparable<Person>,Worker
{
    private int age;
    private int income;
    private int bills;

    public Person()
    {
        this.age = 21 + (int)(Math.random()*((85-21)+1));
        this.income = (int)(Math.random()*500000);
        this.bills = (int)(Math.random()*30000);
    }

    public Person(int age, int income, int bills)
    {
        this.age = age;
        this.income = income;
        this.bills = bills;
    }

    public final int getAge()
    {
        return age;
    }

    public final int getBills()
    {
        return bills;
    }

    public final int getIncome()
    {
        return income;
    }

    public void setIncome(int income)
    {
        this.income = income;
    }

    public void setBills(int bills)
    {
        this.bills = bills;
    }

    public abstract void doActivity();

    public int raiseSalary(int income)
    {
        int multiplier = (int)(Math.random()*5);
        int newIncome = income*multiplier;
        this.setIncome(newIncome);
        if(multiplier == 1 || multiplier == 0)
        {
            System.out.println("Your income has not been raised.");
        }
        else
        {
            System.out.println("Your new income is " + newIncome +
                    ". Your income has increased by " + multiplier + " times.");
        }
        return newIncome;
    }

    public int payBills(int billAmount, int amountPaid)
    {
        if(amountPaid == 0)
        {
            setBills(billAmount);
            return billAmount;
        }
        else
        {
            setBills(billAmount -1 );
            return payBills(billAmount-1, amountPaid-1);
        }
    }
    @Override
    public int compareTo(Person a)
    {
        if(income < a.getIncome())
        {
            return -1;
        }
        else if(income > a.getIncome())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
