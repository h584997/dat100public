## Java Development Kit

Java Development Kit (JDK) inneholder alle verktøy som trengs for å oversette og kjøre Java programmer.

### Nedlasting

Java Development Kit lastes ned via:  
https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html

Husk å velge **Accept License Agreement** før download.

### Installasjon

#### Windows
1.	Dobbeltklikk på filen `jdk-12.0.2_windows-x64_bin.exe`  
2.	Følg instruksjonene. Foreslåtte valg vil vanligvis fungere fint.
3.  Test installasjon ved å starte en ledetekst (Command Prompt) og naviger til mappen `C:\Program Files\Java\jdk12.0.2\bin` og utfør kommandoen `javac –version` som bør gi følgende (eller tilsvarende output): `javac "12.0.2"`

#### MacOS
1.	Dobbeltklikk på filen `jdk-12.0.2_windows-x64_bin.dmg` og deretter på filen `JDK 12.0.2.pkg`
2.	Følg instruksjonene. Foreslåtte valg vil vanligvis fungere fint.
3.	Test installasjonen ved å utføre kommandoen:  `javac –version` i en terminal som bør gi følgende (eller tilsvarende output): `javac "12.0.2"`

#### Linux

Installasjon ved bruk av tar.gz filen

1.	Kopier tar.gz filen til den mappen hvor du ønsker å installere JDK.
2.	Pakk ut tar.gz filen med kommandoen

   ```tar -zxvf jdk-12.0.2-linux-x64_bin.tar.gz```

3. Tilføy bin mappen der JDK er installert til miljøvariablen PATH.  Dette er avhengig av Linux distribusjonen og shell. For bash shell kan det gjøres ved å tilføye:

   ```PATH=$HOME/Java/jdk-12.0.2:$PATH```

   til filen `~\.bash_profile`.

4. Test installasjonen ved å utføre kommandoen `javac –version` som bør gi følgende (eller tilsvarende) output: `javac "12.0.2"``

Installasjon via .rpm filen (krever RPM-basert Linux system) kan gjøres ved bruk av kommandoen

   ```rpm –ivh jdk-8u144-linux-x64.rpm```

### Windows Installasjonsproblemer

#### PATH miljøvariablen

På noen Windows installasjoner kan det være nødvendig og sette miljøvariablen Path så den inneholder stien til bin mappen der JDK verktøyene er installert. Dette kan gjøres via *Control Panel → System → Advanced System Settings → Environment Variables…*

Stien til mappen vil avhengige av hvor du valgte å installere JDK. Som standard vil den være: `C:\Program Files\Java\jdk12.0.2\bin`.

**VIKTIG:** stien til JDK skal tilføyes til den eksisterende verdi av `PATH` dvs. ikke slett det eksisterende innholdet men tilføy følgende på enden (husk `;`` først):

```;C:\Program Files\Java\jdk12.0.2\bin```

Stien vil også avhenge av hvilken versjon av JDK du evt. har lastet ned. Hvis du har downloaded en nyere versjon av JDK må stien endres tilsvarende.
Test installasjonen via en Command Prompt (ledetekst) og kommandoen:

```javac –version```

Dette bør gi følgende (eller tilsvarende) output:

```javac "12.0.2```

Om man endrer i PATH da må man starte en ny kommando prompt for å få effekt av endringen. Den aktuelle verdi av Path kan man se ved å skrive Path i kommando prompten.

#### Konflikt med andre JVM installasjoner

På noen Windows-plattformer kan det forekomme at en versjon av java’s virtuelle maskin (JVM) er installert som forhindrer Eclipse i å starte. Da må man endre i oppstarts-filen `eclipse.ini` som finnes i eclipse-mappen ved å tilføye:

```-vm C:/Program Files/Java/jdk10.0.2/bin/javaw.exe```

før linjen som begynner med `–vmargs`. Husk å rette i linjen ovenfor om man har valgt å installere JDK i en annen folder eller har installert en annen versjon av JDK.

En endret versjon av [eclipse.ini](https://github.com/dat100hib/H2017/blob/master/eclipse/eclipse.ini) filen finnes også på GitHuB for faget.

### Mer informasjon

Detaljerte instruksjoner for installasjon av JDK finnes via: https://docs.oracle.com/en/java/javase/12/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A
