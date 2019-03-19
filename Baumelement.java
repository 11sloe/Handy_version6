public abstract class Baumelement
{
    // Attribute keine!

    // nur abstrakte Methoden
    public abstract Baumelement naechsterLinksGeben();

    public abstract Baumelement naechsterRechtsGeben();

    public abstract Vorschlag inhaltGeben();

    //rekursive Methoden
    public abstract Baumelement einfuegen(Vorschlag vorschlag);
    
    public abstract void ausgeben();
    
    public abstract Vorschlag suchen(Vorschlag v);
}