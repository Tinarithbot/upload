import java.util.*;  
class UserInputDemo   
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    



int y=sc.nextInt();
int Your_Number=y;
for (int x = 0; x <= Your_Number;x++) {

if (x*x == Your_Number) { System.out.println("Thesquare root of " +Your_Number +" is " + x);break;

} else if (x * x !=Your_Number) {

System.out.println("This is not a perfect number"); }

}
}
}
