class StringFormat {
    public static void main(String[] args) {
        double pie = Math.PI;
        double num = 1055123.35;
        System.out.format("%.11f%n", pie);
        System.out.format("$%,.2f%n", num);
    }
}