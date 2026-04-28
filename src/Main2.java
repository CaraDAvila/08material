import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Empregado>lista=new ArrayList<>();

        lista.add(new EmpregadoComissionado(1,"a",1,1));
        lista.add(new EmpregadoHorista(2,"b",1,1));
        lista.add(0, new EmpregadoHorista(3,"c",1,1));

        //tradicional
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nome);
        }

        //generico

        for (Empregado empregado: lista){
            System.out.println();
            System.out.println(empregado);
            System.out.println(empregado.calcularSalario());
        }
    }
}
