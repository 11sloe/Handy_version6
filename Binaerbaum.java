public class Binaerbaum
{
    // Attribute
    private Baumelement wurzel;

    // Konstruktor
    public Binaerbaum()
    {
        // Am Anfang war der leere Baum!
        wurzel = new Abschluss();
    }

    // Methoden
    public void einfuegen(Vorschlag vorschlag)
    {
        wurzel = wurzel.einfuegen(vorschlag);
    }

    public void alleElementeAusgeben()
    {
        System.out.println("Alle Elemente des Baums in alphabetischer Reihenfolge:");
        wurzel.ausgeben();
    }
    
    public Vorschlag suchen(Vorschlag v)
    {
        return wurzel.suchen(v);
    }
   
}
