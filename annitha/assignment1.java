import java.util.*;

class Employees
{
static int number;
static String name ;
static String address;
static int salary;
static int hours;
static void getdata()
{
Scanner k= new Scanner (System.in);
int op;
System.out.println("select option:[1]monthly,[2]weekly,[3]hourly");
op=k.nextInt();
if(op==1)
{
System.out.println("enter employee number");
number=	k.nextInt();
System.out.println("enter employee name");
name=k.next();
System.out.println("enter employee address");
address=k.next();
System.out.println("enter employee salary");
salary=k.nextInt();
int Result;
Result=salary-(((salary*2)/100)+((salary*5)/100));
System.out.println("your salary ="+Result);
}
else if(op==2)
{
System.out.println("enter employee number");
number=	k.nextInt();
System.out.println("enter employee name");
name=k.next();
System.out.println("enter employee address");
address=k.next();
System.out.println("enter employee salary");
salary=k.nextInt();
int Result;
Result=salary;
System.out.println("your salary ="+Result);	
}	
else if(op==3)
{
System.out.println("enter employee number");
number=	k.nextInt();
System.out.println("enter employee name");
name=k.next();
System.out.println("enter employee address");
address=k.next();
System.out.println("enter employee hourly rate");
salary=k.nextInt();
System.out.println("enter hours");
hours=k.nextInt();

int Result;
Result=(salary*hours)-((((salary*hours)*30)/100)+(((salary*hours)*3)/100));
System.out.println("your salary ="+Result);	
}
else
{
System.out.println("you enering imvalid option");
}
}

		
public static void main(String args[])
{
getdata();
}
}