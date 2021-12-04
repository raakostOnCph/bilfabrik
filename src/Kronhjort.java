public class Kronhjort extends Command
{

    public String brøl(){

        return  "brøølll";
    }

    @Override
    public String udfør()
    {
        return brøl();
    }
}
