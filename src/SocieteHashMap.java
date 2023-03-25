import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SocieteHashMap implements InterfaceSociete {

    private Map<String, Employe> employes;
    private Map<String, Departement> departements;

    public SocieteHashMap() {
        this.employes = new HashMap<>();
        this.departements = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        this.employes.put(e.getCin(), e);
        this.departements.put(d.getId(), d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        this.employes.remove(e.getCin());
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        Set<String> cinList = this.employes.keySet();
        for (String cin : cinList) {
            Employe e = this.employes.get(cin);
            Departement d = this.departements.get(e.getDepartementId());
            System.out.println(e.toString() + " travaille au département " + d.getNom());
        }
    }

    @Override
    public void afficherLesEmployes() {
        Set<String> cinList = this.employes.keySet();
        for (String cin : cinList) {
            Employe e = this.employes.get(cin);
            System.out.println(e.toString());
        }
    }

    @Override
    public void afficherLesDepartements() {
        Set<String> idList = this.departements.keySet();
        for (String id : idList) {
            Departement d = this.departements.get(id);
            System.out.println(d.toString());
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = this.departements.get(e.getDepartementId());
        System.out.println(e.toString() + " travaille au département " + d.getNom());
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return this.employes.containsValue(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return this.departements.containsValue(d);
    }
}
