package Service;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String marca;

    public Produto(int id, String nome, double preco, int quantidadeEstoque, String marca){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.marca = marca;
    }

    public int getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public String getMarca(){
        return marca;
    }

    Produto arroz = new Produto(1, "Arroz ", 5.49, 5, "Camil, 1kg");
    Produto arroz2 = new Produto(2, "Arroz ", 5.75, 15, "Emoções, 1kg");
    Produto arroz3 = new Produto(3, "Arroz Arborio ", 19.90, 5, " La Pastina, 500g");
    Produto espaguete = new Produto(4, "Macarrão Espaguete", 8.78,20,  "Barilla, 500g");
    Produto espaguete2 = new Produto(4, "Macarrão Espaguete", 3.50,10,  "Vitarella, 500g");
    Produto parafuso = new Produto(4, "Macarrão Parafuso", 3.70,10,  "Vitarella, 470g");
    Produto penne = new Produto(7, "Macarrão Penne", 4.20, 12, "Renata, 500g");
    Produto fusilli = new Produto(8, "Macarrão Fusilli", 4.50, 8, "Barilla, 500g");
    Produto leite = new Produto(9, "Leite Integral", 4.89, 30, "Piracanjuba, 1L");
    Produto leite2 = new Produto(10, "Leite Desnatado", 4.60, 25, "Itambé, 1L");
    Produto feijao = new Produto(11, "Feijão Carioca", 7.49, 20, "Kicaldo, 1kg");
    Produto feijao2 = new Produto(12, "Feijão Preto", 8.20, 18, "Camil, 1kg");
    Produto oleo = new Produto(13, "Óleo de Soja", 6.79, 22, "Liza, 900ml");
    Produto oleoGirassol = new Produto(14, "Óleo de Girassol", 9.49, 15, "Soya, 900ml");
    Produto acucar = new Produto(15, "Açúcar Refinado", 4.10, 25, "União, 1kg");
    Produto cafe = new Produto(16, "Café Tradicional", 16.99, 14, "Melitta, 500g");
    Produto cafe2 = new Produto(17, "Café Extra Forte", 17.50, 10, "Pilão, 500g");
    Produto farinha = new Produto(18, "Farinha de Trigo", 5.99, 18, "Dona Benta, 1kg");
    Produto manteiga = new Produto(19, "Manteiga com Sal", 11.90, 12, "Aviação, 200g");
    Produto margarina = new Produto(20, "Margarina", 8.49, 16, "Qualy, 500g");
    Produto picanha = new Produto(21, "Picanha Bovina", 89.90, 6, "Friboi, peça +/-1kg");
    Produto contraFile = new Produto(22, "Contra Filé", 64.50, 10, "Friboi, peça +/-1kg");
    Produto frangoPeito = new Produto(23, "Peito de Frango", 18.99, 20, "Sadia, bandeja 1kg");
    Produto frangoCoxa = new Produto(24, "Coxa de Frango", 15.99, 18, "Perdigão, bandeja 1kg");
    Produto frangoSobrecoxa = new Produto(25, "Sobrecoxa de Frango", 16.49, 15, "Perdigão, bandeja 1kg");
    Produto carneMoida = new Produto(26, "Carne Moída", 32.90, 14, "Friboi, pacote 1kg");
    Produto costela = new Produto(27, "Costela Bovina", 38.50, 12, "Masterboi, peça +/-1.5kg");
    Produto alcatra = new Produto(28, "Alcatra", 59.90, 8, "Friboi, peça +/-1kg");
    Produto lomboSuino = new Produto(29, "Lombo Suíno", 29.90, 10, "Sadia, peça +/-1kg");
    Produto bacon = new Produto(30, "Bacon em Cubos", 14.50, 20, "Sadia, pacote 250g");
    Produto fileMignon = new Produto(31, "Filé Mignon", 99.90, 5, "Friboi, peça +/-800g");
    Produto pernilSuino = new Produto(32, "Pernil Suíno", 26.90, 7, "Sadia, peça +/-2kg");
    Produto linguiçaToscana = new Produto(33, "Linguiça Toscana", 19.99, 20, "Perdigão, pacote 1kg");
    Produto costelinhaSuina = new Produto(34, "Costelinha Suína", 27.90, 10, "Sadia, peça +/-1kg");
    Produto carneSol = new Produto(35, "Carne de Sol", 49.90, 6, "Nordeste, pacote 1kg");
    Produto frangoInteiro = new Produto(36, "Frango Inteiro", 13.99, 12, "Sadia, unidade +/-2kg");
    Produto peitoPeru = new Produto(37, "Peito de Peru", 38.90, 8, "Perdigão, peça +/-1kg");
    Produto aguaMineral = new Produto(51, "Água Mineral Sem Gás", 2.50, 100, "Crystal, garrafa 500ml");
    Produto aguaComGas = new Produto(52, "Água Mineral Com Gás", 3.20, 80, "São Lourenço, garrafa 500ml");
    Produto refrigeranteCoca = new Produto(53, "Refrigerante Coca-Cola", 9.99, 50, "Coca-Cola, garrafa 2L");
    Produto refrigerantePepsi = new Produto(54, "Refrigerante Pepsi", 8.49, 40, "Pepsi, garrafa 2L");
    Produto guaranaAntarctica = new Produto(55, "Refrigerante Guaraná Antarctica", 8.29, 45, "Antarctica, garrafa 2L");
    Produto sucoLaranja = new Produto(56, "Suco de Laranja Integral", 14.90, 30, "Do Bem, garrafa 1L");
    Produto sucoUva = new Produto(57, "Suco de Uva Integral", 17.90, 25, "Aurora, garrafa 1,5L");
    Produto energeticoRedbull = new Produto(58, "Energético", 9.50, 40, "Red Bull, lata 250ml");
    Produto cervejaHeineken = new Produto(59, "Cerveja Heineken Long Neck", 5.99, 60, "Heineken, 330ml");
    Produto cervejaBrahma = new Produto(60, "Cerveja Brahma Lata", 3.50, 70, "Brahma, lata 350ml");
    Produto vinhoTinto = new Produto(61, "Vinho Tinto Seco", 39.90, 15, "Miolo, garrafa 750ml");
    Produto vinhoSuave = new Produto(62, "Vinho Tinto Suave", 24.90, 20, "Aurora, garrafa 750ml");
    Produto chaGelado = new Produto(63, "Chá Gelado de Pêssego", 6.99, 35, "Leão, garrafa 1,5L");
    Produto leiteAchocolatado = new Produto(64, "Leite Achocolatado", 4.49, 50, "Toddynho, caixinha 200ml");
    Produto aguaDeCoco = new Produto(65, "Água de Coco", 5.90, 40, "Kero Coco, garrafa 1L");
    Produto sabonete = new Produto(66, "Sabonete em Barra", 2.99, 100, "Dove, 90g");
    Produto shampoo = new Produto(67, "Shampoo Hidratação", 18.90, 60, "Pantene, 400ml");
    Produto condicionador = new Produto(68, "Condicionador Reconstrução", 19.90, 50, "Tresemmé, 400ml");
    Produto cremeDental = new Produto(69, "Creme Dental", 6.50, 120, "Colgate, 90g");
    Produto desodorante = new Produto(70, "Desodorante Antitranspirante", 11.90, 80, "Rexona, 150ml");
    Produto papelHigienico = new Produto(71, "Papel Higiênico Folha Dupla", 16.99, 40, "Neve, pacote c/12 rolos");
    Produto absorvente = new Produto(72, "Absorvente Noturno", 12.50, 50, "Always, pacote c/8 unidades");
    Produto cotonete = new Produto(73, "Cotonete", 4.99, 60, "Johnson's, pote c/150 unidades");
    Produto detergente = new Produto(74, "Detergente Líquido Neutro", 2.79, 90, "Ypê, 500ml");
    Produto sabaoPo = new Produto(75, "Sabão em Pó", 22.90, 35, "OMO, 2,2kg");
    Produto amaciante = new Produto(76, "Amaciante de Roupas", 14.99, 40, "Comfort, 1,8L");
    Produto desinfetante = new Produto(77, "Desinfetante Pinho", 8.49, 50, "Pinho Sol, 500ml");
    Produto limpavidros = new Produto(78, "Limpador de Vidros", 7.90, 25, "Veja, 500ml");
    Produto multiuso = new Produto(79, "Limpador Multiuso", 6.50, 40, "Veja, 500ml");
    Produto esponja = new Produto(80, "Esponja Multiuso", 3.20, 70, "Scotch-Brite, unidade");
    Produto alcool = new Produto(81, "Álcool Líquido 70%", 6.99, 60, "Asseptgel, 1L");
    Produto leiteIntegral = new Produto(82, "Leite Integral", 4.99, 200, "Itambé, 1L");
    Produto leiteDesnatado = new Produto(83, "Leite Desnatado", 5.20, 150, "Parmalat, 1L");
    Produto queijoMussarela = new Produto(85, "Queijo Mussarela Fatiado", 32.90, 30, "Quatá, pacote 500g");
    Produto queijoPrato = new Produto(86, "Queijo Prato Fatiado", 34.90, 25, "Quatá, pacote 500g");
    Produto requeijao = new Produto(87, "Requeijão Cremoso", 9.49, 50, "Vigor, 250g");
    Produto iogurte = new Produto(88, "Iogurte Natural", 3.90, 100, "Nestlé, pote 170g");
    Produto cremeDeLeite = new Produto(89, "Creme de Leite", 4.29, 80, "Nestlé, lata 300g");
    Produto leiteCondensado = new Produto(90, "Leite Condensado", 5.99, 100, "Moça, lata 395g");
    Produto queijoMinas = new Produto(93, "Queijo Minas Frescal", 27.90, 20, "Italac, 500g");
    Produto queijoParmesao = new Produto(94, "Queijo Parmesão Ralado", 7.99, 100, "Faixa Azul, pacote 100g");
    Produto queijoGorgonzola = new Produto(95, "Queijo Gorgonzola", 42.00, 15, "Vigor, peça 500g");
    Produto queijoBrie = new Produto(96, "Queijo Brie", 59.90, 10, "President, peça 125g");
    Produto queijoCamembert = new Produto(97, "Queijo Camembert", 57.90, 8, "President, peça 125g");
    Produto queijoCoalho = new Produto(98, "Queijo Coalho", 23.50, 25, "Vigor, espeto 500g");
    Produto queijoProvolone = new Produto(99, "Queijo Provolone Defumado", 39.90, 12, "Faixa Azul, peça 1kg");
    Produto queijoRicota = new Produto(100, "Ricota Fresca", 19.90, 18, "Itambé, peça 400g");


    @Override
    public String toString() {
        return "Produto " +
                "Numeração = " + id +
                ", Nome = " + nome +
                ", Preço= R$" + preco +
                ", Quantidade no estoque = " + quantidadeEstoque +
                "Marca: " + marca;
    }

}




