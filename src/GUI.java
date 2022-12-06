import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI implements ActionListener
{
    private JFrame frame;
    private JButton randomPerson;
    private JButton doActivity;
    private JButton doWork;
    private JButton raiseSalary;
    private JButton payBills;
    private JButton compare;

    public GUI()
    {

        randomPerson = new JButton("Random Person");
        doWork = new JButton("Do work");
        doActivity = new JButton("Do activity");
        raiseSalary = new JButton("Raise salary");
        payBills = new JButton("Pay Bills");
        compare = new JButton("Compare");
        randomPerson.addActionListener(this);
        doWork.addActionListener(this);
        doActivity.addActionListener(this);
        raiseSalary.addActionListener(this);
        payBills.addActionListener(this);
        compare.addActionListener(this);


        frame = new JFrame("Person Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());
        frame.add(randomPerson);
        frame.add(doWork);
        frame.add(doActivity);
        frame.add(raiseSalary);
        frame.add(payBills);
        frame.add(compare);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        int random = (int)(Math.random()*2);
        JFrame newFrame = new JFrame();
        Person p3 = new Accountant();
        Person p4 = new Analyst();

        if(e.getSource() == randomPerson)
        {
            if(random == 0)
            {
                JLabel aLabel = new JLabel("Accountant created with the following " +
                        "Age: " + p3.getAge()  + " Income: " + p3.getIncome()  + " Bills: " + p3.getBills());
                newFrame.add(aLabel);
                newFrame.pack();
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setVisible(true);

            }
            else if(random == 1)
            {
                JLabel bLabel = new JLabel("Analyst created with the following " +
                        "Age: " + p4.getAge() + " Income: " + p4.getIncome() + " Bills: " + p4.getBills());
                newFrame.add(bLabel);
                newFrame.pack();
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setVisible(true);
            }
        }
        else if(e.getSource() == doWork)
        {
            if(random == 0)
            {
                p3.doWork("src/info", "src/file");
                JLabel doWorkLabel = new JLabel("Please check the file to see work done by Accountant. ");
                newFrame.add(doWorkLabel);
                newFrame.pack();
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setVisible(true);
            }
            else if(random == 1)
            {
                p4.doWork("src/info", "src/file");
                JLabel doWorkLabel1 = new JLabel("Please check the file to see work done by Analyst. ");
                newFrame.add(doWorkLabel1);
                newFrame.pack();
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setVisible(true);
            }

        }
        else if(e.getSource() == doActivity)
        {
            if(random == 0)
            {
                p3.doActivity();
                JLabel doThings = new JLabel("Accountant is buying things, please see run tab on IDE for more information. ");
                newFrame.add(doThings);
                newFrame.pack();
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setVisible(true);
            }
            else if(random == 1)
            {
                p4.doActivity();
                JLabel doThings1 = new JLabel("Analyst is cleaning, please see run tab on IDE for more information. ");
                newFrame.add(doThings1);
                newFrame.pack();
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setVisible(true);
            }
        }
        else if(e.getSource() == raiseSalary)
        {
            if(random == 0)
            {
                int p3income = p3.getIncome();
                p3.raiseSalary(p3income);
                int p3newIncome = p3.getIncome();
                JLabel raiseSalaryLabel = new JLabel("Current income: " + p3income + " Income is now: "
                        + p3newIncome);
                newFrame.add(raiseSalaryLabel);
                newFrame.pack();
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setVisible(true);
            }
            else if(random == 1)
            {
                int p4income = p4.getIncome();
                p3.raiseSalary(p4income);
                int p4newIncome = p4.getIncome();
                JLabel raiseSalaryLabel = new JLabel("Current income: " + p4income + " Income is now: "
                        + p4newIncome);
                newFrame.add(raiseSalaryLabel);
                newFrame.pack();
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setVisible(true);
            }
        }
        else if(e.getSource() == payBills)
        {
            int p3payAmount = (int)(Math.random()*p3.getBills());
            int p4payAmount = (int)(Math.random()*p4.getBills());
            if(random == 0)
            {
                int p3Bill = p3.getBills();
                p3.payBills(p3.getBills(), p3payAmount);
                int p3newBill = p3.getBills();
                JLabel payBillsLabel = new JLabel("Bills are: " + p3Bill + " Amount paid is: "
                        + p3payAmount + " Bills are now: " + p3newBill);
                newFrame.add(payBillsLabel);
                newFrame.pack();
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setVisible(true);
            }
            else if(random == 1)
            {
                int p4Bill = p4.getBills();
                p4.payBills(p4.getBills(), p4payAmount);
                int p4newBill = p4.getBills();
                JLabel payBillsLabel1 = new JLabel("Bills are: " + p4Bill + " Amount paid is: "
                        + p4payAmount + " Bills are now: " + p4newBill);
                newFrame.add(payBillsLabel1);
                newFrame.pack();
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setVisible(true);
            }
        }
        else if(e.getSource() == compare)
        {
            JLabel result0 = new JLabel("Incomes are equal. ");

            if(random == 0)
            {
                int compare = p3.compareTo(p4);
                if(compare == 0)
                {
                    newFrame.add(result0);
                    newFrame.pack();
                    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newFrame.setVisible(true);
                }
                else if(compare == 1)
                {
                    JLabel result1 = new JLabel("Accountant's income is greater than Analyst's income. ");
                    newFrame.add(result1);
                    newFrame.pack();
                    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newFrame.setVisible(true);

                }
                else if(compare == -1)
                {
                    JLabel result_1 = new JLabel("Analyst's income is greater than Accountant's income. ");
                    newFrame.add(result_1);
                    newFrame.pack();
                    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newFrame.setVisible(true);
                }
            }
            else if(random == 1)
            {
                int compare1 = p4.compareTo(p3);
                if(compare1 == 0)
                {
                    newFrame.add(result0);
                    newFrame.pack();
                    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newFrame.setVisible(true);
                }
                else if(compare1 == 1)
                {
                    JLabel result2 = new JLabel("Analyst's income is greater than Accountant's income. ");
                    newFrame.add(result2);
                    newFrame.pack();
                    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newFrame.setVisible(true);
                }
                else if(compare1 == -1)
                {
                    JLabel result_2 = new JLabel("Accountant's income is greater than Analyst's income. ");
                    newFrame.add(result_2);
                    newFrame.pack();
                    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newFrame.setVisible(true);
                }
            }
        }

    }
    public static void main(String args[])
    {
        GUI gui = new GUI();
    }

}
