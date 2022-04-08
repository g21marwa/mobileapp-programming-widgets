
# Rapport

Jag har skapat en appliation som innehåller 4 widgets (3 som inte var med sedan innan.).
Dessa ligger innuti en tablelayout. Dena strukturerar up allt innehåll i rader och kolumner.

## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
<TableLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:stretchColumns="*"
        >
        <TableRow
            android:layout_height="100dp"
            android:background="#ff0000"
            android:layout_marginTop="5dp">
```
Jag har skapat en tablelayout. Denna täcker hela ytan som den ligger i, med hjälp av match_parent.
Den har även strukterarat upp kolumnerna innuti den så att de tar upp den yta som existerar i raden.
alla tablerows jag skapar har en margin top för att ge lite utrymme mellan varje rad.

```
<Button
    android:id="@+id/my_button"
    android:background="@drawable/button_border"
    android:text="@string/button_text"
    android:onClick="changeProgress"/>
```
Min knapp. Den kallar på metoden changeProgress och har en förskapad bakgrund. 
Denna bakgrund inehåller struktur för att få knappen att ha en borde och se ut som en knapp.



Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
