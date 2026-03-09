import java.util.ArrayList;
import java.util.List;

public class Pacient extends Persoana{
    ArrayList<String> istoricBoli;

    //constructor
    public Pacient(String username, String pass, String nume, String dataNastere){
        this.username=username;
        this.pass=pass;
        this.nume=nume;
        this.dataNastere=dataNastere;
        istoricBoli=new ArrayList<>();

    }

    void modificareDatePersonale(String numeNou, String boala)
    {

        if(numeNou != null)
            nume = numeNou;

        if(boala!=null)
            istoricBoli.add(boala);
    }

    void VizualizareIstoric()
    {
        System.out.println("Pacientul "+ nume + " are urmatorul istoric de boli:");
        for(String boala:istoricBoli)
        {
            System.out.println(boala);
        }
    }
}
void main(String[] args) {

    Pacient p1 = new Pacient("ion1203", "parola123", "Ion Rusu", "12.03.1990");

    p1.modificareDatePersonale("Cancer");
    p1.modificareDatePersonale("Diabet");
    p1.modificareDatePersonale("Hipertensiune");

    p1.VizualizareIstoric();
    }




