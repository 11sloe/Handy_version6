/**
 *  Abschluss
 */
public class Abschluss extends Baumelement
{
    // Attribute

    // Konstruktor
    public Abschluss()
    {

    }

    // Methoden
    public Baumelement naechsterLinksGeben()
    {
        return this;
    }

    public Baumelement naechsterRechtsGeben()
    {
        return this;
    }

    public Vorschlag inhaltGeben()
    {
        return null;
    }

    public Knoten einfuegen(Vorschlag vorschlag)
    {
        Knoten neu = new Knoten(vorschlag);
        neu.naechsterLinksSetzen(this);
        neu.naechsterRechtsSetzen(new Abschluss());
        return neu;
    }
    
    public void ausgeben()
    {}

    public Vorschlag suchen(Vorschlag v)
    {
        return null;
    }
    
}
