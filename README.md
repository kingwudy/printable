Printable
=========

A Java library to print string tables.

[![Build Status](https://travis-ci.org/ganchurin/printable.svg?branch=master)](https://travis-ci.org/ganchurin/printable) [![MIT License](http://img.shields.io/badge/license-MIT-green.svg)](https://github.com/ganchurin/constable/blob/master/LICENSE)

![](https://reposs.herokuapp.com/?path=ganchurin/constable)

News
----

01 Sep 2015 - version 0.1-alpha released!

Demo (periodic table)
---------------------

This is how two-dimensional array (periodic table) may look like after being processed by Constable.

    +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
    |/  |1  |2  |3  |4  |5  |6  |7  |8  |9  |10 |11 |12 |13 |14 |15 |16 |17 |18 |
    +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
    |1  |H  |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |He |
    +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
    |2  |Li |Be |   |   |   |   |   |   |   |   |   |   |B  |C  |N  |O  |F  |Ne |
    +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
    |3  |Na |Mg |   |   |   |   |   |   |   |   |   |   |Al |Si |P  |S  |Cl |Ar |
    +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
    |4  |K  |Ca |Mg |Ti |V  |Cr |Mn |Fe |Co |Ni |Cu |Zn |Ga |Ge |As |Se |Br |Kr |
    +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
    |5  |Rb |Sr |Y  |Zr |Nb |Mo |Tc |Ru |Rh |Pd |Ag |Cd |In |Sn |Sb |Te |I  |Xe |
    +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
    |6  |Cs |Br |*  |Hf |Ta |W  |Re |Os |Ir |Pt |Au |Hg |Tl |Pb |Bi |Po |At |Rn |
    +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
    |7  |Fr |Ra |** |Rf |Db |Sg |Bh |Hs |Mt |Ds |Rg |Cn |Uut|Fl |Uup|Lv |Uus|Uuo|
    +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+
    |8  |Uue|Ubn|***|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |
    +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+

Code:
```java
String[][] array = new String[][]{...};

DataSource source = new ArraySource(array);

String result = PrintFormatFactory.createFormat().format(source);
```
