import java.util.HashMap;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Portfolio {
    HashMap<String, Integer> holdings = new HashMap<>();
    ArrayList<String> transactions = new ArrayList<>();
    double balance = 10000;
    double invested = 0;

    public void buyStock(Stock stock, int quantity) {
        double cost = stock.price * quantity;

        if (balance >= cost) {
            balance -= cost;
            invested += cost;
            holdings.put(stock.name,
                    holdings.getOrDefault(stock.name, 0) + quantity);

            transactions.add("Bought " + quantity + " shares of " + stock.name);
            System.out.println("Stock Purchased Successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void sellStock(Stock stock, int quantity) {
        if (holdings.containsKey(stock.name)
                && holdings.get(stock.name) >= quantity) {

            holdings.put(stock.name,
                    holdings.get(stock.name) - quantity);

            double amount = stock.price * quantity;
            balance += amount;

            transactions.add("Sold " + quantity + " shares of " + stock.name);
            System.out.println("Stock Sold Successfully!");
        } else {
            System.out.println("Not enough shares!");
        }
    }

    public void myStocks() {
    System.out.println("\n===== My Stocks =====");

    if (holdings.isEmpty()) {
        System.out.println("You have not purchased any stocks.");
    } else {
        for (String stock : holdings.keySet()) {
            if (holdings.get(stock) > 0) {
                System.out.println(stock + " : " + holdings.get(stock) + " shares");
            }
        }
    }
}

    public void viewPortfolio() {
        System.out.println("\n===== Portfolio =====");

        if (holdings.isEmpty()) {
            System.out.println("No stocks owned.");
        } else {
            for (String stock : holdings.keySet()) {
                System.out.println(stock + " : " + holdings.get(stock) + " shares");
            }
        }

        System.out.println("Balance: ₹" + balance);
    }

    public void viewProfitLoss() {
    double currentValue = balance;
    double result = currentValue - invested;

    if (result > 0) {
        System.out.println("Profit: ₹" + result);
    } 
    else if (result < 0) {
        System.out.println("Loss: ₹" + Math.abs(result));
    } 
    else {
        System.out.println("No Profit No Loss");
    }
    }

    public void viewTransactions() {
        System.out.println("\n===== Transactions =====");

        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String t : transactions) {
                System.out.println(t);
            }
        }
    }

    public void savePortfolio() {
        try {
            FileWriter writer = new FileWriter("portfolio.txt");

            writer.write("Portfolio Data\n");
            writer.write("Balance: ₹" + balance + "\n");

            for (String stock : holdings.keySet()) {
                writer.write(stock + " : " + holdings.get(stock) + " shares\n");
            }

            writer.close();
            System.out.println("Portfolio Saved Successfully!");
        } catch (IOException e) {
            System.out.println("Error saving portfolio.");
        }
    }
}