import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TradeService {

    public List<List<Trade>> findTrades(int noOfWantedTrades, List<Trade> trades, int total) {
        List<int[]> combinationIndexes = SelectionRecursiveCombinationGenerator
                                             .generate(trades.size(),
                                                       noOfWantedTrades);

        List<List<Trade>> selectedTradesCombination = new ArrayList<>();

        combinationIndexes.forEach(combinationIndex -> {

            List<Trade> selectedTrades = new ArrayList<>(noOfWantedTrades);
            for (int i = 0; i < noOfWantedTrades; i++) {
                selectedTrades.add(trades.get(combinationIndex[i]));
            }

            int totalAmountOfSelectedTrades = selectedTrades.stream()
                                                            .map(Trade::getQuantity)
                                                            .reduce(0,
                                                                    Integer::sum);

            if (totalAmountOfSelectedTrades == total) {
                selectedTrades.sort(Comparator.comparingDouble(Trade::getMarketValue));
                selectedTradesCombination.add(selectedTrades);
            }
        });

        return selectedTradesCombination;


    }
}
