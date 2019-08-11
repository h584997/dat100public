## EasyGraphics

EasyGraphics er et bibliotek som vi skal bruke ifm. en del programmeringsoppgaver. Som del av første Java programmeringslab ble det vist hvordan easygraphics biblioteket importeres og brukes i egne Eclipse-prosjekt.

- Dokumentasjon: https://dbsys.info/programmering/easygraphics/javadoc/index.html

I oppgave 5 på første programmeringslab:

https://github.com/dat100hib/dat100public/blob/master/programmering/jplab1-onsdag/JP1.md

ble det vist hvordan man setter opp bruk av EasyGraphics i egne prosjekt ved å inkludere jar-filen for biblioteket.

Det er også mulig kun å referere til jar-filen fra Eclipse-prosjektet uten å inkludere det via import. Da må en gjøre følgende steg:

1. Høyreklikk på prosjektet velg *Properties | Java Build Path | Libraries | Classpath | Add External JARs...*

2. Nagiver til `easygraphics/lib` mappen og velg `easygraphics.jar` filen. Jar-filen er da lagt til prosjektet under Referenced Libraries.
