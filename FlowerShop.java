package FlowerShopManagement;

import java.util.ArrayList;

public class FlowerShop {

    private ArrayList<Flower> flowers;
    private ArrayList<Customer> customers;

    public FlowerShop() {
        flowers = new ArrayList<>();
        customers = new ArrayList<>();
    }

    //add new fl to flShop
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    //add new customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    //buy flowers
    public void buyFlower(String origin, String phone) {
        Flower flower = findFlowerbyOrigin(origin);
        if (flower != null && !flower.soldOut()) {
            flower.soldOut();
            System.out.println("");
        } else {
            System.out.println("The flower is not available.");
        }
    }

    // Find fl by origin
    private Flower findFlowerbyOrigin(String origin) {
        for (Flower flower : flowers) {
            if (flower.getOrigin().equals(origin)) {
                return flower;
            }
        }
        return null;
    }
    
    // List all flowers
    public ArrayList<Flower> listFlowers() {
        return flowers;
    }
    // List sold out flowers
    public ArrayList<Flower> listSoldOutFlowers() {
        ArrayList<Flower> soldOutFlowers = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.soldOut()) {
                soldOutFlowers.add(flower);
            }
        }
        return soldOutFlowers;
    }
    // List available flowers
    public ArrayList<Flower> listAvailableFlower() {
        ArrayList<Flower> availableFlowers = new ArrayList<>();
        for (Flower flower : flowers) {
            if (!flower.soldOut()) {
                availableFlowers.add(flower);
            }
        }
        return availableFlowers;
    }
    //Total flowers 
    public int gettotalFlower() {
        return flowers.size();
    }
}
