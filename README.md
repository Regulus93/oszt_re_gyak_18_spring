## Szerver-kliens
0. Készíts egy szervert és egy klienst. A szerver induljon el egy porton (ami parancssori paraméterként adott), a kliens csatlakozzon hozzá, és küldjön át egy üzenetet. A szerver írja ki az üzenetet a sztenderd kimenetére.

1. A szerver küldje vissza a kliensnek az üzenetet, és a kliens írja ki azt.

2. A szerver paraméterként kapjon egy szöveget is. A kliens küldjön át egy számot; a szerver egy sorban válaszoljon egy olyan szöveggel, amely a paraméterként kapott szövegét ennyiszer tartalmazza.
  
    a) A feladatnak van egy egyszerű nem túl hatékony (azaz: rossz futási karakterisztikájú) megoldása. Ha a kliens által küldött szám n, akkor milyen nagyságrendű lépést tesz meg (és mekkora memóriát foglal) ez a megoldás?
  
    b)Van két hatékony megoldás is, ami természetesen adódik, az egyik hasonlít az előzőleg említett megoldásra, a másik nem.
    -- Ezek milyen nagyságrendűek?
    -- Próbáld ki sok adattal őket annak igazolására, hogy sokkal hatékonyabbak.
    -- A kettő közül hatékonyabb-e egyik a másiknál?

3. A kliens küldjön át sorban egész számokat a szervernek. A számokat a kliens egy fájlból olvassa be. A szerver mindegyik számra meghív egy függvényt, ami egész számot készít (mondjuk  n ↦ 2*n+1), majd az eredményt visszaküldi a kliensnek. A kliens a visszakapott eredményeket egy fájlba írja ki sorban. Ha a 0 szám következne a kliensoldalon, akkor a kliens kilép.

  
    a) A kliens most küldje át az összes adatot a szervernek, és csak utána fogadja a visszaérkező számokat; hasonlóan, a szerver fogadja az összes számot, és csak utána küldje el őket átalakítva a kliensnek.
  
    b) A szerver várakozzon a kliens kilépése után új kliensre, és ez ismétlődjön a végtelenségig.

4. A kliens átküld egy fájlnevet a szervernek. A szerver küldje vissza a fájl tartalmát soronként, ha a fájl létezik, különben pedig egy szöveges hibaüzenetet.

5. A szerver tárolja el, hogy hány kliens kapcsolódott már hozzá. Amikor egy kliens kapcsolódik, a szerver írja ezt vissza neki, majd rögtön bontsa a kapcsolatot, és várakozzon újabb kliensre.

6. A szerver tároljon el egy számot, ennek értéke legyen kezdetben 0. Miután kapcsolódott, a kliens egymás után egész számokat küld át a szervernek; a szerver a kapott értékkel megnöveli a benne tárolt értéket, és ezt át is küldi a kliensnek. A kliens ki is léphet (pl. ha nullát küldene), ekkor a szerver kezdjen várakozni egy újabb klienstől jövő kapcsolatra. A tárolt szám maradjon meg, ne törlődjön.

7. A szerverhez kapcsolódjon két kliens egymás után (ugyanazon a porton) úgy, hogy a szerver mindkét kapcsolatot egyszerre tartja nyitva. A kliensek először egy-egy sorban a saját nevüket küldik át, majd felváltva írhatnak be egy-egy sornyi szöveget. A beírt üzeneteket küldje át a szerver a másik kliensnek ilyen alakban: <másik kliens neve>: <másik kliens üzenete>. Ha valamelyik kliens bontja a kapcsolatot, akkor a szerver zárja be a másik klienssel a kapcsolatot, és lépjen ki.

  
    a) Ha az egyik kliens bontja a kapcsolatot, akkor a szerver várakozzon egy újabb kliensre, aki kapcsolódás után átveszi az előző helyét. Természetesen az új kliens is először a saját nevét küldi át.
  
    b) A porton tetszőlegesen sok kliens kapcsolódhat, és bármikor ki is léphetnek. A szerver sorban engedi szóhoz jutni a klienseket, azonban az üzeneteket nem azonnal küldi el mindegyik másik kliensnek. Ehelyett a szerver összegyűjti az üzeneteket, és csak akkor küldi el az adott kliens számára szóló üzeneteket, amikor az éppen szóhoz jut.

8. A szerverhez kapcsolódjon két kliens egymás után (ugyanazon a porton) úgy, hogy a szerver mindkét kapcsolatot egyszerre tartja nyitva. A kliensek először egy-egy sorban a saját nevüket küldik át, majd felváltva írhatnak be egy-egy sornyi szöveget. A beírt üzeneteket küldje át a szerver a másik kliensnek ilyen alakban: <másik kliens neve>: <másik kliens üzenete>. Ha valamelyik kliens bontja a kapcsolatot, akkor a szerver zárja be a másik klienssel a kapcsolatot, és lépjen ki.

	a) Ha az egyik kliens bontja a kapcsolatot, akkor a szerver várakozzon egy újabb kliensre, aki kapcsolódás után átveszi az előző helyét. Természetesen az új kliens is először a saját nevét küldi át.

	b) A porton tetszőlegesen sok kliens kapcsolódhat, és bármikor ki is léphetnek. A szerver sorban engedi szóhoz jutni a klienseket, azonban az üzeneteket nem azonnal küldi el mindegyik másik kliensnek. Ehelyett a szerver összegyűjti az üzeneteket, és csak akkor küldi el az adott kliens számára szóló üzeneteket, amikor az éppen szóhoz jut.