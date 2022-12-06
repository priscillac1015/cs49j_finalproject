import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Analyst extends Person
{
    public Analyst(int age, int income, int bills)
    {
        super(age, income, bills);
    }
    public Analyst()
    {
        super();
    }


    @Override
    public void doWork(String info, String file)
    {
        File inputFile = new File(info);
        try (Scanner reader = new Scanner(inputFile); PrintWriter out = new PrintWriter(file))
        {
            int num, average, total = 0, count = 0;
            while(reader.hasNextLine())
            {
                String line = reader.next();
                Scanner lineReader = new Scanner(line);
                while(lineReader.hasNext())
                {
                    if(lineReader.hasNextInt())
                    {
                        num = lineReader.nextInt();
                        total +=num;
                        count++;
                    }
                    else
                    {
                        lineReader.nextLine();
                    }
                }

            }
            average = total / count;
            out.write("The average income is " + average);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }

    }

    @Override
    public void doActivity()
    {
        String [] areas = new String[5];

        areas[0] = "Bathroom";
        areas[1] = "Kitchen";
        areas[2] = "Living Room";
        areas[3] = "Bedroom";
        areas[4] = "Patio";

        Stack<String> cleaningList = new Stack();
        for(int i = 0; i < ((int)(Math.random()*5)); i++)
        {
            cleaningList.push(areas[(int)(Math.random()*5)]);
        }

        if(cleaningList.size() == 0)
        {
            System.out.println("Don't need to go clean today.");
        }
        else
        {
            System.out.println("Need to clean the following areas: " + cleaningList);
            while(!cleaningList.empty())
            {
                System.out.println("Cleaning " + cleaningList.pop());
                if(cleaningList.empty())
                {
                    System.out.println("Cleaned everything.");
                }

            }

        }
    }

}

