package com.starbox.app.coffeshop.model;

@Component
public class InvoiceCalculator {


   private final Map<String, Double> itemsList;
   private final Map<String, Double> extras;

public ingredients(Map<String, Double> itemsList, Map<String, Double> extras) {
    @Value("#{${IngredientsMap}}")
    this.itemsList = itemsList;
    @Value("#{${extrasItemsMap}}")
    this.extras = extras;
}

private fifthItemPromotion(List<String> shoppingList, String desiredBeverage) {

    if(shoppingList.size() <4) {
        shoppingList.add(desiredBeverage);
    }
}


}