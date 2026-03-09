import java.util.ArrayList;
import java.util.List;

public final class Asistenta extends Persoana{

    private String grad;

    private List<Pacient> listaPacienti = new ArrayList<>();
    private List<Programare> programari = new ArrayList<>();

    public Asistenta(String nume, String username, String parola, String grad) {
        this.nume = nume;
        this.username = username;
        this.parola = parola;
        this.specializare = grad;
    }

    public void vizulizareProgramari(){
        for (Programare p : programari) {
            System.out.println(p);
        }
    }
    public void vizualizareListaPacienti() {
        for (Pacient p : listaPacienti) {
            System.out.println(p.getNume());
        }
    }

    public void adaugaPacient(Pacient pacient) {
        listaPacienti.add(pacient);
    }
    public void stergePacient(Pacient pacient) {
        listaPacienti.remove(pacient);
    }


}