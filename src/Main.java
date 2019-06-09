import java.util.Arrays;
import java.util.List;

public class Main {

    private static final int R = 3;


    private static final int TOTAL = 99;

    public static void main(String[] args) {

        Trade trade1 = new Trade("1",
                                 23,
                                 12.5);
        Trade trade2 = new Trade("2",
                                 14,
                                 21.5);
        Trade trade3 = new Trade("3",
                                 100,
                                 112.4);
        Trade trade4 = new Trade("4",
                                 44,
                                 222.5);
        Trade trade5 = new Trade("5",
                                 55,
                                 712.2);
        Trade trade6 = new Trade("6",
                                 55,
                                 612.2);
        Trade trade7 = new Trade("7",
                                 15,
                                 1512.2);
        Trade trade8 = new Trade("8",
                                 45,
                                 5212.2);
        Trade trade9 = new Trade("9",
                                 52,
                                 124512.2);
        Trade trade10 = new Trade("10",
                                  65,
                                  53513.2);

        List<Trade> allTrades = List.of(trade1,
                                        trade2,
                                        trade3,
                                        trade4,
                                        trade5,
                                        trade6,
                                        trade7,
                                        trade8,
                                        trade9,
                                        trade10);


        TradeService tradeService = new TradeService();

        List<List<Trade>> selectedTrades = tradeService.findTrades(R,
                                                                   allTrades,
                                                                   TOTAL);

        if (selectedTrades.isEmpty()) {
            System.out.println("trades not found");
        }

        selectedTrades.forEach(selectedTrade -> System.out.println(selectedTrade.toString()));

    }


}
