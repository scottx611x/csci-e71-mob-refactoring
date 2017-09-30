package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {
    @Test
    public void fooQualityNeverNegative() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        testItem(items[0], "foo", -1, 0);
    }

    @Test
    public void fooAbove0() {
        Item[] items = new Item[] { new Item("foo", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        testItem(items[0], "foo", 9, 9);
        app.updateQuality();
        testItem(items[0], "foo", 8, 8);
    }

    @Test
    public void fooPastSellInDegradesBy2() {
        Item[] items = new Item[] { new Item("foo", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        testItem(items[0], "foo", -1, 8);
    }

    @Test
    public void agedBrieIncreasesQualityByOne() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        testItem(items[0], "Aged Brie", 4, 11);
        app.updateQuality();
        testItem(items[0], "Aged Brie", 3, 12);
    }

    @Test
    public void agedBriePastSellInIncreasesBy2() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        testItem(items[0], "Aged Brie", -1, 12);
    }

    @Test
    public void agedBrieIncreasesQualityNeverMoreThan50() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        testItem(items[0], "Aged Brie", -1, 50);
        app.updateQuality();
        testItem(items[0], "Aged Brie", -2, 50);
    }

    @Test
    public void sulfurasDoesNotAgeOrDegrade() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        testItem(items[0], "Sulfuras, Hand of Ragnaros", 5, 80);
    }

    @Test
    public void backstagePassesIncreasesQualityByOne() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 20, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        testItem(items[0], "Backstage passes to a TAFKAL80ETC concert", 19, 11);
    }

    void testItem(Item item, String expectedName, int expectedSellIn, int expectedQuality) {
        assertEquals(expectedName, item.name);
        assertEquals(expectedSellIn, item.sellIn);
        assertEquals(expectedQuality, item.quality);
    }

}
