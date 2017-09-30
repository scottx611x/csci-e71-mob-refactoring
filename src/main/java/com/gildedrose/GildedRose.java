package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {


            int sellIn = items[i].sellIn;
            
            int quality = computeQuality(items[i].name,items[i].sellIn,items[i].quality);
            

            int qualityChange = 0;

            if (isAgedBrie) {

            }
            else if (isBackstagePass) {
                if (sellIn < 11) {
                    qualityChange = -2;
                }
                else if (sellIn < 6) {
                    qualityChange = -3;
                }
                else if (sellIn < 0){
                    qualityChange
                }
            }
            else if (isSulfuras) {
                qualityChange = 0;
            }
            else {
                qualityChange = -1;
            }




            items[i].quality = Math.min(items[i].quality, 50);
            items[i].quality = Math.max(items[i].quality, 0);




            if (!items[i].name.contains().equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

           /* if (!items[i].name.equals("Conjured")) {
                items[i].sellIn = items[i].sellIn - 1;
            }*/

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
    
    public int computeQuality (String name, int sellIn, int quality){

        boolean isConjured = items[i].name.toLowerCase().contains("Conjured");

        boolean isAgedBrie = items[i].name.toLowerCase().contains("Aged Brie");
        boolean isBackstagePass = items[i].name.toLowerCase().contains("Backstage passes");
        boolean isSulfuras = items[i].name.toLowerCase().contains("Sulfuras");

        int qualityChange = 0;

            if (isAgedBrie) {
                    if (sellIn < 0) {
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
            else if (isSulfuras) {
                qualityChange = 0;
            }
            else {
                qualityChange = -1;
            }
        
        return 0;
        
    }
}