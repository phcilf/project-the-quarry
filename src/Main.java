public class Main {

  public static void main(String[] args) {

    //Estamos criando um objeto
    Ryan ryan = new Ryan();

    //Estamos alterando os dados do objeto
    ryan.setNome("Ryan");
    ryan.setInteresseRomantico("Dylan");
    ryan.setIdade(20);
    ryan.setPodcast("Anais Bizarros");

    //Estamos mostrando os dados na tela
    System.out.println("Nome: " + ryan.getNome());
    System.out.println("Interesse Romântico: " + ryan.getInteresseRomantico());
    System.out.println("Idade: " + ryan.getIdade());
    System.out.println("Podcast favorito: " + ryan.getPodcast());

    System.out.println("//////////////////////////////////////////////////////////////////////////////");

    //criando o jacob
    Jacob jacob = new Jacob();

    //definindo o Jacob
    jacob.setNome("Jacob");
    jacob.setInteresseRomantico("Emma");
    jacob.setIdade(19);
    jacob.setPopsAmendoim("Salgadinho Divertido");

    //Apresentando o Jacob
    System.out.println("Nome: " + jacob.getNome());
    System.out.println("Interesse Romântico: " + jacob.getInteresseRomantico());
    System.out.println("Idade: " + jacob.getIdade());
    System.out.println("Adora comer um: " + jacob.getPopsAmendoim());

    //Os métodos gets servem para pegar e retornar um valor
    //Os métodos sets servem para alterar um valor
 }
}
