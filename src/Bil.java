public class Bil
{

   private IfMoter moter;

    public Bil(IfMoter moter)
    {
        this.moter = moter;
    }

    public String start() {

        return moter.kør();

    }

}
