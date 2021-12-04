import java.util.HashMap;
import java.util.Map;

public class MotorFabrik
{

   private Map<Integer, IfMoter > moterMap = new HashMap<>();

    public MotorFabrik()
    {

        fyldIMap();

    }

    private void fyldIMap() {

        moterMap.put(0, new BenzinMoter());
        moterMap.put(1, new RugbrødsMoter());
        moterMap.put(2, new ElMoter());

    }

    public IfMoter lavMoter(Integer i) {

        return moterMap.getOrDefault(i, new RugbrødsMoter());

    }

    public Integer antalMoterTyper() {

      return moterMap.size();

    }


    public void nyTypeMoter(IfMoter ifMoter)
    {

        moterMap.put(moterMap.size(), ifMoter);

    }
}
