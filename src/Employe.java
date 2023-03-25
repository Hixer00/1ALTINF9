import java.util.Objects;
public class Employe {
    private String cin;
    private String matricule;
    private String nom;
    private String prenom;
    private String departementId;

    public Employe() {
    }

    public Employe(String cin, String matricule, String nom, String prenom, String departementId) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.departementId = departementId;
    }

    public String getCin() {
        return cin;
    }


    public String getMatricule() {
        return matricule;
    }
//anis_first_commit

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartementId() {
        return departementId;
    }

    public void setDepartementId(String departementId) {
        this.departementId = departementId;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "cin='" + cin + '\'' +
                ", matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departementId='" + departementId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(cin, employe.cin) &&
                Objects.equals(matricule, employe.matricule) &&
                Objects.equals(nom, employe.nom) &&
                Objects.equals(prenom, employe.prenom) &&
                Objects.equals(departementId, employe.departementId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin, matricule, nom, prenom, departementId);
    }
}
