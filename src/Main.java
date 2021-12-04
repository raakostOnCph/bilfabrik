import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

//
//        List<Object> tingOgSager = new ArrayList<>();
//
//        tingOgSager.add(new Kaffemaskine());
//        tingOgSager.add(new Kronhjort());
//        tingOgSager.add(new Fresbee());
//        tingOgSager.add(new Kaffemaskine());
//        tingOgSager.add(new Tørkage());
//
//        for (Object o : tingOgSager) {
//
//           if (o instanceof Kronhjort) {
//               System.out.println(((Kronhjort) o).brøl());
//           }
//            if (o instanceof Kaffemaskine) {
//                System.out.println(((Kaffemaskine) o).byg());
//            }
//            if (o instanceof Fresbee) {
//
//                System.out.println(((Fresbee) o).kast());
//            }
//            if (o instanceof  Tørkage) {
//
//                System.out.println(((Tørkage) o).bid());
//            }
//
//        }
//
//
//        System.out.println("\n\n nu via command");
//
//        List<Command> nyeTingOgSager = new ArrayList<>();
//
//        nyeTingOgSager.add(new Kronhjort());
//        nyeTingOgSager.add(new Kaffemaskine());
//        nyeTingOgSager.add(new Piskeris());
//        nyeTingOgSager.add(new Tørkage());
//        nyeTingOgSager.add(new Fresbee());
//        nyeTingOgSager.add(new Kronhjort());
//        nyeTingOgSager.add(new Knallert());
//
//        for (Command command : nyeTingOgSager) {
//
//            System.out.println(command.udfør());
//        }



//        IfMoter ifMoter = new BenzinMoter();
//
//        System.out.println(ifMoter.kør());
//
//        ifMoter = new ElMoter();
//
//        System.out.println(ifMoter.kør());
//
//        ifMoter = new RugbrødsMoter();
//
//        System.out.println(ifMoter.kør());
//
//        ifMoter = new IfMoter()
//        {
//            @Override
//            public String kør()
//            {return "det er ingen der kender, jeg er nemlig anonym";
//
//            }
//        };
//
//        System.out.println(ifMoter.kør());



//        List<IfMoter> moterList = new ArrayList<>();
//
//        moterList.add(new BenzinMoter());
//        moterList.add(new ElMoter());
//        moterList.add(new ElMoter());
//        moterList.add(new BenzinMoter());
//        moterList.add(new RugbrødsMoter());
//        moterList.add(new ElMoter());
//        moterList.add(new BenzinMoter());
//        moterList.add(new RugbrødsMoter());
//        moterList.add(new ElMoter());
//        moterList.add(new BenzinMoter());
//        moterList.add(new RugbrødsMoter());
//        moterList.add(new IfMoter()
//        {
//            @Override
//            public String kør()
//            {
//                return new Tørkage().bid();
//            }
//        });
//
//
//        for (IfMoter ifMoter : moterList) {
//
//            System.out.println(ifMoter.kør());
//        }


//
//        Bil bil = new Bil(new BenzinMoter());
//
//        System.out.println(bil.start());
//
//       Bil bil1 = new Bil(new RugbrødsMoter());
//
//        System.out.println(bil1.start());
//

        MotorFabrik motorFabrik = new MotorFabrik();


        List<IfMoter> moterList = new ArrayList<>();




        int antal = 1000;

        TilfældigMotor tilfældigMotor = new TilfældigMotor();

        tilfældigMotor.tilføjNyMotor( new Diesel() );
        tilfældigMotor.tilføjNyMotor( new ElastikMotor() );

        while (antal > 0 ) {

            moterList.add(tilfældigMotor.nyMoter());
            antal--;

        }







        for (IfMoter ifMoter : moterList) {

            System.out.println( ifMoter.kør());
        }






    }   // her slutter min main


}
