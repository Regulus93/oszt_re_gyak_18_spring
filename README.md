## Párhuzamosság

1. Készíts programot, ami párhuzamosan indít két szálat, amelyek a Hello és a világ szövegeket írják ki felváltva.

	a) A szálak most karakterenként írják ki a szövegeket.

	b) Mint a., de működjön jól a program.

2. Két kecske egy szakadékon átívelő palló két oldalára ér. A palló n hosszú (n parancssori paraméter), a közepén találkoznak. A kecskék 0.5 és 2 mp közötti, véletlenszerű időközönként öklelnek egyet a másikon, így eggyel odébb kerülnek. Mindkét kecskének az a célja, hogy kilökje a másikat a palló túlvégén. A sztenderd kimenetre írj ki minden öklelést, illetve azt, hogy melyik kecske jutott át a pallón.

a) A feladatnak kétféle jellemző ábrázolása van, találd meg mindkét megoldást.

3. Készíts telnet klienst, ami párhuzamosan képes továbbítani a szerver által küldött üzeneteket a sztenderd kimenetre, illetve a sztenderd bemeneten érkező üzeneteket a szerverhez.

4. Készíts olyan chat alkalmazást, amelyben a két kliensnek nem kell egymásra várnia soronként, hanem bármikor beszélhetnek egymáshoz, és ez azonnal kiíródik a másik kliensnél.

	a) Készíts chat szervert, amelyhez tetszőleges számú kliens kapcsolódhat, illetve bármikor bonthatják is a kapcsolatot. Minden kliens először a nevét közli egy sorban. A kliensek bármikor beszélhessenek, ami azonnal íródjon ki minden kapcsolódott kliensnél.

	b) A szerver, ha két parancssori paramétert kap, akkor a megadott gépen/porton levő másik szerverhez kapcsolódik, és névként “kliens” szerver nevet küld át; ebből a másik szerver tudja, hogy szerver kapcsolódott hozzá. A rendszer továbbra is működjön chat-szerverként, azaz bármelyik szerver bármelyik kliense üzenetét kapja meg mindegyik olyan kliens, aki a rendszerbe tartozik.

5. Írj egyszerű HTTP szervert. Ehhez ismerni kell a HTTP protokollt, amelyet el lehet olvasni a protokoll dokumentációjából. Ehelyett most kezeld a protokollt fekete dobozként: a szervert úgy készítsd el, hogy megfigyeled egy valódi szerver működését (pl. www.elte.hu), és utánzod azt.

	b) A szerver legyen többszálú.