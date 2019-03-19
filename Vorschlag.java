
public class Vorschlag
{
    private String wort;
    private String wort_klein;

    public Vorschlag(String w)
    {
        wort = w;
        wort_klein = wort.toLowerCase();
    }

    public boolean istGleich(Vorschlag a2)
    {
        String w2 = a2.wort.toLowerCase();
        return wort_klein.startsWith(w2);
    }

    public boolean istKleiner(Vorschlag a2)
    {

        String w2 =(a2.wort).toLowerCase();
        return wort_klein.compareTo(w2)<0;
    }

    public void ausgeben()
    {
        System.out.println(wort);
    }

    public String getWort()
    {
        return wort;
    }
}
