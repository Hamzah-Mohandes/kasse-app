fun main() {
    val tee = WarmG("Tee", 2.9)
    val kakao = WarmG("Kakao", 3.0)
    val glühwein = WarmG("Glühwein", 4.0)
    val heißeSchokolade = WarmG("Heiße Schokolade", 3.5)
    val latteMacchiato = WarmG("Latte Macchiato", 3.0)
    val cappuccino = WarmG("Cappuccino", 2.5)
    val chaiLatte = WarmG("Chai Latte", 3.5)
    val matchaLatte = WarmG("Matcha Latte", 4.0)
    val würzigerTee = WarmG("Würziger Tee", 2.5)

    //Warme Gtrenänke


    val gin = Alkohol("Gin", 15.0, "40%")
    val vodka = Alkohol("Vodka", 12.5, "37.5%")
    val whiskey = Alkohol("Whiskey", 20.9, "45%")
    val rum = Alkohol("Rum", 14.0, "40%")
    val tequila = Alkohol("Tequila", "16.0".toDouble(), "38%")
    val brandy = Alkohol("Brandy", "18.0".toDouble(), "40%")
    val vermouth = Alkohol("Vermouth", "12.0".toDouble(), "16%")
    val chartreuse = Alkohol("Chartreuse", "25.0".toDouble(), "55%")
    val sake = Alkohol("Sake", "10.0".toDouble(), "15%")
    val absinthe = Alkohol("Absinthe", "30.0".toDouble(), "70%")
    val grappa = Alkohol("Grappa", "12.0".toDouble(), "40%")
    val schnaps = Alkohol("Schnaps", "8.0".toDouble(), "30%")
    val ginTonic = Alkohol("Gin Tonic", "12.5".toDouble(), "8%")
    val bloodyMary = Alkohol("Bloody Mary", "14.0".toDouble(), "10%")
    val margarita = Alkohol("Margarita", "13.5".toDouble(), "12%")
    val mojito = Alkohol("Mojito", "11.0".toDouble(), "8%")
    val pinaColada = Alkohol("Pina Colada", "12.5".toDouble(), "10%")
    val negroni = Alkohol("Negroni", "14.5".toDouble(), "22%")
    val martini = Alkohol("Martini", "15.0".toDouble(), "20%")
    val maiTai = Alkohol("Mai Tai", "13.0".toDouble(), "12%")
    // Akloho Gteränken


    val schwarzwälderKirschtorte = Kuchen("Schwarzwälder Kirschtorte", "3.5".toDouble(), "mitSahne")
    val apfelkuchen = Kuchen("Apfelkuchen", "2.5".toDouble(), "0.0")
    val käsekuchen = Kuchen("Käsekuchen", "3.0".toDouble(), "0.0")
    val bienenstich = Kuchen("Bienenstich", "2.5".toDouble(), "0.5")
    val erdbeerkuchen = Kuchen("Erdbeerkuchen", "3.0".toDouble(), "0.0")
    val himbeerkuchen = Kuchen("Himbeerkuchen", "3.0".toDouble(), "0.0")
    val zitronenkuchen = Kuchen("Zitronenkuchen", "2.5".toDouble(), "0.0")
    val mandelkuchen = Kuchen("Mandelkuchen", "2.5".toDouble(), "0.0")
    val schokoladenkuchen = Kuchen("Schokoladenkuchen", "3.0".toDouble(), "0.5")
    val karottenkuchen = Kuchen("Karottenkuchen", "2.5".toDouble(), "0.0")
    val streuselkuchen = Kuchen("Streuselkuchen", "2.5".toDouble(), "0.0")
    val kokoskuchen = Kuchen("Kokoskuchen", "3.0".toDouble(), "0.0")
    val marmorkuchen = Kuchen("Marmorkuchen", "2.5".toDouble(), "0.0")
    val zwetschgenkuchen = Kuchen("Zwetschgenkuchen", "3.0".toDouble(), "0.5")
    val nusskuchen = Kuchen("Nusskuchen", "2.5".toDouble(), "0.0")
    val linzerTorte = Kuchen("Linzer Torte", "3.5".toDouble(), "0.5")
    val frankfurterKranz = Kuchen("Frankfurter Kranz", "4.0".toDouble(), "0.5")
    val biskuitrolle = Kuchen("Biskuitrolle", "2.5".toDouble(), "0.0")
    var käseSahneTorte = Kuchen("Käse-Sahne-Torte", "3.5".toDouble(), "0.5")
    val birnenkuchen = Kuchen("Birnenkuchen", "3.0".toDouble(), "0.0")

    //Kuchen

    val eistee = KalteG("Eistee", "2.0".toDouble())
    val limonade = KalteG("Limonade", "1.5".toDouble())
    val cola = KalteG("Cola", "2.5".toDouble())
    val orangensaft = KalteG("Orangensaft", "3.0".toDouble())
    val apfelsaft = KalteG("Apfelsaft", "2.5".toDouble())
    val wasser = KalteG("Wasser", "1.0".toDouble())
    val fruchtsaft = KalteG("Fruchtsaft", "2.5".toDouble())
    val smoothie = KalteG("Smoothie", "4.0".toDouble())
    val eiskaffee = KalteG("Eiskaffee", "3.5".toDouble())
    val milchshake = KalteG("Milchshake", "3.0".toDouble())
    val sprite = KalteG("Sprite", "2.5".toDouble())
    val fanta = KalteG("Fanta", "2.5".toDouble())
    val iceTeaPfirsich = KalteG("Ice Tea Pfirsich", "2.5".toDouble())
    val zitronenlimonade = KalteG("Zitronenlimonade", "2.0".toDouble())
    val eisfrappé = KalteG("Eisfrappé", "4.5".toDouble())
    val ananassaft = KalteG("Ananassaft", "3.0".toDouble())
    val traubensaft = KalteG("Traubensaft", "2.5".toDouble())
    val himbeersaft = KalteG("Himbeersaft", "3.0".toDouble())
    val mangosaft = KalteG("Mangosaft", "3.5".toDouble())
    val grünerSmoothie = KalteG("Grüner Smoothie", "4.5".toDouble())

// Kalte Gtetränke


    // list of itemsList
    val kalt: MutableList<Items> = mutableListOf()

    kalt.addAll(
        listOf(
            eistee,
            limonade,
            cola,
            orangensaft,
            apfelsaft,
            wasser,
            fruchtsaft,
            smoothie,
            eiskaffee,
            milchshake,
            sprite,
            fanta,
            iceTeaPfirsich,
            zitronenlimonade,
            eisfrappé,
            ananassaft,
            traubensaft,
            himbeersaft,
            mangosaft,
            grünerSmoothie
        )

    )
    val kuchen: MutableList<Items> = mutableListOf()
    kuchen.addAll(
        listOf(
            schwarzwälderKirschtorte,
            apfelkuchen,
            käsekuchen,
            bienenstich,
            erdbeerkuchen,
            himbeerkuchen,
            zitronenkuchen,
            mandelkuchen,
            schokoladenkuchen,
            karottenkuchen,
            streuselkuchen,
            kokoskuchen,
            marmorkuchen,
            zwetschgenkuchen,
            nusskuchen,
            linzerTorte,
            frankfurterKranz,
            biskuitrolle,
            käseSahneTorte,
            birnenkuchen
        )
    )

    val alkohol: MutableList<Items> = mutableListOf()
    alkohol.addAll(
        listOf(
            gin,
            vodka,
            whiskey,
            rum,
            tequila,
            brandy,
            vermouth,
            chartreuse,
            sake,
            absinthe,
            grappa,
            schnaps,
            ginTonic,
            bloodyMary,
            margarita,
            mojito,
            pinaColada,
            negroni,
            martini,
            maiTai
        )
    )

    var warmeGteränke: MutableList<Items> = mutableListOf()
    warmeGteränke.addAll(
        listOf(
            tee,
            kakao,
            glühwein,
            heißeSchokolade,
            latteMacchiato,
            cappuccino,
            chaiLatte,
            matchaLatte,
            würzigerTee

        )
    )

// Menu Klassse  und TISCHNUMMER -----------------------------------------





    val bestellung = mutableListOf<Pair<String, Double>>()


    val stop = false


        val tischnummerMitbestellungen = mutableMapOf<Int, MutableList<String>>()


        while (true) {
            println("Was möchtest du tun?")
            println("1. Tischnummer hinzufügen")
            println("2. Tischnummer entfernen")
            println("3. Alle Tischnummern anzeigen")
            println("4. Tisch mehr bestellen ")


            val input = readLine()

            when (input) {
                "1" -> {
                    println("Gib eine Tischnummer ein:")
                    val neueTischnummer = readLine()?.toInt()

                    if (neueTischnummer != null) {

                      if (! tischnummerMitbestellungen.keys.contains(neueTischnummer)) {
                          println("wir haben die Tischnummer in liste !")
                      }
                        tischnummerMitbestellungen[neueTischnummer] = mutableListOf()   // warum habe Logic problem habe :/

                        println("Tischnummer $neueTischnummer hinzugefügt.")
                    } else {
                        println("Ungültige Eingabe.")
                    }
                }

                "2" -> {
                    println("Welche Tischnummer möchtest du entfernen?")
                    val tischnummerToRemove = readLine()?.toInt()

                    if (tischnummerToRemove != null && tischnummerMitbestellungen.keys.contains(tischnummerToRemove)) {

                        tischnummerMitbestellungen.remove(tischnummerToRemove)

                        println("Tischnummer $tischnummerToRemove entfernt.")
                    } else {
                        println("Ungültige Eingabe oder Tischnummer nicht gefunden.")
                    }
                }

                "3" -> {
                    if (tischnummerMitbestellungen.keys.isEmpty()) {
                        println("Keine Tischnummern vorhanden.")
                    } else {
                        println("Aktuelle Tischnummern:")
                        tischnummerMitbestellungen.keys.forEach { println("- $it") }
                    }
                }
                "4" -> {
                    val edith = readln().toInt()
                    val bestellungen = tischnummerMitbestellungen.get(edith)
                    for (e in bestellung) {
                        println("${e.first} ${e.second}")
                    }
                }

                else -> {
                    println("Ungültige Option.")
                }
            }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            println("Bitte geben Sie Ihre Bestellung auf.")
            while (true) {
                println("Wählen Sie eine Kategorie aus (1-4):\n1. Warme Getränke\n2. Alkohol\n3. Kuchen\n4. Kalt")
                val kategorieNummer = readLine() ?: ""
                val kategorie = when (kategorieNummer) {
                    "1" -> warmeGteränke
                    "2" -> alkohol
                    "3" -> kuchen
                    else -> mutableListOf()
                }


                kategorie.forEachIndexed { index, item ->
                    println("${index + 1}. ${item.name} (${item.preis} Euro)")
                }

                println("Bitte wählen Sie einen Menüpunkt aus (1-${kategorie.size})")
                val menuNummer = readLine()?.toIntOrNull() ?: 0
                if (menuNummer in 1..kategorie.size) {
                    val ausgewähltesItem = kategorie[menuNummer - 1]
                    bestellung.add(ausgewähltesItem.name to ausgewähltesItem.preis)
                    println("Sie haben ${ausgewähltesItem.name} (${ausgewähltesItem.preis} Euro) gewählt.")
                } else {
                    println("Ungültige Eingabe.")
                }

                println("Möchten Sie noch etwas bestellen? (Y/N)")
                val antwort = readLine() ?: ""
                if (antwort.equals("N", ignoreCase = true))

                {
                    break
                }

                for (e in tischnummerMitbestellungen) {
                    for (b in e.value)
                        println("${e.key} ($b)")
                }
            }
            //----------------------------------------------------------------

            fun bestellungAufgeben(bestellung: List<Pair<String, Double>>) {
                val artikel = mutableListOf<String>()
                var preis = 0.0

                for ((artikelName, preisValue) in bestellung) {
                    artikel.add(artikelName)
                    preis += preisValue
                }

                println("Vielen Dank für Ihre Bestellung:")
                for (item in artikel) {
                    println("- $item")
                }
                println("Gesamtpreis: $preis Euro")
            }



            bestellungAufgeben(bestellung)
        }


    }



