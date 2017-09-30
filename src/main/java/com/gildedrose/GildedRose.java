package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            int sellIn = items[i].sellIn;

            items[i].quality = computeQuality(items[i].name, items[i].sellIn, items[i].quality);

            items[i].sellIn -= 1;
        }
    }
    
    public int computeQuality (String name, int sellIn, int quality) {
        boolean isConjured = name.toLowerCase().contains("conjured");
        boolean isAgedBrie = name.toLowerCase().contains("aged brie");
        boolean isBackstagePass = name.toLowerCase().contains("backstage passes");
        boolean isSulfuras = name.toLowerCase().contains("sulfuras");

        if (isSulfuras)
            return quality;

        int qualityChange = 0;

        if (isAgedBrie) {
            if (sellIn <= 0) {
                qualityChange = +2;
            } else {
                qualityChange = +1;
            }
        }
        else if (isBackstagePass) {
            if (sellIn < 11) {
                qualityChange = +2;
            }
            else if (sellIn < 6) {
                qualityChange = +3;
            }
            else if (sellIn < 0){
                qualityChange = -1 * quality;
            } else
            {
                qualityChange = +1;
            }
        }
        else {
            if (sellIn <= 0) {
                qualityChange = -2;
            } else {
                qualityChange = -1;
            }
        }

        if(isConjured && qualityChange < 0){
            qualityChange = qualityChange * 2;
        }

        int newQuality = quality + qualityChange;

        newQuality = Math.min(newQuality, 50);
        newQuality = Math.max(newQuality, 0);

        return newQuality;
        
    }
}