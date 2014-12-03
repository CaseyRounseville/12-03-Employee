// placeholder for your Employee class
public class Employee
{
  String name;
  double hourlyWage;
  int hoursWorked;
  public Employee(String n,double wage,int hours)
  {
    name=n;
    hourlyWage=wage;
    hoursWorked=hours;
  }
  public String getName()
  {
    return name;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    return hourlyWage*hoursWorked;
  }
  public double getYearlySalary()
  {
    double weeklySalary=getWeeklySalary();
    return weeklySalary*52;
  }
  public String toString()
  {
    String worker="name: "+name+", wage: $"+hourlyWage+",hours: "+hoursWorked;
    return worker;
  }
  public void setName
  
