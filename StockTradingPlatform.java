import java.util.Scanner;
public class StockTradingPlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stock apple = new Stock("Apple", 150);
        Stock tesla = new Stock("Tesla", 250);
        Stock google = new Stock("Google", 200);
        Stock microsoft = new Stock("Microsoft", 180);
        Stock amazon = new Stock("Amazon", 220);
        Stock netflix = new Stock("Netflix", 170);
        Stock meta = new Stock("Meta", 190);
        Stock reliance = new Stock("Reliance", 300);
        Stock infosys = new Stock("Infosys", 140);
        Stock tcs = new Stock("TCS", 210);

        Portfolio portfolio = new Portfolio();

        int choice;

        do {
            System.out.println("\n===== Stock Trading Platform =====");
            System.out.println("1. View Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View My Stock");
            System.out.println("5. View Portfolio");
            System.out.println("6. View Profit/Loss");
            System.out.println("7. View Transactions");
            System.out.println("8. Save Portfolio");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Market.viewStocks();
                    break;

                case 2:
                    Market.viewStocks();
                    System.out.print("Choose stock: ");
                    int buyChoice = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int buyQty = sc.nextInt();

                    if (buyChoice == 1)
                        portfolio.buyStock(apple, buyQty);
                    else if (buyChoice == 2)
                        portfolio.buyStock(tesla, buyQty);
                    else if (buyChoice == 3)
                        portfolio.buyStock(google, buyQty);
                    else if (buyChoice == 4)
                        portfolio.buyStock(microsoft, buyQty);
                    else if (buyChoice == 5)
                        portfolio.buyStock(amazon, buyQty);
                    else if (buyChoice == 6)
                        portfolio.buyStock(netflix, buyQty);
                    else if (buyChoice == 7)
                        portfolio.buyStock(meta, buyQty);
                    else if (buyChoice == 8)
                        portfolio.buyStock(reliance, buyQty);
                    else if (buyChoice == 9)
                        portfolio.buyStock(infosys, buyQty);
                    else if (buyChoice == 10)
                        portfolio.buyStock(tcs, buyQty);
                    break;

                case 3:
                    Market.viewStocks();
                    System.out.print("Choose stock: ");
                    int sellChoice = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int sellQty = sc.nextInt();

                    if (sellChoice == 1)
                        portfolio.sellStock(apple, sellQty);
                    else if (sellChoice == 2)
                        portfolio.sellStock(tesla, sellQty);
                    else if (sellChoice == 3)
                        portfolio.sellStock(google, sellQty);
                    else if (sellChoice == 4)
                        portfolio.sellStock(microsoft, sellQty);
                    else if (sellChoice == 5)
                        portfolio.sellStock(amazon, sellQty);
                    else if (sellChoice == 6)
                        portfolio.sellStock(netflix, sellQty);
                    else if (sellChoice == 7)
                        portfolio.sellStock(meta, sellQty);
                    else if (sellChoice == 8)
                        portfolio.sellStock(reliance, sellQty);
                    else if (sellChoice == 9)
                        portfolio.sellStock(infosys, sellQty);
                    else if (sellChoice == 10)
                        portfolio.sellStock(tcs, sellQty);
                    break;

                case 4:
                    portfolio.myStocks() ;
                    break;

                case 5:
                    portfolio.viewPortfolio();
                    break;

                case 6:
                    portfolio.viewProfitLoss();
                    break;

                case 7:
                    portfolio.viewTransactions();
                    break;

                case 8:
                    portfolio.savePortfolio();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}