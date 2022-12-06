# cs49j_finalproject
### GitHub Link: https://github.com/priscillac1015/cs49j_finalproject.git
### Link to Presentation: https://docs.google.com/presentation/d/1c75BT38U2TNV3Gnd0euXH69T8c_Zr7uYHgJEhRue9dk/edit?usp=sharing
Worker interface has one method and is implemented by Person class. <br />
Person class implements Comparable and Worker interface.  Person class is abstract and has setters and getters for private instance variables.  Person class has 4 methods aside from setters and getters. <br />
raiseSalary method is takes the person's income as a parameter and multiplies it by a random number between 0-4. <br />
payBills method is a recursive method which takes two ints as parameters, one is the person's bill's and the other is the amount paid.  This method subtracts the amount paid from the person's bills. <br />
compareTo method is a method in Comparable interface and Person class overrides it.  This method takes a Person object as a parameter and compares the incomes of two persons. <br />
doActivity method is abstract and takes no parameters. <br />
There are two subclasses: Analyst and Accountant. <br />
Analyst class has two methods.  Analyst class overrides doWork method from Worker interface and doActivity method from Person class. <br />
doWork method in Analyst class takes two string parameters.  This method reads numbers from a file called info and calculates the average of those numbers and write it out onto a new file called file. <br />
doActivity method in Analyst class takes no parameters.  This method uses an array and pushes elements of the array into a stack and then pops the elements out of the stack until the stack is empty. <br />
Accountant class has three methods .  Accountant class overrides doWork method from Worker interface and doActivity method from Person class. <br />
doWork method in Accountant class takes two string parameters.  This method reads numbers from a file called info and calculates income tax of each number then writes it onto a new file called file. <br />
calculateIncomeTax takes in a double parameter and multiplies it accordingly by the tax percentage for each income.  This method returns a double. <br />
doActivity method in Accountant class takes no parameters.  This method uses an array and pushes elements of the array into a stack and then pops the elements out of the stack until the stack is empty. <br />
GUI class implements ActionListener interface.  There is a constructor where the main frame is built.  GUI class overrides actionPerformed method. <br />
actionPerformed method takes a parameter ActionEvent and processes what happens after a button is clicked on the main frame.  It will display a new frame for the button that is pressed. <br />
GUI class has main method where new GUI object is created which shows the GUI. <br />
To run program: open zip file with intelliJ, run GUI class. No additional libraries need to be installed. Oracle OpenJDK version 18.0.2 <br />
