import java.util.Scanner;

public class Program {



    public static void main(String[] args) {

        String stronySwiata;
        Scanner scan= new Scanner(System.in);

        System.out.println("W którym kierunku chcesz się poruszać?");
        System.out.println("Możliwe opcje: ");

        for (StronySwiata elem: StronySwiata.values()) {
            System.out.print(elem+" ");
        }
        System.out.println();

        stronySwiata=scan.nextLine();


        StronySwiata kierunek=StronySwiata.valueOf(stronySwiata);


        System.out.println("Poruszasz się w kierunku "+stronySwiata+ " czyli na " +kierunek.getNazwaPolska());

        System.out.println("Podaj liczbę przyporządkowaną do kierunku. Możliwe opcje: ");

        for (StronySwiata elem: StronySwiata.values()) {
            System.out.println(elem+"-"+elem.getIndex());
        }

        System.out.println("Wybrałeś : "+kierunek.convert(scan.nextInt()));

    }
}