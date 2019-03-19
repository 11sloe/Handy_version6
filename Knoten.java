public class Knoten extends Baumelement
{

    // Attribute
    private Baumelement naechsterLinks;
    private Baumelement naechsterRechts;

    private Vorschlag inhalt;

    // Konstruktor
    public Knoten(Vorschlag inhalt_)
    {
        inhalt = inhalt_;
    }

    // Methoden
    public Baumelement naechsterLinksGeben()
    {
        return naechsterLinks;
    }

    public Baumelement naechsterRechtsGeben()
    {
        return naechsterRechts;
    }

    public void naechsterLinksSetzen(Baumelement naechsterLinks_)
    {
        naechsterLinks = naechsterLinks_;
    }

    public void naechsterRechtsSetzen(Baumelement naechsterRechts_)
    {
        naechsterRechts = naechsterRechts_;
    }

    public Vorschlag inhaltGeben()
    {
        return inhalt;
    }

    // Rekursive Methoden

    public Baumelement einfuegen(Vorschlag vorschlag)
    {
        if (inhalt.istKleiner(vorschlag))
        {
            naechsterRechts = naechsterRechts.einfuegen(vorschlag);
        }
        else
        {
            naechsterLinks = naechsterLinks.einfuegen(vorschlag);
        }
        return this;
    }

    public void ausgeben()
    {
        naechsterLinks.ausgeben();
        inhalt.ausgeben();
        naechsterRechts.ausgeben();
    }

    public Vorschlag suchen(Vorschlag v)
    {
        if(inhalt.istGleich(v))
        {
            return inhalt;
        }
        else if(inhalt.istKleiner(v))
        {
            return naechsterRechts.suchen(v);
        }
        else
        {
            return naechsterLinks.suchen(v);
        }

    }
}
