package absolutevalue;
import java.util.Scanner;

class AbsoluteValue {
  public static void main(String[] arg) {
    Absolute absol = new Absolute();
    absol.calcAbsol();
    absol.dispInfo();
  }
}
class Absolute {
int userint, absolutevalue = 0;
Absolute() {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter an integer value: ");
    userint = userInput.nextInt();
}
public void calcAbsol() {
  if (userint < 0) {
  absolutevalue = userint * -1;
  }
  else {
  absolutevalue = userint;
  }
}
public void dispInfo() {
  System.out.printf("The absolute value is: %d\n", absolutevalue);
   }
}