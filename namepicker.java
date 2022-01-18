import java.util.Random;
public class namepicker {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] names = { "Albert", "Austria", "Baetiong", "Base", "Bagwis", "Cabatingan",
                "Carpio", "Co", "Dantes", "Dejesus", "Del mundo", "Dimaano", "Domnigo", "Donato",
                "Escuerdo", "Esmero", "Gabon", "Garcia J", "Garcia Z", "Guamos", "Guzman", "Hega",
                "Ignacio", "Juanillas", "Juano", "Maravillas", "Martinez", "Mondero", "Moreno", "Narito",
                "Navales", "Organo", "Padua", "Perit", "Rosales", "Sager", "Santosildes", "Tongol", "Tugade" };
                
        int result = rand.nextInt(names.length);
        System.out.println(names[result]);  
    }
}