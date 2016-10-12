class Investment {
    public static void main(String[] args) {
        float principal = 14000;
        System.out.println("Initial investment: " + principal);
        principal = principal * 1.4F;
        System.out.println("First year: " + principal);
        principal = principal - 1500F;
        System.out.println("Second year: " + principal);
        principal = principal * 1.12F;
        System.out.println("Third year: " + principal);
    }
}