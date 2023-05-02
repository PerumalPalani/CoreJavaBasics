import java.util.Scanner;
class Kit {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
char department= 'C';
System.out.println("Enter the studing year:\n");
int year=sc.nextInt();
switch(year)
{
case 1:
System.out.println("English, Maths, Science");
break;
case 2:
switch(department)
{
case 'C':
System.out.println("Operating system, java, Data structure");
break;
case 'E':
System.out.println("Micro processor, logic switching theroy");
break;
case 'F':
System.out.println("Electro processor, logic switching theroy");
break;
case 'M':
System.out.println("drawing, Manufacturing machines");
break;
}
break;
case 3:
 switch( department )   
                {  
                    case 'C':  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                      case 'F':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break; 
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                }  
                break;  
            case 4:  
                switch( department )   
                {  
                    case 'C':  
                        System.out.println("Data Communication and Networks, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case 'F':  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case 'M':  
                        System.out.println("Production Technology, Thermal Engineering");  
                        break;  
                }  
                break;  
        }  

}}