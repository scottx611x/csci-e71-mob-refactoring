# csci-e71-mob-refactoring [![Build Status](https://travis-ci.org/scottx611x/csci-e71-mob-refactoring.svg?branch=master)](https://travis-ci.org/scottx611x/csci-e71-mob-refactoring) [![codecov](https://codecov.io/gh/scottx611x/csci-e71-mob-refactoring/branch/master/graph/badge.svg)](https://codecov.io/gh/scottx611x/csci-e71-mob-refactoring)

[Mob Programming Video link](https://photos.app.goo.gl/SFpIqgjfMOmwRSaR2)

### Solution Statement:
We used [GoToMeeting](https://www.gotomeeting.com/) for our mob programming solution.  The GoToMeeting software allowed us to share desktops and simulate the mob programming experience we had in class.  GitHub was used to share code, and we pushed/pulled our code whenever we changed drivers.

### Unique Code Smells:
- [Many nested if/elses adding unnecesary complexity](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/master/Java/src/main/java/com/gildedrose/GildedRose.java#L11-L37)
- [Large unmaintainable methods](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/master/Java/src/main/java/com/gildedrose/GildedRose.java#L10)
- Duplicate hardcoded strings [here](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/master/Java/src/main/java/com/gildedrose/GildedRose.java#L13) & [here](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/master/Java/src/main/java/com/gildedrose/GildedRose.java#L45)
- [Magic numbers](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/master/Java/src/main/java/com/gildedrose/GildedRose.java#L20)
- Duplicated Logic [here](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/master/Java/src/main/java/com/gildedrose/GildedRose.java#L55-L57) & [here](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/master/Java/src/main/java/com/gildedrose/GildedRose.java#L20-L21)
