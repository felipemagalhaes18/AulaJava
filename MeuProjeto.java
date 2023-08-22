// Primeiro programa


public class MeuProjeto {
    public int idade = 36;
    public double peso = 87.3;
    public char letra = 'a';
    public static void main(String[] args){
        MeuProjeto esteProjeto = new MeuProjeto();
        esteProjeto.idade = 17;
        String texto = "Valores: ";
        System.out.println(texto + esteProjeto.idade);
        
    }
}