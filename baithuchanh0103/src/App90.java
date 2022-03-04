import java.util.Scanner;

public class App90 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String chuoi;
        char kitu;
        System.out.println("nhap vao chuoi bat ky");
        chuoi=sc.nextLine();
        System.out.println("cac ky tu co trong chuoi la");
        for(int i=0;i<chuoi.length();i++){
            kitu=chuoi.charAt(i);
            System.out.println(kitu);
        }
                sc.close();
    }
}
