import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        System.out.print("Enter 1 for encode or 2 for decode: ");

        choice = in.nextInt();

        while (!(choice == 1) && !(choice == 2)) {
            System.out.print("Invalid selection entered try again: ");
            choice = in.nextInt();
        }
        switch (choice) {
            case 1:
                runEnocder();
                break;
            case 2:
                runDecoder();
                break;
        }
    }

    public static void runEnocder() {
        Encoder encoder;
        int[] bits = new int[4];

        System.out.print("Enter your 4 bit code to be enconded: ");
        String input = in.next();

        while (!(input.length() == 4) || !input.matches("[01]+")) {
            System.out.print("You have entered an incorrect 4 bit code try again: ");
            input = in.next();
        }
        for (int i = 0; i < input.length(); i++) {
            String bit = String.valueOf(input.charAt(i));
            int p = Integer.parseInt(bit);
            bits[i] = p;
        }
        encoder = new Encoder(bits[0], bits[1], bits[2], bits[3]);
        encoder.encode();
        encoder.print();

    }

    public static void runDecoder() {
        Decoder decoder;
        int[] bits = new int[7];

        System.out.print("Enter your 7 bit code to be enconded: ");
        String input = in.next();

        while (!(input.length() == 7) || !input.matches("[01]+")) {
            System.out.print("You have entered an incorrect 7 bit code try again: ");
            input = in.next();
        }
        for (int i = 0; i < input.length(); i++) {
            String bit = String.valueOf(input.charAt(i));
            int p = Integer.parseInt(bit);
            bits[i] = p;
        }
        decoder = new Decoder(bits[0], bits[1], bits[2], bits[3], bits[4], bits[5], bits[6]);
        decoder.decode();
        decoder.print();

    }
}
