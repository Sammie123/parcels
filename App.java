import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    Console myConsole = System.console();
    boolean programRunning = true;
    List<Parcels> allParcels = new ArrayList<Parcels>();
    while (programRunning) {

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

      allParcels.add(parcelsOne);

      for (Parcels individualParcel : allParcels) {
        System.out.println("--------------------");
        System.out.println("Length: " + individualParcel.mLength);
        System.out.println("Width: " + individualParcel.mWidth);
        System.out.println("Height: " + individualParcel.mHeight);
        System.out.println("Weight: " +individualParcel.mWeight);
      }

      int volume = parcelsOne.calculateVolume();
      System.out.println("Volume is " + volume);

      double cost = parcelsOne.costToShip(stringSpeed,parcelDistance);
      System.out.println("Cost is " + cost);

      System.out.println("Do you want to ship another package? Enter Yes or No");
      String userInput = myConsole.readLine();
      if (userInput.equals("No")) {
        for (Parcels individualParcel: allParcels) {
          System.out.println("--------------------");
          System.out.println("Length: " + individualParcel.mLength);
          System.out.println("Width: " + individualParcel.mWidth);
          System.out.println("Height: " + individualParcel.mHeight);
          System.out.println("Weight: " +individualParcel.mWeight);
        }
          programRunning = false;
      }
    }
  }
}
