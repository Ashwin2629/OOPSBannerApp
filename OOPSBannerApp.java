public class OOPSBannerApp {

    public static void main(String[] args) {

        // ========================
        // UC1: Basic Text Output
        // ========================
        System.out.println("UC1 Output:");
        System.out.println("OOPS");

        System.out.println("\n-----------------------------\n");

        // ========================
        // UC2: ASCII Banner Output
        // ========================
        System.out.println("UC2 Output:");

        System.out.println(" *****   *****   ******   ***** ");
        System.out.println("*     * *     *  *     * *     *");
        System.out.println("*     * *     *  *     * *     *");
        System.out.println("*     * *     *  ******   ***** ");
        System.out.println("*     * *     *  *            * ");
        System.out.println("*     * *     *  *            * ");
        System.out.println(" *****   *****   *       *****  ");

        System.out.println("\n-----------------------------\n");

        // ========================
        // UC3: Same Banner using String.join()
        // ========================
        System.out.println("UC3 Output:");

        System.out.println(String.join("\n",
                " *****   *****   ******   *****",
                "*     * *     *  *     * *",
                "*     * *     *  *     * *",
                "*     * *     *  ******   *****",
                "*     * *     *  *            *",
                "*     * *     *  *            *",
                " *****   *****   *       *****"
        ));

        System.out.println("\n-----------------------------\n");

        // ========================
// UC4: Banner using Array & Loop
// ========================
System.out.println("UC4 Output:");

String[] banner = {
    " *****   *****   ******   ***** ",
    "*     * *     *  *     * *     *",
    "*     * *     *  *     * *     *",
    "*     * *     *  ******   ***** ",
    "*     * *     *  *            *",
    "*     * *     *  *            *",
    " *****   *****   *       *****  "
};

for (String line : banner) {
    System.out.println(line);
}
    }
}
