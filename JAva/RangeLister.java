class RangeLister {
    // Método para criar um intervalo de números inteiros
    int[] makeRange(int lower, int upper) {
        int[] range = new int[(upper - lower) + 1];
        
        for (int i = 0; i < range.length; i++) {
            range[i] = lower + i; // Evita modificar diretamente o valor de 'lower'
        }
        return range;        
    }

    public static void main(String[] arguments) {
        RangeLister lister = new RangeLister();
        int[] range = lister.makeRange(1, 10);

        System.out.print("The array: [ ");
        for (int num : range) { // Uso de for-each para simplificar
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}