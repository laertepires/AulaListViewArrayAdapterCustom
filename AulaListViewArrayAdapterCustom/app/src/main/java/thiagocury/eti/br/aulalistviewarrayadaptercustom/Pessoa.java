package thiagocury.eti.br.aulalistviewarrayadaptercustom;

import java.io.Serializable;

/**
 * Created by Alunos on 19/12/2016.
 */

public class Pessoa implements Serializable {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getURLHomem(){
        return "https://image.freepik.com/icones-gratis/homem-de-negocios-apontando-para-a-esquerda_318-62535.jpg";
    }

    public String getURLMulher(){
        return "http://images.gofreedownload.net/woman-28905.jpg";
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}//fecha classe
