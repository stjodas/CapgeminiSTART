
package Classes;

public class Pessoa {
//Abstração só trás o que é necessário para o programa
    
    //Atributos são as informações do objeto
    private float peso;
    private float altura;

    //Construtor
    //O metodo construtor é chamado quando instancia um objeto
    //Não é necessário a menos que queira passar um valor default
    public Pessoa() {
        System.out.println("");
    }
    
    //Metodos são as ações da que a entidade vai poder fazer
    public float calcularIMC(){
        float imc = peso/(altura*altura);
        return imc;
    }
    
    //Metodos Acessores
    //Dão acesso a entidades externas para acessaram o objeto
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public float getAltura(){
        return altura;
    }
    
}
