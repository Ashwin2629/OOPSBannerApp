public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] lines = {
            String.join(" ",
                "OOOOOOOOO", "OOOOOOOOO", "PPPPPPPPP", "SSSSSSSSS"),
            String.join(" ",
                "O       O", "O       O", "P       P", "S        "),
            String.join(" ",
                "O       O", "O       O", "P       P", "S        "),
            String.join(" ",
                "O       O", "O       O", "PPPPPPPPP", "SSSSSSSSS"),
            String.join(" ",
                "O       O", "O       O", "P         ", "        S"),
            String.join(" ",
                "O       O", "O       O", "P         ", "        S"),
            String.join(" ",
                "OOOOOOOOO", "OOOOOOOOO", "P         ", "SSSSSSSSS")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
