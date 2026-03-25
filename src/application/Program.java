package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Quantos produtos serão cadastrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Produto #" + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Preço: ");
            double price = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();

            Product product = new Product(id, name, price, quantity);
            list.add(product);
        }

        System.out.println("\nLista de produtos:");
        for (Product p : list) {
            System.out.println(p);
        }

        System.out.print("\nDigite o ID do produto para atualizar estoque: ");
        int searchId = sc.nextInt();

        Product product = null;

        for (Product p : list) {
            if (p.getId() == searchId) {
                product = p;
            }
        }

        if (product != null) {
            System.out.print("Digite a quantidade para adicionar ao estoque: ");
            int amount = sc.nextInt();
            product.addStock(amount);

            System.out.println();
            System.out.println("Produto atualizado:");
            System.out.println(product);
        } else {
            System.out.println("Produto não encontrado.");
        }

        sc.close();
    }
}