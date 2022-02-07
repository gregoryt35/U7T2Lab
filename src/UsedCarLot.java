import java.util.ArrayList;

/**
 * This class represents a Used Car Lot
 *
 * @author Gregory Tomchuk
 */
public class UsedCarLot {

    /**
     * A private instance variable which stores multiple Car objects
     */
    private ArrayList<Car> inventory;

    /**
     * Instantiates a UsedCarLot object
     */
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the inventory of UsedCarLot
     * @return the inventory of UsedCarLot
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /**
     * Adds a new Car object to inventory at the last index
     * @param car The new Car object being added to inventory
     */
    public void addCar(Car car) {
        inventory.add(car);
    }

    /**
     * Swaps the locations of two Car objects within inventory
     * @param idx1 The index of the first Car object
     * @param idx2 The index of the second Car object
     * @return Whether the swap was successful or not
     */
    public boolean swap(int idx1, int idx2) {
        if (idx1 < inventory.size() && idx2 < inventory.size() && idx1 >= 0 && idx2 >= 0) {
            Car replacedCar = inventory.set(idx1, inventory.get(idx2));
            inventory.set(idx2, replacedCar);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Adds a Car object at a specific index to inventory
     * @param indexToAdd The index at which the Car object will be added
     * @param carToAdd The Car object being added at index
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Removes a Car object at a specific index and shifts inventory
     * <p>
     * PRECONDITION: 0 &lt;= indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell The index at which the Car object is being removed from inventory
     * @return The Car object that is being removed from inventory
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /**
     * Removes a Car object at a specific index and does not shift inventory
     * <p>
     * PRECONDITION: 0 &lt;= indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell The index at which the Car object is being removed from inventory
     * @return The Car object that is being removed from inventory
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        return inventory.set(indexOfCarToSell, null);
    }

    /**
     * Moves a Car object to a new index of inventory
     * <p>
     * PRECONDITION: 0 &lt;= indexOfCarToMove &lt; inventory.size()
     * <p>
     * PRECONDITION: 0 &lt;= destinationIndex &lt; inventory.size()
     * @param indexOfCarToMove The index at which the Car object is being moved from
     * @param destinationIndex The index at which the Car object is being moved to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car movingCar = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, movingCar);
    }

}