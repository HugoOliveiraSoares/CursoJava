import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        String binary = Integer.toBinaryString(n);
        String[] binaryGaps = binary.split("1");
        int lengthBinaryGap = 0;

        if ( binaryGaps.length > 2 ) {

            lengthBinaryGap = binaryGaps[0].length();

            for (int i = 0; i < binaryGaps.length; i++) {

                if (binaryGaps[i].length() > lengthBinaryGap ) {
                    lengthBinaryGap = binaryGaps[i].length();
                }
            }
        }

        System.out.println(lengthBinaryGap);   
    }

    static void exibirVetor(String[] vet) {

        for (int i = 0; i < vet.length; i++) {
          System.out.print(vet[i] + " , ");
        }
        System.out.println();
    }

}
