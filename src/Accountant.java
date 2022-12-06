import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;

public class Accountant extends Person
{
    public Accountant(int age, int income, int bills)
    {
        super(age, income, bills);
    }
    public Accountant()
    {
        super();
    }

    public double calculateIncomeTax(double num)
    {
        double incomeTax;
        if (num > 578125)
        {
            incomeTax = num * 0.37;
            return incomeTax;
        }
        else if (num > 231250)
        {
            incomeTax = num * 0.35;
            return incomeTax;
        }
        else if (num > 182100)
        {
            incomeTax = num * 0.32;
            return incomeTax;
        }
        else if (num > 95375)
        {
            incomeTax = num * 0.24;
            return incomeTax;
        }
        else if (num > 44725)
        {
            incomeTax = num * 0.22;
            return incomeTax;
        }
        else if (num > 11000)
        {
            incomeTax = num * 0.12;
            return incomeTax;
        }
        else
        {
            incomeTax = num * 0.10;
            return incomeTax;
        }
    }


    @Override
    public void doWork(String info, String file)
    {
        File inputFile = new File(info);
        try (Scanner reader = new Scanner(inputFile); PrintWriter out = new PrintWriter(file))
        {

            while (reader.hasNextLine())
            {
                String line = reader.next();
                Scanner lineReader = new Scanner(line);
                while (lineReader.hasNext())
                {
                    if (lineReader.hasNextInt() || lineReader.hasNextDouble())
                    {
                        double num = lineReader.nextDouble();
                        out.write("Income tax is " + calculateIncomeTax(num));
                        out.write("\n");

                    }
                    else
                    {
                        lineReader.nextLine();
                    }
                }

            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
    }

    @Override
    public void doActivity()
    {
        String [] items = new String[7];

        items[0] = "Candy";
        items[1] = "Bread";
        items[2] = "Chicken";
        items[3] = "Rice";
        items[4] = "Beef";
        items[5] = "Pasta";
        items[6] = "Ice cream";

        Stack<String> shoppingList = new Stack();
        for(int i = 0; i < ((int)(Math.random()*7)); i++)
        {
            shoppingList.push(items[(int)(Math.random()*7)]);
        }

        if(shoppingList.size() == 0)
        {
            System.out.println("Don't need to go shopping today.");
        }
        else
        {
            System.out.println("Your shopping list is: " + shoppingList);
            while(!shoppingList.empty())
            {
                System.out.println("Buying " + shoppingList.pop());
                if(shoppingList.empty())
                {
                    System.out.println("Bought everything.");
                }

            }

        }
    }
}

