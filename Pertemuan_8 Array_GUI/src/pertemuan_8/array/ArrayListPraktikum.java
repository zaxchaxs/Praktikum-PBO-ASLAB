package pertemuan_8.array;
import java.util.ArrayList;

public class ArrayListPraktikum {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add("Cindy");
        arr.add(20);
        arr.add(null);
        arr.set(2, "Melisa");
        Object removedValue = arr.remove(0);
        System.out.println("Value yang dihapus: " + removedValue);
        System.out.println(arr);
        
        ArrayList arr1 = new ArrayList();
        arr1.add("Emily");
        arr1.add("Bob");
        arr1.add("Cindy");
        arr1.add(null);
        System.out.println(arr1);
        
        System.out.println("Element yang terambil: ");
//        for(int i = 0; i < arr1.size(); i++) {
//            System.out.print(arr1.get(i) + " ");
//        }
        
        arr.addAll(arr1);
//        System.out.println(arr);

        ArrayList<Integer> nilaiMahasiswa = new ArrayList();
        nilaiMahasiswa.add(92);
        nilaiMahasiswa.add(90);
        nilaiMahasiswa.add(88);
        nilaiMahasiswa.add(98);
        System.out.println(nilaiMahasiswa);
//        nilaiMahasiswa.sort((o1, o2) -> 0);
        System.out.println(nilaiMahasiswa);
        
    }
}
