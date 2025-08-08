public class Main {
    public static void main(String[] args) {

        // Variáveis para armazenar nomes e preços dos produtos
        String item1 = "Camiseta";
        double preco1 = 50.0;

        String item2 = "Calça";
        double preco2 = 120.0;

        // Soma dos preco dos itens
        double total = preco1 + preco2;

        // Cálculo do desconto dos 10%
        double desconto = total * 0.10;
        double totalComDesconto = total - desconto;

        System.out.println("Produto 1: " + item1 + " - R$ " + preco1);
        System.out.println("Produto 2: " + item2 + " - R$ " + preco2);
        System.out.println("Total antes do desconto: R$ " + total);
        System.out.println("Desconto (10%): R$ " + desconto);
        System.out.println("Total com desconto: R$ " + totalComDesconto);
    }
}
