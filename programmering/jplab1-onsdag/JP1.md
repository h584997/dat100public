# DAT100: Java Programmering 1 - Onsdag 14. august

## Java programmering og utviklingsmiljø

Formålet med denne programmeringslab er å sikre at du har en fungerende installasjon av JDK og Eclipse på egen PC.

- [x] Du må demonstrere den kjørende Java applikasjonen i oppgave 2,4 og 5 til labassistent eller underviser for å få godkjennt programmeringslab.

Når dette er gjort går du inn i Canvas for faget og skriver inn navnet på den lab-assistenten som du har vist de kjørende programmer til som innlevering.

**Deadline** for innlevering/godkjenning er **23. august kl. 16.00**.
Ta kontakt med faglærer eller lab-assistent dersom du har problemer med oppgavene.

### Oppgave 1: Nedlasting og installasjon av JDK, Eclipse IDE og Git

Les installasjonsveiledningen

https://github.com/dat100hib/dat100public/blob/master/README.md

og installer JDK, Eclipse og Git ved å gå igjennom de steg som er beskrevet i veiledningen.

### Oppgave 2: Første JAVA Eclipse-prosjekt

I denne oppgaven skal du opprette et programmeringsprosjekt i Eclipse, skrive og kjøre et enkelt Java program.

1.	Start Eclipse
2.	Velg *File | New | Java Project* og skriv inn `Velkommen` som prosjektnavn. Trykk *Finish*
3. 	I *Create module-info.java* spiller det ingen rolle om du velger *Don't create* eller *Create* siden vi ikke i dette programmet skal bruke modulsystemet i Java
4.	Velg *File | New | Class* og skriv inn `no.hvl.dat100` som pakkenavn og `Velkommen` som klassenavn. Kryss av for å generere `public static void main` automatisk. Trykk *Finish*

    Skriv inn:

```java
System.out.println("Nå virker det!");
```

slik at hele filen ser slik ut:

```java
package no.hvl.dat100;

public class Velkommen {
    public static void main(String[] args){
    	System.out.println("Nå virker det!");
    }
}
```

4.	Velg *Run | Run* for å utføre programmet.
5.	Du vil nå få utskriften i konsoll-vinduet (nederst i Eclipse vinduet).
6.	Modifiser programmet slik det skriver ut en linje med 10 stjerner `*` før og etter selve teksten.

### Oppgave 3: Sjekke ut kode fra github

Vi skal bruke www.github.com til å distribuere kodeeksempler fra forelesninger og startkode for programmeringsoppgaver. Til dette formålet er der opprettet en oppbevaringsplass (repository) med navnet `dat100public` på github som vil inneholde Eclipse-prosjekter for eksemplene.

#### 3a - opprette en github konto

For å få tilgang til oppbevaringsplassene som skal brukes i faget må du opprette en brukerkonto på https://www.github.com og angi et brukernavn, epost og passord:

1. Bruk studentnummeret dit som brukernavn (username) (**VIKTIGT**). Eksempelvis h428400 om du har studentnummer 428400.
2. I Step 2 (Choose your plan) velg Unlimited public repositories for free.

Du vil få en e-post fra github der du blir bedt om å verifisere at e-post addressen er gyldig.

#### 3b - opprette lokal kopi av oppbevaringsplassen

Du kan nå sjekke ut Eclipse-prosjekter med kodeeksempler på egen PC via Eclipse:

1.	Velg *File | Import… | Git | Projects from Git | Clone URI*
2.	I dialogboksen limer du inn følgende https://github.com/dat100hib/dat100public.git i feltet URI. Dette angir lokasjon av oppbevaringsplassen for eksempelkode på github.

    ![Problem med bilde](assets/gitimport.png)

3.	Under *Authentication* legger du inn brukernavn og passord for github-kontoen din og trykker Next.
4.	I dialogboksen *Branch Selection* velg *master* og trykk *Next*.
5.	I dialogboksen *Local Destination* må du under *Directory* velge en mappe på PC’en der du ønsker å lagre den lokale kopien av oppbevaringsplassen.
6.	I dialogboksen *Select a wizard* to use for importing projects velg *Import existing Eclipse Projects* og trykk *Next*.
7.	I dialogboksen *Import Projects* velg *F01Introduksjon* og trykk *Finish*. Da vil Eclipse-prosjektene med eksempelkode fra første forelesning være tilgjengelig.

#### 3c - tilgang til nye og oppdaterte prosjekt

Etter hvert i faget oppdaterer vi eksempelprosjektene og du får også bruk for å få tilgang til eksempler for de neste forelesninger. For å få tilgang til de må du oppdatere den lokale oppbevaringsplassen på PC’en din:

1.	Velg et av eksempelprosjektene i Eclipse, høyre-klikk og velg *Team | Pull*.   Dette oppdaterer oppbevaringsplassen for eksempler på din PC.
2.	Velg *File | Import… | Git | Projects from Git | Existing local repository* og trykk *Next*.
3.	I dialogboksen *Select a Git Repository* velg *dat100public* og trykk *Next*.
4.	I dialogboksen *Select a wizard to use for importing projects* velg *Import existing Eclipse Projects*, vælg mappen *forelesninger* og trykk *Next*
5.	I dialogboksen *Import Projects* kan du nå velge de Eclipse-prosjekter du ønsker å importere inn i Eclipse

### Oppgave 4: Enhetstesting og JUnit

For noen programmeringsoppgaver skal vi bruke JUnit til å teste java-koden som dere skriver. Formålet med denne oppgaven er å bli kjent med JUnit

Eksempelkoden fra første forelesning du sjekket ut i oppgave 3 inneholder et Eclipse-prosjekt `Kalkulator` som implementerer en enkel kalkulator med enkelt brukergrensesnitt.

1.	Kjør applikasjonen ved å velge prosjektet Kalkulator etterfulgt av *Run | Run*
2.	Kjør JUnit enhetstestene i prosjektet ved å velge filen `TestKalkulator.java` etterfulgt av  *Run | Run As | JUnit Test*

Enhetstestene i punkt 2 ovenfor feiler fordi ikke alt er implementert i filen `Kalkulator.java`:

1.	Åpn filen `Kalkulator.java` i editoren ved å dobbel-klikke på den.
2.	Implementer metodene `add`, `sub`, `mul` og `div` som vist på første forelesning.

Kjør enhets-testene igjen og prøv applikasjonen via grensesnittet. Sjekk at alt fungerer som ønsket.

### Oppgave 5: Bruk av EasyGraphics

I forbindelse med forelesninger og programmeringsoppgaver skal vi bruke biblioteket easygraphics til å illustrere en del begreper innen programmering. Formålet med denne oppgaven er å vise hvordan man bruker easygraphics biblioteket i egne programmer.

For å kunne bruke easygraphics biblioteket i egen kode må Eclipse-prosjektet ha en referanse til en jar-fil som inneholder java-koden for biblioteket. Jar-filen `easygraphics.jar` finnes i mappen `easygraphics/lib` der du sjekket ut koden fra github i oppgave 3.

1.	Opprett et nytt Eclipse-prosjekt som i oppgave 2 med navnet *EasyGraphicsTest*.
2.	Legg inn en ny Java-klasse *Grafikk* med følgende innhold:

```java
package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Grafikk", 350, 150);
		drawCircle(150, 70, 60);
	}
}
```

Koden ovenfor gir i første omgang en rekke feilmeldinger siden vi ikke har fortalt hvor easygraphics biblioteket finnes.

3.	Høyreklikk på prosjektet *EasyGraphicsTest* og velg *Properties | Java Build Path | Libraries | Classpath | Add External JARs* og naviger til den mappen der `easygraphics.jar` filen legger. Velg easygraphics.jar filen.
4.	Jar-filen er nå lagt til prosjektet under *Referenced Libraries* og feilmeldinger skulle nå forsvinne.
5.	Kjør programmet og se at det gir forventet resultat.
6.	Modifiser programmet så det tegner to forskjellige sirkler på to ulike steder på skjermen.
7.	Skriv et program som tegner et åttetall.

### Oppgave 6: Jshell - Interaktivt Java verktøy

JShell er et interaktivt verktøy som er nyttig for å lære Java, men også for rask testing av mindre kodebiter. Gå igjennom siden:

https://dbsys.info/programmering/fagstoff/jshell.html

som viser hvordan en kommer i gang med å bruke jshell.

### Mer informasjon

For de som ønsker mer informasjon om Eclipse og Git:

-	Eclipse og Java: Velg  Help | Help Contents og Java development user guide
-	Bruk av Git i Eclipse: http://eclipsesource.com/blogs/tutorials/egit-tutorial/  
-	Git Reference: http://gitref.org/
