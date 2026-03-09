import java.time.Year;
import java.time.LocalDate;

public abstract sealed class Persoana permits Administrator, Doctor, Asistenta, Pacient {
    private String username;
    private String password;
    private String name;
    private LocalDate dataNastere;
    private boolean logat;

    public Persoana(String username, String password, String name, LocalDate dataNastere) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.dataNastere = dataNastere;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
    public Boolean verificaPassword(String password) {
        return this.password.equals(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(LocalDate dataNastere) {
        this.dataNastere = dataNastere;
    }

 //   public boolean

}
