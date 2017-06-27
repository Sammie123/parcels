import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Speed: please enter overnight or standard");
    String stringSpeed = myConsole.readLine();

    System.out.println("Please enter the distance of the package");
    String stringDistance = myConsole.readLine();
    int parcelDistance = Integer.parseInt(stringDistance);

    System.out.println("Please enter the length of the package");
    String stringLength = myConsole.readLine();
    int parcelLength = Integer.parseInt(stringLength);

    System.out.println("Please enter the width of the package");
    String stringWidth = myConsole.readLine();
    int parcelWidth = Integer.parseInt(stringWidth);

    System.out.println("Please enter the height of the package");
    String stringHeight = myConsole.readLine();
    int parcelHeight = Integer.parseInt(stringHeight);

    System.out.println("Please enter the weight of the package");
    String stringWeight = myConsole.readLine();
    Double parcelWeight = Double.parseDouble(stringWeight);

    Parcels parcelsOne = new Parcels(parcelLength, parcelWidth, parcelHeight, parcelWeight);
    double cost = parcelsOne.costToShip(stringSpeed,parcelDistance);

    System.out.println(cost);
  }
}
